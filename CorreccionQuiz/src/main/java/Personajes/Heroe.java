/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author hernan
 */

public class Heroe {
    private static Heroe instance;

    private Heroe() {
    }

    public static Heroe getInstance() {
        if (instance == null) {
            instance = new Heroe();
        }
        return instance;
    }

}
