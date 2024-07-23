/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modulos;


/**
 *
 * @author hernan
 */
public class Camper {
    
   private int id;
   private String nombre;
   private String apellidos;
   private String salon;
   private String trainer;
   
   public Camper() {}
   
   public Camper(int id, String nombre, String apellidos, String salon, String trainer) {
       this.id = id;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.salon = salon;
       this.trainer = trainer;
   }
   
   public Camper(String nombre) {
       this.nombre = nombre;
   }
   
   // Getters y setters
   public int getID() {
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
}


