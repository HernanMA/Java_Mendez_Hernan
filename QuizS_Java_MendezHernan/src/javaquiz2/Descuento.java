/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaquiz2;

/**
 *
 * @author hernan
 */
public enum Descuento {
    BASICO(0.11),
    PLATINO(0.15),
    DIAMANTE(0.18);

    private final double valorDescuento;

    Descuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public double getValorDescontado(double monto) {
        return monto * valorDescuento;
    }
}

