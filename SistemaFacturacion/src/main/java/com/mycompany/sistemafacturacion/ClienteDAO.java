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
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hernan
 */

public class ClienteDAO {

    private static final Logger logger = Logger.getLogger(ClienteDAO.class.getName());

    public void agregarCliente(Cliente cliente) {
        String sql = "INSERT INTO Cliente (Nombre, Apellidos, Email, Telefono, TipoCliente) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getInstance().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            prepararSentencia(stmt, cliente);
            stmt.executeUpdate();
            logger.log(Level.INFO, "Cliente agregado exitosamente: {0}", cliente.getNombre());

        } catch (SQLException e) {
            manejarExcepcion("Error al agregar el cliente", e);
        }
    }

    public List<Cliente> verClientes() {
        String sql = "SELECT * FROM Cliente";
        List<Cliente> clientes = new ArrayList<>();

        try (Connection conn = Conexion.getInstance().conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                clientes.add(crearClienteDesdeResultSet(rs));
            }

        } catch (SQLException e) {
            manejarExcepcion("Error al obtener los clientes", e);
        }

        return clientes;
    }

    public Optional<Cliente> obtenerClientePorId(int id) {
        String sql = "SELECT * FROM Cliente WHERE Id = ?";

        try (Connection conn = Conexion.getInstance().conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(crearClienteDesdeResultSet(rs));
                }
            }

        } catch (SQLException e) {
            manejarExcepcion("Error al obtener el cliente con ID: " + id, e);
        }

        return Optional.empty();
    }


    private void prepararSentencia(PreparedStatement stmt, Cliente cliente) throws SQLException {
        stmt.setString(1, cliente.getNombre());
        stmt.setString(2, cliente.getApellidos());
        stmt.setString(3, cliente.getEmail());
        stmt.setString(4, cliente.getTelefono());
        stmt.setString(5, cliente.getTipoCliente().name());
    }

    private Cliente crearClienteDesdeResultSet(ResultSet rs) throws SQLException {
        return new Cliente(
            rs.getInt("Id"),
            rs.getString("Nombre"),
            rs.getString("Apellidos"),
            rs.getString("Email"),
            rs.getString("Telefono"),
            TipoCliente.valueOf(rs.getString("TipoCliente"))
        );
    }

    private void manejarExcepcion(String mensaje, SQLException e) {
        logger.log(Level.SEVERE, mensaje, e);
        throw new RuntimeException(mensaje, e);
    }
}
