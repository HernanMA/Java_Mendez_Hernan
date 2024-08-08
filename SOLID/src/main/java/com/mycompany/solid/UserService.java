/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.solid;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hernan
 */
public class UserService {
    // Simular una base de datos de usuarios
    private Map<String, User> userDatabase = new HashMap<>();

    public void addUser(User user) {
        userDatabase.put(user.getEmail(), user);
    }

    public User getUserByEmail(String email) {
        return userDatabase.get(email);
    }
}

