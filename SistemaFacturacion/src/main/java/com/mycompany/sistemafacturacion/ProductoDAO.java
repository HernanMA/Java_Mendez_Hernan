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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hernan
 */
public class ProductoDAO {

    private static final Logger logger = Logger.getLogger(ProductoDAO.class.getName());

    public void agregarProducto(Producto producto) {
        validarProducto(producto);

        String sql = "INSERT INTO Producto (Nombre, Descripcion, Precio, Stock) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getInstance().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            prepararSentencia(stmt, producto);
            stmt.executeUpdate();
            logger.log(Level.INFO, "Producto agregado exitosamente: {0}", producto.getNombre());

        } catch (SQLException e) {
            manejarExcepcion("Error al agregar el producto", e);
        }
    }

    // Muestra todos los productos en la base de datos
    public void verProductos() {
        String sql = "SELECT * FROM Producto";

        try (Connection conn = Conexion.getInstance().conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                imprimirProducto(rs);
            }

        } catch (SQLException e) {
            manejarExcepcion("Error al obtener los productos", e);
        }
    }

    public Producto obtenerProductoPorId(int id) {
        validarId(id);

        String sql = "SELECT * FROM Producto WHERE Id = ?";
        Producto producto = null;

        try (Connection conn = Conexion.getInstance().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    producto = crearProductoDesdeResultSet(rs);
                }
            }

        } catch (SQLException e) {
            manejarExcepcion("Error al obtener el producto con ID: " + id, e);
        }

        return producto;
    }


    private void validarProducto(Producto producto) {
        if (producto == null || producto.getNombre() == null || producto.getDescripcion() == null) {
            throw new IllegalArgumentException("Producto o sus atributos no pueden ser nulos.");
        }
    }

    private void validarId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("El ID debe ser mayor a cero.");
        }
    }

    private void prepararSentencia(PreparedStatement stmt, Producto producto) throws SQLException {
        stmt.setString(1, producto.getNombre());
        stmt.setString(2, producto.getDescripcion());
        stmt.setDouble(3, producto.getPrecio());
        stmt.setInt(4, producto.getStock());
    }

    private Producto crearProductoDesdeResultSet(ResultSet rs) throws SQLException {
        return new Producto(
            rs.getInt("Id"),
            rs.getString("Nombre"),
            rs.getString("Descripcion"),
            rs.getDouble("Precio"),
            rs.getInt("Stock")
        );
    }

    private void imprimirProducto(ResultSet rs) throws SQLException {
        System.out.println("ID: " + rs.getInt("Id"));
        System.out.println("Nombre: " + rs.getString("Nombre"));
        System.out.println("Descripción: " + rs.getString("Descripcion"));
        System.out.println("Precio: " + rs.getDouble("Precio"));
        System.out.println("Stock: " + rs.getInt("Stock"));
        System.out.println("------------------------------");
    }

    private void manejarExcepcion(String mensaje, SQLException e) {
        logger.log(Level.SEVERE, mensaje, e);
        throw new RuntimeException(mensaje, e);
    }
}
