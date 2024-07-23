/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Camper.domain.models;


/**
 *
 * @author hernan
 */
public class Camper {
    
   private int id;
   private String nombre;
   
   public Camper() {}
   
   public Camper(int id, String nombre) {
       this.id = id;
       this.nombre = nombre;
   }
   
   public Camper(String nombre) {
       this.nombre = nombre;
   }
   
   // Getters y setters
   public int getId() {
       return id;
   }
   
   public void setId(int id) {
       this.id = id;
   }
   
   public String getNombre() {
       return nombre;
   }
   
   public void setNombre(String Nombre) {
       this.nombre = nombre;
   }

    public void add(Camper camper) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}


