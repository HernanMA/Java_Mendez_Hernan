/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correccionquizs;

/**
 *
 * @author hernan
 */
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Cartera implements PatronCartera {
    private String anho;
    private List<Tarjeta> tarjetas;
    private TarjetaDAO tarjetaDAO;

    public Cartera(String anho) {
        this.anho = anho;
        this.tarjetaDAO = new TarjetaDAO();
        this.tarjetas = tarjetaDAO.listarTarjetas();
    }   

    public void agregarTarjeta(Tarjeta tarjeta) {
        tarjetas.add(tarjeta);
        tarjetaDAO.guardarTarjeta(tarjeta);
    }

    public void imprimirListaDeTarjetas() {
        for (Tarjeta tarjeta : tarjetas) {
            System.out.println("N° de cuenta: " + tarjeta.id + 
                               ", Cuota de manejo: " + tarjeta.calcularCuota() +
                               ", Tipo de tarjeta: " + tarjeta.getTipo() + 
                               ", Mes: " + anho);
        }
    }
}


