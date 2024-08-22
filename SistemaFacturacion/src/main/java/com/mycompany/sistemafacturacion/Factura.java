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

public class Factura {
    private int id;
    private Cliente cliente;
    private List<Producto> productos;
    private List<Integer> cantidades;
    private double total;

    public Factura(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.cantidades = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        this.productos.add(producto);
        this.cantidades.add(cantidad);
        this.total += producto.getPrecio() * cantidad;
    }

    public void aplicarDescuento() {
        this.total = cliente.getTipoCliente().calcular(this.total);  
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

    public List<Integer> getCantidades() {
        return cantidades;
    }

    public double getTotal() {
        return total;
    }
}
