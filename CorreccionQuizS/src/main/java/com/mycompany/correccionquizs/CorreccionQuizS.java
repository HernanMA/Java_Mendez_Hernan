/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.correccionquizs;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hernan
 */
public class CorreccionQuizS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TarjetaDAO tarjetaDAO = new TarjetaDAO();

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Guardar una nueva tarjeta");
            System.out.println("2. Ver todas las tarjetas");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            int opcion = -1;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    guardarTarjeta(scanner, tarjetaDAO);
                    break;
                case 2:
                    verTodasLasTarjetas(tarjetaDAO);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
        }
    }

    private static void guardarTarjeta(Scanner scanner, TarjetaDAO tarjetaDAO) {
        System.out.println("Por favor, ingrese el tipo de tarjeta (Joven/Nomina/Visa)");
        System.out.print("Tipo de tarjeta: ");
        String tipo = scanner.nextLine().trim();

        if (!tipo.equalsIgnoreCase("joven") && 
            !tipo.equalsIgnoreCase("nomina") && 
            !tipo.equalsIgnoreCase("visa")) {
            System.out.println("Error: Tipo de tarjeta no válido. Debe ser Joven, Nomina, o Visa.");
            return; 
        }

        double montoApertura = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Por favor, ingrese el monto de apertura (ej. 1000).");
                System.out.print("Monto de apertura: ");
                montoApertura = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido en formato numérico (ej. 1000.50).");
                scanner.nextLine(); 
            }
        }

        Tarjeta tarjeta;
        switch (tipo.toLowerCase()) {
            case "joven":
                tarjeta = new Joven(1, montoApertura, new Date());
                break;
            case "nomina":
                tarjeta = new Nomina(1, montoApertura, new Date());
                break;
            case "visa":
                tarjeta = new Visa(1, montoApertura, new Date());
                break;
            default:
                System.out.println("Error inesperado.");
                return; 
        }

        tarjetaDAO.guardarTarjeta(tarjeta);
        System.out.println("Tarjeta guardada exitosamente.");
    }

    private static void verTodasLasTarjetas(TarjetaDAO tarjetaDAO) {
        System.out.println("Listando todas las tarjetas:");
        List<Tarjeta> tarjetas = tarjetaDAO.listarTarjetas();
        
        if (tarjetas.isEmpty()) {
            System.out.println("No hay tarjetas registradas.");
        } else {
            for (Tarjeta t : tarjetas) {
                System.out.println("ID: " + t.getId() + ", Tipo: " + t.getTipo() + 
                                   ", Monto Apertura: " + t.getMontoApertura() + 
                                   ", Fecha Creación: " + t.getFechaCreacion());
            }
        }

        System.out.println("Presione Enter para volver al menú principal...");
        new Scanner(System.in).nextLine();
}

}
