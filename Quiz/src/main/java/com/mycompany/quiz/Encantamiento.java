/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz;

/**
 *
 * @author hernan
 */
interface Encantamiento {
    void activar();
    void aplicar();
    void desactivar();
}

class EncantamientoFuego implements Encantamiento {
    public void activar() {
        System.out.println("Aura de fuego activada.");
    }

    public void aplicar() {
        System.out.println("Daño de fuego añadido.");
    }

    public void desactivar() {
        System.out.println("Aura de fuego desactivada.");
    }
}

class EncantamientoVorpal implements Encantamiento {
    public void activar() {
        System.out.println("Arma se vuelve roja.");
    }

    public void aplicar() {
        System.out.println("Incremento en ataque crítico.");
    }

    public void desactivar() {
        System.out.println("Efecto Vorpal desactivado.");
    }
}

abstract class Arma {
    protected Encantamiento encantamiento;

    public void setEncantamiento(Encantamiento encantamiento) {
        this.encantamiento = encantamiento;
    }

    public void blandir() {
        if (encantamiento != null) {
            encantamiento.activar();
        }
    }

    public void atacar() {
        if (encantamiento != null) {
            encantamiento.aplicar();
        }
    }

    public void soltar() {
        if (encantamiento != null) {
            encantamiento.desactivar();
        }
    }
}

class Espada extends Arma {
    // Implementación específica de Espada
}

class Martillo extends Arma {
    // Implementación específica de Martillo
}

