/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.correccionquizs;

/**
 *
 * @author hernan
 */
public enum Descuento {
    BASICO(0.05), 
    PLATINO(0.10), 
    DIAMANTE(0.15);

    private final double porcentaje;

    Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public double getValorDescontado(double monto) {
        return monto * (1 - porcentaje);
    }
}

