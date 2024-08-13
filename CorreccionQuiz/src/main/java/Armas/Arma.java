/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armas;

import Encantamientos.Encantamiento;

/**
 *
 * @author hernan
 */
public abstract class Arma {
    protected Encantamiento encantamiento;

    public void setEncantamiento(Encantamiento encantamiento) {
        this.encantamiento = encantamiento;
    }

    public abstract void blandir();
    public abstract void atacar();
    public abstract void soltar();
}

