/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaquiz2;

/**
 *
 * @author hernan
 */
public class Nomina extends Tarjeta {

    public Nomina(double montoApertura, String numeroCuenta) {
        super(montoApertura, numeroCuenta);
    }

    @Override
    public double cuotaDeManejo() {
        double descuento = Descuento.PLATINO.getValorDescontado(montoApertura);
        return 50000 - descuento;
    }
}

