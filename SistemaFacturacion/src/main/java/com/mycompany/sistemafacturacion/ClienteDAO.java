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
public class ClienteDAO {
    public void agregarCliente(Cliente cliente) {
    String sql = "INSERT INTO Cliente (Nombre, Apellidos, Email, Telefono, TipoCliente) VALUES (?, ?, ?, ?, ?)";

    try (Connection conn = Conexion.getInstance().conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, cliente.getNombre());
        stmt.setString(2, cliente.getApellidos());
        stmt.setString(3, cliente.getEmail());
        stmt.setString(4, cliente.getTelefono());
        stmt.setString(5, cliente.getTipoCliente().name());  
        stmt.executeUpdate();

        System.out.println("Cliente agregado exitosamente.");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    public void verClientes() {
    String sql = "SELECT * FROM Cliente";

    try (Connection conn = Conexion.getInstance().conectar();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("Id"));
            System.out.println("Nombre: " + rs.getString("Nombre"));
            System.out.println("Apellidos: " + rs.getString("Apellidos"));
            System.out.println("Email: " + rs.getString("Email"));
            System.out.println("Teléfono: " + rs.getString("Telefono"));
            System.out.println("Tipo Cliente: " + rs.getString("TipoCliente"));
            System.out.println("------------------------------");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    public Cliente obtenerClientePorId(int id) {
    String sql = "SELECT * FROM Cliente WHERE Id = ?";

    try (Connection conn = Conexion.getInstance().conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            return new Cliente(
                rs.getInt("Id"),
                rs.getString("Nombre"),
                rs.getString("Apellidos"),
                rs.getString("Email"),
                rs.getString("Telefono"),
                TipoCliente.valueOf(rs.getString("TipoCliente"))  
            );
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return null;  
}



}
    