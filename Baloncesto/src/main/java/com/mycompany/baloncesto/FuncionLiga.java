/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baloncesto;

import MySQL.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hernan
 */
public class FuncionLiga {
    private List<Partido_Liga> ListaPartidos;
    private Conexion conexion = new Conexion(); 

    public List<Partido_Liga> ListarTodos() {
        ListaPartidos = new ArrayList<>();
        
        String sql = "SELECT * FROM Partido_Liga";
        Connection con = conexion.getConexion(); 

        if (con != null) {
            try (Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    int partidoId = rs.getInt("Partido_Id");
                    String jornada = rs.getString("Jornada");
                    
                    
                    Partido_Liga partido = new Partido_Liga();
                    partido.setPartido_Id(partidoId);
                    partido.setJornada(jornada);
                    
                    ListaPartidos.add(partido);
                }

            } catch (SQLException e) {
                System.err.println("Error en la consulta: " + e);
                JOptionPane.showMessageDialog(null, "Error en la consulta: " + e.toString());
            } finally {
                try {
                    con.close(); 
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión: " + e);
                }
            }
        }
        
        return ListaPartidos; 
    }
}
