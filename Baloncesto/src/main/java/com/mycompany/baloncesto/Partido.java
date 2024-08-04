/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baloncesto;

/**
 *
 * @author hernan
 */
public class Partido {
    private int Id;
    private String Fecha;
    private int Equipo_Local_Id;
    private int Equipo_Visitante_Id;
    private int Cestas_Local;
    private int Cestas_Visitante;
    private boolean Finalizado;
    private String Tipo;
    private int Jornada;
    private String Ronda;
    private String Ganador;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getEquipo_Local_Id() {
        return Equipo_Local_Id;
    }

    public void setEquipo_Local_Id(int Equipo_Local_Id) {
        this.Equipo_Local_Id = Equipo_Local_Id;
    }

    public int getEquipo_Visitante_Id() {
        return Equipo_Visitante_Id;
    }

    public void setEquipo_Visitante_Id(int Equipo_Visitante_Id) {
        this.Equipo_Visitante_Id = Equipo_Visitante_Id;
    }

    public int getCestas_Local() {
        return Cestas_Local;
    }

    public void setCestas_Local(int Cestas_Local) {
        this.Cestas_Local = Cestas_Local;
    }

    public int getCestas_Visitante() {
        return Cestas_Visitante;
    }

    public void setCestas_Visitante(int Cestas_Visitante) {
        this.Cestas_Visitante = Cestas_Visitante;
    }

    public boolean isFinalizado() {
        return Finalizado;
    }

    public void setFinalizado(boolean Finalizado) {
        this.Finalizado = Finalizado;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getJornada() {
        return Jornada;
    }

    public void setJornada(int Jornada) {
        this.Jornada = Jornada;
    }

    public String getRonda() {
        return Ronda;
    }

    public void setRonda(String Ronda) {
        this.Ronda = Ronda;
    }

    public String getGanador() {
        return Ganador;
    }

    public void setGanador(String Ganador) {
        this.Ganador = Ganador;
    }

    
    
}
