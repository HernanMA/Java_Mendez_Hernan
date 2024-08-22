/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correccionquizs;

/**
 *
 * @author hernan
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TarjetaDAO {

    public void guardarTarjeta(Tarjeta tarjeta) {
        String sql = "INSERT INTO Tarjeta(tipo, monto_apertura, fecha_creacion) VALUES (?, ?, ?)";

        try (Connection conn = Conexion.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, tarjeta.getTipo());
            pstmt.setDouble(2, tarjeta.getMontoApertura());
            pstmt.setDate(3, new java.sql.Date(tarjeta.getFechaCreacion().getTime()));
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



