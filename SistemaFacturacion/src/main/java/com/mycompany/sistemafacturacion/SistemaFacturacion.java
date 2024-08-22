/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemafacturacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author hernan
 */

import java.util.Scanner;

public class SistemaFacturacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteDAO clienteDAO = new ClienteDAO();
        ProductoDAO productoDAO = new ProductoDAO();
        FacturaDAO facturaDAO = new FacturaDAO();
        int opcion;

        do {
            System.out.println("---- Menú Principal ----");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Ver Clientes");
            System.out.println("3. Agregar Producto");
            System.out.println("4. Ver Productos");
            System.out.println("5. Crear Factura");
            System.out.println("6. Ver Facturas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Ingrese email: ");
                    String email = scanner.nextLine();
                    System.out.print("Ingrese teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese tipo de cliente (REGULAR, PREMIUM, VIP): ");
                    String tipoClienteInput = scanner.nextLine().toUpperCase();

                    TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteInput);

                    Cliente cliente = new Cliente(0, nombre, apellidos, email, telefono, tipoCliente);
                    clienteDAO.agregarCliente(cliente);
                    break;

                case 2:
                    clienteDAO.verClientes();
                    break;

                case 3:
                    System.out.print("Ingrese nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Ingrese descripción del producto: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Ingrese precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese stock del producto: ");
                    int stock = scanner.nextInt();

                    Producto producto = new Producto(0, nombreProducto, descripcion, precio, stock);
                    productoDAO.agregarProducto(producto);
                    break;

                case 4:
                    productoDAO.verProductos();
                    break;

                case 5:
                    System.out.print("Ingrese ID del cliente: ");
                    int clienteId = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    Cliente clienteFactura = clienteDAO.obtenerClientePorId(clienteId);
                    Factura factura = new Factura(0, clienteFactura);

                    char agregarMasProductos;
                    do {
                        System.out.print("Ingrese ID del producto: ");
                        int productoId = scanner.nextInt();
                        System.out.print("Ingrese cantidad: ");
                        int cantidad = scanner.nextInt();
                        scanner.nextLine(); 

                        Producto productoFactura = productoDAO.obtenerProductoPorId(productoId);
                        factura.agregarProducto(productoFactura, cantidad);

                        System.out.print("¿Desea agregar otro producto? (s/n): ");
                        agregarMasProductos = scanner.nextLine().charAt(0);
                    } while (agregarMasProductos == 's' || agregarMasProductos == 'S');

                    facturaDAO.crearFactura(factura);
                    break;

                case 6:
                    facturaDAO.verFacturas();
                    break;

                case 7:
                    
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}

