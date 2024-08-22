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

public class Nomina extends Tarjeta {

    public Nomina(int id, double montoApertura, Date fechaCreacion) {
        super(id, "Nomina", montoApertura, fechaCreacion);
    }

    @Override
    public double calcularCuota() {
        return montoApertura * 0.03;
    }
}

