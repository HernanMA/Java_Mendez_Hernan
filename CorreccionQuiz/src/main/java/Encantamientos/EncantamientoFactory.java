/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encantamientos;

/**
 *
 * @author hernan
 */
import java.util.*;

public class EncantamientoFactory {
    private static final Map<String, Encantamiento> encantamientos = new HashMap<>();

    public static Encantamiento obtenerEncantamiento(String tipo) {
        Encantamiento encantamiento = encantamientos.get(tipo);
        if (encantamiento == null) {
            switch (tipo) {
                case "Fuego":
                    encantamiento = new EncantamientoFuego();
                    break;
                case "Vorpal":
                    encantamiento = new EncantamientoVorpal();
                    break;
            }
            encantamientos.put(tipo, encantamiento);
        }
        return encantamiento;
    }
}
