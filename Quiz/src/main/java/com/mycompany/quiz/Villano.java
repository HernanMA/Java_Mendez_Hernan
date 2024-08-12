/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz;

/**
 *
 * @author hernan
 */
public class Villano {
    private static final int LIMITE_VILLANOS = 5;
    private static int contadorVillanos = 0;

    public Villano() {
        if (contadorVillanos >= LIMITE_VILLANOS) {
            throw new RuntimeException("Límite de villanos alcanzado");
        }
        contadorVillanos++;
    }

    protected void finalize() throws Throwable {
        contadorVillanos--;
        super.finalize();
    }
}

