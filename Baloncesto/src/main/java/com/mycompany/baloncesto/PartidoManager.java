/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baloncesto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hernan
 */
public class PartidoManager {   
    private Conexion conexion;

    public PartidoManager() {
        this.conexion = new Conexion();
    }

    private Connection getConnection() throws SQLException {
        return conexion.getConexion();
    }

    public void addPartidoPlayOff(Scanner scanner) {
        try (Connection conn = getConnection()) {
            System.out.println("Ingrese la fecha del partido:");
            String fecha = scanner.nextLine();

            System.out.println("Ingrese el ID del equipo local:");
            int equipoLocalId = scanner.nextInt();

            System.out.println("Ingrese el ID del equipo visitante:");
            int equipoVisitanteId = scanner.nextInt();
            
            System.out.println("Ingrese las cestas del equipo local:");
            int cestasLocal = scanner.nextInt();
            
            System.out.println("Ingrese las cestas del equipo visitante:");
            int cestasVisitante = scanner.nextInt();
            
            System.out.println("¿El partido está finalizado? (true/false):");
            boolean finalizado = scanner.nextBoolean();
            scanner.nextLine();  // Limpiar el buffer

            System.out.println("Ingrese la ronda del playoff:");
            String ronda = scanner.nextLine();

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
                
                System.out.println("Partido PlayOff añadido exitosamente.");
            }
        } catch (SQLException e) {
            System.err.println("Error al añadir partido PlayOff: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al añadir partido PlayOff: " + e.getMessage());
        }
    }

    public void addPartidoLiga(Scanner scanner) {
        try (Connection conn = getConnection()) {
            System.out.println("Ingrese la fecha del partido:");
            String fecha = scanner.nextLine();

            System.out.println("Ingrese el ID del equipo local:");
            int equipoLocalId = scanner.nextInt();

            System.out.println("Ingrese el ID del equipo visitante:");
            int equipoVisitanteId = scanner.nextInt();
            
            System.out.println("Ingrese las cestas del equipo local:");
            int cestasLocal = scanner.nextInt();
            
            System.out.println("Ingrese las cestas del equipo visitante:");
            int cestasVisitante = scanner.nextInt();
            
            System.out.println("¿El partido está finalizado? (true/false):");
            boolean finalizado = scanner.nextBoolean();
            scanner.nextLine();  // Limpiar el buffer

            System.out.println("Ingrese la jornada de la liga:");
            String jornada = scanner.nextLine();

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
                
                System.out.println("Partido Liga añadido exitosamente.");
            }
        } catch (SQLException e) {
            System.err.println("Error al añadir partido Liga: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al añadir partido Liga: " + e.getMessage());
        }
    }
}

