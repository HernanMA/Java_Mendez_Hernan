package com.mycompany.work;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hernan
 */
import java.util.Scanner;

public class Menu {
    
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingrese la opción que quiere hacer:");
            System.out.println("1. Añadir Camper");
            System.out.println("2. Ver Camper");
            System.out.println("3. Actualizar Camper");
            System.out.println("4. Eliminar Camper");
            System.out.println("5. Ver Trainer");
            System.out.println("6. Actualizar Trainer");
            System.out.println("7. Ver Salones");
            System.out.println("8. Asignar Notas");
            System.out.println("9. Salir");
            opcion = scanner.nextInt();
            String opciones = null;

            switch(opcion) {
                case 1:
                    opciones = "Añadir Camper";
                    break;
                case 2: 
                    opciones = "Ver Camper";
                    break;
                case 3:
                    opciones = "Actualizar Camper";
                    break;
                case 4:
                    opciones = "Eliminar Camper";
                    break;
                case 5:
                    opciones = "Ver Trainer";
                    break;
                case 6:
                    opciones = "Actualizar Trainer";
                    break;
                case 7:
                    opciones = "Ver Salones";
                    break;
                case 8:
                    opciones = "Asignar Notas";
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no encontrada");
                    break;
            }

            if (opciones != null && opcion != 9) {
                System.out.println("Opción seleccionada: " + opciones);
            }
            
        } while (opcion != 9);

        scanner.close();
    }
}

