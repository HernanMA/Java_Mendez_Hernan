/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correccionquizs;

/**
 *
 * @author hernan
 */
import java.util.Date;

public class Joven extends Tarjeta {

    public Joven(int id, double montoApertura, Date fechaCreacion) {
        super(id, "Joven", montoApertura, fechaCreacion);
    }

    @Override
    public double calcularCuota() {
        return montoApertura * 0.05;
    }
}



