/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encantamientos;

/**
 *
 * @author hernan
 */
public class EncantamientoFuego implements Encantamiento {
    @Override
    public void activar() {
        System.out.println("Aura de luz activada.");
    }

    @Override
    public void aplicar() {
        System.out.println("Daño de fuego añadido.");
    }

    @Override
    public void desactivar() {
        System.out.println("Aura de luz desactivada.");
    }
}
