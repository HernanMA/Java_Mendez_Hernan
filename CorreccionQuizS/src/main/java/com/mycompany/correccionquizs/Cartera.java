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

public class Cartera {
    private int id;
    private String nombreCliente;
    private List<Tarjeta> tarjetas;

    public Cartera(int id, String nombreCliente) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.tarjetas = new ArrayList<>();
    }

    public void agregarTarjeta(Tarjeta tarjeta) {
        tarjetas.add(tarjeta);
    }

    public void calcularCuotas() {
        for (Tarjeta tarjeta : tarjetas) {
            System.out.println("Cuota de la tarjeta " + tarjeta.getTipo() + ": " + tarjeta.calcularCuota());
        }
    }
}


