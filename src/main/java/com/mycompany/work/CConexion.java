/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.work;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author hernan
 */
public class CConexion {
    Connection conectar = null;
    String usuario = "root";
    String contrasenia = "1101685607";
    String bd = "the_environmental_ones";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
    
    public Connection estabableceConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Se conectó a la base de datos "); 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conectó a la base de datos" + e.toString());
        }
        return null;
    }
    
}
