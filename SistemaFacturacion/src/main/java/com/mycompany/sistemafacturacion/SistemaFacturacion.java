/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemafacturacion;

import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hernan
 */

public class SistemaFacturacion {

    private static final Logger logger = Logger.getLogger(SistemaFacturacion.class.getName());
    private static final ClienteDAO clienteDAO = new ClienteDAO();
    private static final ProductoDAO productoDAO = new ProductoDAO();
    private static final FacturaDAO facturaDAO = new FacturaDAO();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

            try {
                manejarOpcion(opcion);
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Error al procesar la opción seleccionada", e);
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("---- Menú Principal ----");
        System.out.println("1. Agregar Cliente");
        System.out.println("2. Ver Clientes");
        System.out.println("3. Agregar Producto");
        System.out.println("4. Ver Productos");
        System.out.println("5. Crear Factura");
        System.out.println("6. Ver Facturas");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerOpcion() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); // Limpiar el buffer
            logger.log(Level.WARNING, "Entrada no válida, intente de nuevo.");
            return -1; // Retorna una opción inválida para manejar en el switch
        }
    }

    private static void manejarOpcion(int opcion) {
        scanner.nextLine(); // Limpiar el buffer después de leer la opción
        switch (opcion) {
            case 1:
                agregarCliente();
                break;
            case 2:
                verClientes();
                break;
            case 3:
                agregarProducto();
                break;
            case 4:
                verProductos();
                break;
            case 5:
                crearFactura();
                break;
            case 6:
                verFacturas();
                break;
            case 0:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida, intente de nuevo.");
                break;
        }
    }

    private static void agregarCliente() {
        try {
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
            System.out.println("Cliente agregado exitosamente.");
        } catch (IllegalArgumentException e) {
            logger.log(Level.WARNING, "Tipo de cliente no válido.", e);
            System.out.println("Tipo de cliente no válido, intente de nuevo.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error al agregar cliente.", e);
            System.out.println("Error al agregar cliente, intente de nuevo.");
        }
    }

    private static void verClientes() {
    try {
        clienteDAO.verClientes().forEach(cliente -> {
            System.out.println(cliente);  // Imprime cada cliente en el formato definido en toString()
        });
    } catch (Exception e) {
        logger.log(Level.SEVERE, "Error al ver clientes.", e);
        System.out.println("Error al ver clientes, intente de nuevo.");
    }
}

    private static void agregarProducto() {
        try {
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
            System.out.println("Producto agregado exitosamente.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error al agregar producto.", e);
            System.out.println("Error al agregar producto, intente de nuevo.");
        }
    }

    private static void verProductos() {
        try {
            productoDAO.verProductos(); // Este método debería imprimir los productos en consola
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error al ver productos.", e);
            System.out.println("Error al ver productos, intente de nuevo.");
        }
    }

    private static void crearFactura() {
    try {
        System.out.print("Ingrese ID del cliente: ");
        int clienteId = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Optional<Cliente> clienteOptional = clienteDAO.obtenerClientePorId(clienteId);
        if (!clienteOptional.isPresent()) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        Cliente clienteFactura = clienteOptional.get();
        Factura factura = new Factura(0, clienteFactura);

        char agregarMasProductos = 'n'; // Inicialización de la variable
        do {
            System.out.print("Ingrese ID del producto: ");
            int productoId = scanner.nextInt();
            System.out.print("Ingrese cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            Producto productoFactura = productoDAO.obtenerProductoPorId(productoId);
            if (productoFactura == null) {
                System.out.println("Producto no encontrado.");
                continue;
            }

            factura.agregarProducto(productoFactura, cantidad);

            System.out.print("¿Desea agregar otro producto? (s/n): ");
            agregarMasProductos = scanner.nextLine().charAt(0);
        } while (agregarMasProductos == 's' || agregarMasProductos == 'S');

        facturaDAO.crearFactura(factura);
        System.out.println("Factura creada exitosamente.");
    } catch (Exception e) {
        logger.log(Level.SEVERE, "Error al crear factura.", e);
        System.out.println("Error al crear factura, intente de nuevo.");
    }
}


    private static void verFacturas() {
        try {
            facturaDAO.verFacturas(); // Este método debería imprimir las facturas en consola
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error al ver facturas.", e);
            System.out.println("Error al ver facturas, intente de nuevo.");
        }
    }
}
