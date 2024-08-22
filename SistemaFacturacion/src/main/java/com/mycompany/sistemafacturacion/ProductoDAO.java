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
public class ProductoDAO {
    public void agregarProducto(Producto producto) {
    String sql = "INSERT INTO Producto (Nombre, Descripcion, Precio, Stock) VALUES (?, ?, ?, ?)";

    try (Connection conn = Conexion.getInstance().conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, producto.getNombre());
        stmt.setString(2, producto.getDescripcion());
        stmt.setDouble(3, producto.getPrecio());
        stmt.setInt(4, producto.getStock());
        stmt.executeUpdate();

        System.out.println("Producto agregado exitosamente.");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    public void verProductos() {
    String sql = "SELECT * FROM Producto";

    try (Connection conn = Conexion.getInstance().conectar();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("Id"));
            System.out.println("Nombre: " + rs.getString("Nombre"));
            System.out.println("Descripción: " + rs.getString("Descripcion"));
            System.out.println("Precio: " + rs.getDouble("Precio"));
            System.out.println("Stock: " + rs.getInt("Stock"));
            System.out.println("------------------------------");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    public Producto obtenerProductoPorId(int id) {
        String sql = "SELECT * FROM Producto WHERE Id = ?";
        Producto producto = null;

        try (Connection conn = Conexion.getInstance().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                producto = new Producto(
                    rs.getInt("Id"),
                    rs.getString("Nombre"),
                    rs.getString("Descripcion"),
                    rs.getDouble("Precio"),
                    rs.getInt("Stock")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return producto;
    }


}
