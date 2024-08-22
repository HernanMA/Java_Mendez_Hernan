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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TarjetaDAO {

    public void guardarTarjeta(Tarjeta tarjeta) {
    String sql = "INSERT INTO Tarjeta(tipo, monto_apertura, fecha_creacion) VALUES (?, ?, ?)";
    
    try (Connection conn = Conexion.getConnection(); 
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        
        pstmt.setString(1, tarjeta.getTipo());
        pstmt.setDouble(2, tarjeta.getMontoApertura());
        pstmt.setDate(3, new java.sql.Date(tarjeta.getFechaCreacion().getTime()));
        
        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    public List<Tarjeta> listarTarjetas() {
        List<Tarjeta> tarjetas = new ArrayList<>();
        String sql = "SELECT * FROM Tarjeta";

        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("tarjeta_id");
                String tipo = rs.getString("tipo");
                double montoApertura = rs.getDouble("monto_apertura");
                Date fechaCreacion = new Date(rs.getDate("fecha_creacion").getTime());

                Tarjeta tarjeta = null;
                switch (tipo) {
                    case "Visa":
                        tarjeta = new Visa(id, montoApertura, fechaCreacion);
                        break;
                    case "Nomina":
                        tarjeta = new Nomina(id, montoApertura, fechaCreacion);
                        break;
                    case "Joven":
                        tarjeta = new Joven(id, montoApertura, fechaCreacion);
                        break;
                }

                if (tarjeta != null) {
                    tarjetas.add(tarjeta);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tarjetas;
    }

    public Tarjeta buscarTarjetaPorId(int id) {
        Tarjeta tarjeta = null;
        String sql = "SELECT * FROM Tarjeta WHERE tarjeta_id = ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String tipo = rs.getString("tipo");
                    double montoApertura = rs.getDouble("monto_apertura");
                    Date fechaCreacion = new Date(rs.getDate("fecha_creacion").getTime());

                    switch (tipo) {
                        case "Visa":
                            tarjeta = new Visa(id, montoApertura, fechaCreacion);
                            break;
                        case "Nomina":
                            tarjeta = new Nomina(id, montoApertura, fechaCreacion);
                            break;
                        case "Joven":
                            tarjeta = new Joven(id, montoApertura, fechaCreacion);
                            break;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tarjeta;
    }
}


