package com.mycompany.work;

import com.mycompany.work.Database.CConexion;
import java.sql.Connection;

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
        System.out.println("Hello world!");
   }
}
