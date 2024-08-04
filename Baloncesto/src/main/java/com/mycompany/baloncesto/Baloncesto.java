/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baloncesto;

import MySQL.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author hernan
 */
public class Baloncesto {

    public static void main(String[] args) {
        Conexion cone = new Conexion();
        cone.getConexion();
        
        CrearEquipo crear = new CrearEquipo();

        while (true) {
            String[] opciones = {"Agregar equipo", "Ver Partido PlayOff", "Salir", "Ver Partido Liga", "Crear Partido"};
            int seleccion = JOptionPane.showOptionDialog(
                null,                        
                "Selecciona una opción:",    
                "Menú Principal",            
                JOptionPane.DEFAULT_OPTION,  
                JOptionPane.INFORMATION_MESSAGE, 
                null,                        
                opciones,                  
                opciones[0]             
            );

            
            switch (seleccion) {
                case 0: 
                    String nombre = JOptionPane.showInputDialog("Introduce el nombre del equipo:");
                    
                    if (nombre != null && !nombre.trim().isEmpty()) {
                        crear.insertarEquipo(nombre);
                        JOptionPane.showMessageDialog(null, "Equipo insertado correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nombre del equipo no válido.");
                    }
                    break;
                case 1: 
                    JOptionPane.showMessageDialog(null, "Partidos Play Off");
                    break;
                case 2: 
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    System.exit(0); 
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Partidos Play Ligas");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }
}

   
