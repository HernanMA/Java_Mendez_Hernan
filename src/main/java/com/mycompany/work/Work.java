package com.mycompany.work;

import com.mycompany.work.Database.CConexion;
import java.sql.Connection;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hernan
 */

public class Work {
    public static void main(String[] args) {
        
        CConexion objetoConexion = new CConexion();
        objetoConexion.estabableceConexion();
        
        Menu menu = new Menu();
        menu.mostrarMenu();
        
        System.out.println("Hello world!");
   }
}
