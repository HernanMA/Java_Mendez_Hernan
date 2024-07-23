/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Camper.adapters.out;

import Camper.domain.models.Camper;
import Camper.infrastructure.camperRepository;
import java.sql.*;
import java.util.ArrayList;
import java.util.Optional;

        
/**
 *
 * @author hernan
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author hernan
 */

public class CamperMySQLRepository implements CamperRepository {
    private final String url;
    private final String user;
    private final String password;

    public CamperMySQLRepository(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }
    
    @Override 
    public void save(Camper camper) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO camper (nombre) VALUES (?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, camper.getNombre());
                statement.setString(2, camper.getNombre());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void update(Camper camper) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "UPDATE camper SET nombre = ? WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, camper.getNombre());
                statement.setInt(2, camper.getId());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override 
    public Optional<Camper> findById(int id) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM camper WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id);
                
                try(ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        Camper camper = new Camper (
                        resultSet.getInt("id"),
                        resultSet.getString("nombre")
                        );
                        return Optional.of(camper);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
    
    @Override 
    public void delete(int id) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "DELETE FROM camper WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override 
    public List<Camper> findAll() {
        List<Camper> camper = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM camper";
            try (PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Camper camper = new Camper (
                    resultSet.getInt("id"),
                    resultSet.getString("nombre")
                    );
                    camper.add(camper);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return camper;
    }
}