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
        Scanner scanner = new Scanner(System.in);
        PartidoManager partidoManager = new PartidoManager();

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Añadir un partido PlayOff");
            System.out.println("2. Añadir un partido Liga");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    partidoManager.addPartidoPlayOff(scanner);
                    break;
                case 2:
                    partidoManager.addPartidoLiga(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;  // Terminar el programa
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}



   
