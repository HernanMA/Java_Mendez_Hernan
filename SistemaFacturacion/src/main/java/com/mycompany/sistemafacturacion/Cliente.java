/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemafacturacion;

/**
 *
 * @author hernan
 */

public class Cliente {
    private int id;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private TipoCliente tipoCliente;

    public Cliente(int id, String nombre, String apellidos, String email, String telefono, TipoCliente tipoCliente) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
               "Nombre: " + nombre + "\n" +
               "Apellidos: " + apellidos + "\n" +
               "Email: " + email + "\n" +
               "Teléfono: " + telefono + "\n" +
               "TipoCliente: " + tipoCliente + "\n" +
               "------------------------------";
    }


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
