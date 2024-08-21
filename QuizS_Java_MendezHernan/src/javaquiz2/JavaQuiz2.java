/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaquiz2;

import java.util.List;

/**
 *
 * @author hernan
 */
public class JavaQuiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hola hola = new Hola();
        hola.setVisible(true);
        
        LecturaEscritura lectorEscritor = new LecturaEscritura();
        Cartera cartera = new Cartera("2024");

        List<Tarjeta> tarjetas = lectorEscritor.leerTarjetas("datosTarjetas.txt");
              
        for (Tarjeta tarjeta : tarjetas) {
            cartera.agregarTarjeta(tarjeta);
        }

        cartera.imprimirListaDeTarjetas();

        lectorEscritor.escribirTarjetas("reporte.txt", tarjetas);
    }
        
        
}
