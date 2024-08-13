/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encantamientos;

/**
 *
 * @author hernan
 */
public class EncantamientoVorpal implements Encantamiento {
    @Override
    public void activar() {
        System.out.println("Arma se ve roja.");
    }

    @Override
    public void aplicar() {
        System.out.println("Incrementa posibilidad de ataque crítico.");
    }

    @Override
    public void desactivar() {
        System.out.println("Arma deja de ser roja.");
    }
}
