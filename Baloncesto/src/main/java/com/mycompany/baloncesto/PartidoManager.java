/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baloncesto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hernan
 */
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PartidoManager {   
    private Conexion conexion;

    public PartidoManager() {
        this.conexion = new Conexion();
    }

    private Connection getConnection() throws SQLException {
        return conexion.getConexion();
    }

    public void addPartidoPlayOff() {
        try (Connection conn = getConnection()) {
            String fecha = JOptionPane.showInputDialog("Ingrese la fecha del partido:");
            int equipoLocalId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del equipo local:"));
            int equipoVisitanteId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del equipo visitante:"));
            int cestasLocal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las cestas del equipo local:"));
            int cestasVisitante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las cestas del equipo visitante:"));
            boolean finalizado = JOptionPane.showConfirmDialog(null, "¿El partido está finalizado?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            String ronda = JOptionPane.showInputDialog("Ingrese la ronda del playoff:");

            String sqlPartido = "INSERT INTO Partido (Fecha, Equipo_Local_Id, Equipo_Visitante_Id, Cestas_Local, Cestas_Visitante, Finalizado, Tipo) VALUES (?, ?, ?, ?, ?, ?, 'PlayOff')";
            String sqlPlayOff = "INSERT INTO Partido_PlayOff (Partido_Id, Ronda) VALUES (LAST_INSERT_ID(), ?)";

            try (PreparedStatement stmtPartido = conn.prepareStatement(sqlPartido);
                 PreparedStatement stmtPlayOff = conn.prepareStatement(sqlPlayOff)) {
                // Insertar en la tabla Partido
                stmtPartido.setString(1, fecha);
                stmtPartido.setInt(2, equipoLocalId);
                stmtPartido.setInt(3, equipoVisitanteId);
                stmtPartido.setInt(4, cestasLocal);
                stmtPartido.setInt(5, cestasVisitante);
                stmtPartido.setBoolean(6, finalizado);
                stmtPartido.executeUpdate();

                // Insertar en la tabla Partido_PlayOff
                stmtPlayOff.setString(1, ronda);
                stmtPlayOff.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Partido PlayOff añadido exitosamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al añadir partido PlayOff: " + e.getMessage());
        }
    }

    public void addPartidoLiga() {
        try (Connection conn = getConnection()) {
            String fecha = JOptionPane.showInputDialog("Ingrese la fecha del partido:");
            int equipoLocalId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del equipo local:"));
            int equipoVisitanteId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del equipo visitante:"));
            int cestasLocal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las cestas del equipo local:"));
            int cestasVisitante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las cestas del equipo visitante:"));
            boolean finalizado = JOptionPane.showConfirmDialog(null, "¿El partido está finalizado?", "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
            String jornada = JOptionPane.showInputDialog("Ingrese la jornada de la liga:");

            String sqlPartido = "INSERT INTO Partido (Fecha, Equipo_Local_Id, Equipo_Visitante_Id, Cestas_Local, Cestas_Visitante, Finalizado, Tipo) VALUES (?, ?, ?, ?, ?, ?, 'Liga')";
            String sqlLiga = "INSERT INTO Partido_Liga (Partido_Id, Jornada) VALUES (LAST_INSERT_ID(), ?)";

            try (PreparedStatement stmtPartido = conn.prepareStatement(sqlPartido);
                 PreparedStatement stmtLiga = conn.prepareStatement(sqlLiga)) {
                // Insertar en la tabla Partido
                stmtPartido.setString(1, fecha);
                stmtPartido.setInt(2, equipoLocalId);
                stmtPartido.setInt(3, equipoVisitanteId);
                stmtPartido.setInt(4, cestasLocal);
                stmtPartido.setInt(5, cestasVisitante);
                stmtPartido.setBoolean(6, finalizado);
                stmtPartido.executeUpdate();

                // Insertar en la tabla Partido_Liga
                stmtLiga.setString(1, jornada);
                stmtLiga.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Partido Liga añadido exitosamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al añadir partido Liga: " + e.getMessage());
        }
    }
    
    public void verPartidos() {
        
        String sqlPartido = "SELECT p.Id, p.Fecha, p.Equipo_Local_Id, eLocal.Nombre AS Equipo_Local, p.Equipo_Visitante_Id, eVisitante.Nombre AS Equipo_Visitante, p.Cestas_Local, p.Cestas_Visitante, p.Finalizado, p.Tipo " +
                            "FROM Partido p " +
                            "LEFT JOIN Equipo eLocal ON p.Equipo_Local_Id = eLocal.Id " +
                            "LEFT JOIN Equipo eVisitante ON p.Equipo_Visitante_Id = eVisitante.Id";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sqlPartido);
             ResultSet rs = stmt.executeQuery()) {
            
            StringBuilder sb = new StringBuilder();
            while (rs.next()) {
                int id = rs.getInt("Id");
                String fecha = rs.getString("Fecha");
                int equipoLocalId = rs.getInt("Equipo_Local_Id");
                String equipoLocalNombre = rs.getString("Equipo_Local");
                int equipoVisitanteId = rs.getInt("Equipo_Visitante_Id");
                String equipoVisitanteNombre = rs.getString("Equipo_Visitante");
                int cestasLocal = rs.getInt("Cestas_Local");
                int cestasVisitante = rs.getInt("Cestas_Visitante");
                boolean finalizado = rs.getBoolean("Finalizado");
                String tipo = rs.getString("Tipo");

                sb.append("ID: ").append(id).append("\n");
                sb.append("Fecha: ").append(fecha).append("\n");
                sb.append("Equipo Local ID: ").append(equipoLocalId).append(" (Nombre: ").append(equipoLocalNombre).append(")\n");
                sb.append("Equipo Visitante ID: ").append(equipoVisitanteId).append(" (Nombre: ").append(equipoVisitanteNombre).append(")\n");
                sb.append("Cestas Local: ").append(cestasLocal).append("\n");
                sb.append("Cestas Visitante: ").append(cestasVisitante).append("\n");
                sb.append("Finalizado: ").append(finalizado).append("\n");
                sb.append("Tipo: ").append(tipo).append("\n");
                sb.append("--------------------------\n");
            }
            
            JTextArea textArea = new JTextArea(sb.toString());
            textArea.setEditable(false);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            
            JScrollPane scrollPane = new JScrollPane(textArea);
            
            JFrame frame = new JFrame("Partidos");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.getContentPane().add(scrollPane);
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null); 
            frame.setVisible(true);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ver los partidos: " + e.getMessage());
        }
    }
}


