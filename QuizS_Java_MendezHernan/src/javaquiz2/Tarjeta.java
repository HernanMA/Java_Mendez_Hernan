/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaquiz2;

/**
 *
 * @author hernan
 */
public abstract class Tarjeta {
    protected double montoApertura;
    protected String numeroCuenta;

    public Tarjeta(double montoApertura, String numeroCuenta) {
        this.montoApertura = montoApertura;
        this.numeroCuenta = numeroCuenta;
    }

    public abstract double cuotaDeManejo();
}

