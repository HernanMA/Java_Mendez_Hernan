/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemafacturacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hernan
 */
public class FacturaDAO {

    public void crearFactura(Factura factura) {
        factura.aplicarDescuento();  

        String sqlFactura = "INSERT INTO Factura (ClienteId, Fecha, Total) VALUES (?, NOW(), ?)";
        String sqlFacturaProducto = "INSERT INTO FacturaProducto (FacturaId, ProductoId, Cantidad, PrecioUnitario, Subtotal) VALUES (?, ?, ?, ?, ?)";

        Connection conn = null;

        try {
            conn = Conexion.getInstance().conectar();
            conn.setAutoCommit(false);

            PreparedStatement stmtFactura = conn.prepareStatement(sqlFactura, Statement.RETURN_GENERATED_KEYS);
            stmtFactura.setInt(1, factura.getCliente().getId());
            stmtFactura.setDouble(2, factura.getTotal());
            stmtFactura.executeUpdate();

            ResultSet rs = stmtFactura.getGeneratedKeys();
            int facturaId = 0;
            if (rs.next()) {
                facturaId = rs.getInt(1);
            }

            PreparedStatement stmtProducto = conn.prepareStatement(sqlFacturaProducto);
            for (int i = 0; i < factura.getProductos().size(); i++) {
                Producto producto = factura.getProductos().get(i);
                int cantidad = factura.getCantidades().get(i);

                stmtProducto.setInt(1, facturaId);
                stmtProducto.setInt(2, producto.getId());
                stmtProducto.setInt(3, cantidad);
                stmtProducto.setDouble(4, producto.getPrecio());
                stmtProducto.setDouble(5, producto.getPrecio() * cantidad);
                stmtProducto.executeUpdate();
            }

            conn.commit();
            System.out.println("Factura creada exitosamente.");
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void verFacturas() {
        String sql = "SELECT Factura.Id, Cliente.Nombre, Cliente.Apellidos, Factura.Fecha, Factura.Total " +
                     "FROM Factura JOIN Cliente ON Factura.ClienteId = Cliente.Id";

        try (Connection conn = Conexion.getInstance().conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("Factura ID: " + rs.getInt("Id"));
                System.out.println("Cliente: " + rs.getString("Nombre") + " " + rs.getString("Apellidos"));
                System.out.println("Fecha: " + rs.getTimestamp("Fecha"));
                System.out.println("Total: " + rs.getDouble("Total"));
                System.out.println("------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

