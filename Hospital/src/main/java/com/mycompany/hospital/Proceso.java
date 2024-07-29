/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author hernan
 */
public class Proceso {
    public void ejecutar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/Hospital";
            String user = "root";
            String password = "1101685607";

            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            
            // Aquí puedes ejecutar consultas SQL usando statement

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}