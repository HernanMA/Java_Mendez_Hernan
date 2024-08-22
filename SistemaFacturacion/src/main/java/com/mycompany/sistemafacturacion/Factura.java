/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemafacturacion;

/**
 *
 * @author hernan
 */

import java.util.List;
import java.util.ArrayList;

import java.util.List;
import java.util.ArrayList;

public class Factura {
    private int id;
    private Cliente cliente;
    private List<Producto> productos;
    private double total;

    public Factura(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        this.productos.add(producto);
        this.total += producto.getPrecio() * cantidad;
    }

    public void aplicarDescuento(CalculadorDescuento calculador) {
        this.total = calculador.calcular(this.total);
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}