/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemafacturacion;

/**
 *
 * @author hernan
 */
public enum TipoCliente implements CalculadorDescuento {
    REGULAR(0.0) {
        @Override
        public double calcular(double total) {
            return total;  // Sin descuento
        }
    },  
    PREMIUM(0.10) {
        @Override
        public double calcular(double total) {
            return total * (1 - getDescuento());
        }
    }, 
    VIP(0.20) {
        @Override
        public double calcular(double total) {
            return total * (1 - getDescuento());
        }
    };  

    private final double descuento;

    TipoCliente(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }
}

