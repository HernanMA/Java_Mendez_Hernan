/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baloncesto;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hernan
 */
public class Baloncesto {

    public static void main(String[] args) {
        PartidoManager partidoManager = new PartidoManager();
        
        while (true) {
            String[] opciones = {"Añadir un partido PlayOff", "Añadir un partido Liga", "Ver Partidos", "Salir"};
            int opcion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción:",
                "Menú",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            switch (opcion) {
                case 0:
                    partidoManager.addPartidoPlayOff();
                    break;
                case 1:
                    partidoManager.addPartidoLiga();
                    break;
                case 2:
                    partidoManager.verPartidos();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    return; 
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}


   
