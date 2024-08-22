/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.correccionquizs;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hernan
 */
public class CorreccionQuizS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese el tipo de tarjeta (Joven/Nomina/Visa)");
        System.out.print("Tipo de tarjeta: ");
        String tipo = scanner.nextLine();

        double montoApertura = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Por favor, ingrese el monto de apertura (ej. 1000");
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
                throw new IllegalArgumentException("Tipo de tarjeta no válido. Debe ser Joven, Nomina, o Visa.");
        }

        TarjetaDAO tarjetaDAO = new TarjetaDAO();
        tarjetaDAO.guardarTarjeta(tarjeta);

        System.out.println("Tarjeta guardada exitosamente.");
    }
}
