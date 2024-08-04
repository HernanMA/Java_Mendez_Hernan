/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MySQL;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author hernan
 */
public class Conexion {

        private Connection con;

        public Connection getConexion() {
            Properties props = new Properties();
            try (InputStream input = getClass().getClassLoader().getResourceAsStream("Config.properties")) {
                if (input == null) {
                    throw new IllegalStateException("Archivo Config.properties no encontrado");
                }

                props.load(input);

                String url = props.getProperty("db.url");
                String user = props.getProperty("db.user");
                String password = props.getProperty("db.password");

                if (url == null || user == null || password == null) {
                    throw new IllegalStateException("Una o más propiedades de conexión no están definidas");
                }

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);
                System.out.println("Conexión exitosa a la base de datos");
            } catch (IOException | ClassNotFoundException | SQLException | IllegalStateException e) {
                System.err.println("Error en la conexión :(, error: " + e);
                JOptionPane.showMessageDialog(null, "Error en la conexión: " + e.toString());
            }
            return con;
        }
}