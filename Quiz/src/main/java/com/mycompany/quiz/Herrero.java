/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz;

/**
 *
 * @author hernan
 */
interface Herrero {
    Arma fabricarArma();
}

class HerreroElfico implements Herrero {
    public Arma fabricarArma() {
        return new Espada(); 
    }
}

class HerreroEnano implements Herrero {
    public Arma fabricarArma() {
        return new Martillo();
    }
}

class Armeria {
    private Herrero herrero;

    public Armeria(Herrero herrero) {
        this.herrero = herrero;
    }

    public Arma crearArma() {
        return herrero.fabricarArma();
    }
}

