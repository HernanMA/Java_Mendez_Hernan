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
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author hernan
 */

public class FacturaDAO {

    private static final Logger logger = Logger.getLogger(FacturaDAO.class.getName());

    public void crearFactura(Factura factura) {
        factura.aplicarDescuento();
        String sqlFactura = "INSERT INTO Factura (ClienteId, Fecha, Total) VALUES (?, NOW(), ?)";
        String sqlFacturaProducto = "INSERT INTO FacturaProducto (FacturaId, ProductoId, Cantidad, PrecioUnitario, Subtotal) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getInstance().conectar()) {
            conn.setAutoCommit(false);

            int facturaId = insertarFactura(conn, factura, sqlFactura);
            insertarProductos(conn, factura, facturaId, sqlFacturaProducto);

            conn.commit();
            logger.log(Level.INFO, "Factura creada exitosamente: {0}", facturaId);
        } catch (SQLException e) {
            manejarTransaccionFallida(e);
        }
    }
    
    public void verFacturas() {
        String sql = "SELECT Factura.Id, Cliente.Nombre, Cliente.Apellidos, Factura.Fecha, Factura.Total " +
                     "FROM Factura JOIN Cliente ON Factura.ClienteId = Cliente.Id";

        try (Connection conn = Conexion.getInstance().conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                imprimirFactura(rs);
            }
        } catch (SQLException e) {
            manejarExcepcion("Error al obtener las facturas", e);
        }
    }


    private int insertarFactura(Connection conn, Factura factura, String sqlFactura) throws SQLException {
        try (PreparedStatement stmtFactura = conn.prepareStatement(sqlFactura, Statement.RETURN_GENERATED_KEYS)) {
            stmtFactura.setInt(1, factura.getCliente().getId());
            stmtFactura.setDouble(2, factura.getTotal());
            stmtFactura.executeUpdate();

            try (ResultSet rs = stmtFactura.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                } else {
                    throw new SQLException("No se pudo obtener el ID de la factura generada.");
                }
            }
        }
    }

    private void insertarProductos(Connection conn, Factura factura, int facturaId, String sqlFacturaProducto) throws SQLException {
        try (PreparedStatement stmtProducto = conn.prepareStatement(sqlFacturaProducto)) {
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
        }
    }

    private void imprimirFactura(ResultSet rs) throws SQLException {
        System.out.println("Factura ID: " + rs.getInt("Id"));
        System.out.println("Cliente: " + rs.getString("Nombre") + " " + rs.getString("Apellidos"));
        System.out.println("Fecha: " + rs.getTimestamp("Fecha"));
        System.out.println("Total: " + rs.getDouble("Total"));
        System.out.println("------------------------------");
    }

    private void manejarTransaccionFallida(SQLException e) {
        logger.log(Level.SEVERE, "Error al realizar la transacción, se procederá a hacer rollback", e);
        throw new RuntimeException("Error en la transacción, se realizó rollback", e);
    }

    private void manejarExcepcion(String mensaje, SQLException e) {
        logger.log(Level.SEVERE, mensaje, e);
        throw new RuntimeException(mensaje, e);
    }
}


