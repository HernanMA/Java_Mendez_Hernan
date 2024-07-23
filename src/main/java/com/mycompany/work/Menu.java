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
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la opción que quiere hacer: ");
        
        int opcion = leer.nextInt();
        String opciones = null;
        
        switch(opcion) {
            
            case 1:
                opciones = "Añadir Camper";
                break;
            case 2: 
                opciones = "Ver camper";
                break;
            case 3:
                opciones = "Actualizar camper";
                break;
            case 4:
                opciones = "Eliminar camper";
                break;
            case 5:
                opciones = "Ver trainer";
                break;
            case 6:
                opciones = "Actualizar trainer";
                break;
            case 7:
                opciones = "Ver salones";
                break;
            case 8:
                opciones = "Asignar notas";
                break;
            default:
                System.out.println("Opción no encontrada");
        }
        
        System.out.println("Opción invalida");
    }
    
        
}
