/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armas;

/**
 *
 * @author hernan
 */
public class Espada extends Arma {
    @Override
    public void blandir() {
        encantamiento.activar();
    }

    @Override
    public void atacar() {
        encantamiento.aplicar();
    }

    @Override
    public void soltar() {
        encantamiento.desactivar();
    }
}

