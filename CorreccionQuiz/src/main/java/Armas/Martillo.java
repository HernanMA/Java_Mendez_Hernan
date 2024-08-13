/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armas;

/**
 *
 * @author hernan
 */
public class Martillo extends Arma {
    
    public void blandir() {
        encantamiento.activar();
    }

    
    public void atacar() {
        encantamiento.aplicar();
    }

    
    public void soltar() {
        encantamiento.desactivar();
    }
}
