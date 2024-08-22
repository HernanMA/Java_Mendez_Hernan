/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utilidades;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author hernan
 */
public class Propiedades {
    
    public Properties cargarArchivoProperties() throws FileNotFoundException, IOException{
        Properties propiedades = new Properties();
        InputStream archivo = new FileInputStream("/Users/hernan/Hernan Mendez/Java_Mendez_Hernan/SistemaFacturacion/src/main/resources/ConexionDB.properties");
        propiedades.load(archivo);
        return propiedades;
    }

}
