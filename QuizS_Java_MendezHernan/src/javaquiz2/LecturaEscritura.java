/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaquiz2;

/**
 *
 * @author hernan
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LecturaEscritura {

    public List<Tarjeta> leerTarjetas(String fileName) {
        List<Tarjeta> tarjetas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                String tipo = datos[0];
                double montoApertura = Double.parseDouble(datos[1]);
                String numeroCuenta = datos[2];
                
                switch (tipo) {
                    case "Joven":
                        tarjetas.add(new Joven(montoApertura, numeroCuenta));
                        break;
                    case "Nomina":
                        tarjetas.add(new Nomina(montoApertura, numeroCuenta));
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tarjetas;
    }
}

