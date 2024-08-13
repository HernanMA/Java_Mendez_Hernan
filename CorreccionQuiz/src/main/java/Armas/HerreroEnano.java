/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armas;

/**
 *
 * @author hernan
 */
public class HerreroEnano implements Herrero {
    public Arma crearArma(String tipo) {
        switch (tipo) {
            case "Espada":
                return new Espada();
            case "Martillo":
                return new Martillo();
        }
        return null;
    }
}
