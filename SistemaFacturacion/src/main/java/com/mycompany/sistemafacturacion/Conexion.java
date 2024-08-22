/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemafacturacion;

import com.mycompany.utilidades.Propiedades;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author hernan
 */
public class Conexion {

    private Conexion() {
    }

    private static Conexion instancia = null;
    Propiedades properties = new Propiedades();

    public Connection conectar() throws SQLException {  
        Connection conexion = null;
        try {
            Properties propiedades = properties.cargarArchivoProperties();

            String user = propiedades.getProperty("conexion.user");
            String password = propiedades.getProperty("conexion.password");
            String url = propiedades.getProperty("conexion.url");
            
            conexion = DriverManager.getConnection(url, user, password);

            if (conexion != null) {
                JOptionPane.showMessageDialog(null, "Conexion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Error en la conexion");
            }

        } catch (IOException | SQLException error) {
            System.out.println(error);
        } 
        
        return conexion;  
    }

    public static Conexion getInstance() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
}

