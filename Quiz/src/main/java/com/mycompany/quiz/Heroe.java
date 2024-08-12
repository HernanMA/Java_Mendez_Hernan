/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz;

/**
 *
 * @author hernan
 */
public class Heroe {
    private static Heroe instanciaUnica;

    private Heroe() {
        // Constructor privado para evitar instanciación externa
    }

    public static synchronized Heroe obtenerInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Heroe();
        }
        return instanciaUnica;
    }

}

