/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correccionquizs;

import java.util.Date;

/**
 *
 * @author hernan
 */
import java.util.Date;

public class Visa extends Tarjeta {
    public Visa(int id, double montoApertura, Date fechaCreacion) {
        super(id, "Visa", montoApertura, fechaCreacion);
    }

    @Override
    public double calcularCuota() {
        return 50000 - Descuento.DIAMANTE.getValorDescontado(montoApertura);
    }
}


