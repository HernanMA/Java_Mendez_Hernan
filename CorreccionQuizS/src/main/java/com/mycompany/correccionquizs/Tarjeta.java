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

public abstract class Tarjeta {
    protected int id;
    protected String tipo;
    protected double montoApertura;
    protected Date fechaCreacion;

    public Tarjeta(int id, String tipo, double montoApertura, Date fechaCreacion) {
        this.id = id;
        this.tipo = tipo;
        this.montoApertura = montoApertura;
        this.fechaCreacion = fechaCreacion;
    }

    public abstract double calcularCuota();

    
    public String getTipo() {
        return tipo;
    }

    public double getMontoApertura() {
        return montoApertura;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    int getId() {
        return id;
    }
}

