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
    private int id;
    private String fecha;
    private int equipoLocalId;
    private int equipoVisitanteId;
    private int cestasLocal;
    private int cestasVisitante;
    private boolean finalizado;
    private String tipo; // 'Liga' o 'PlayOff'

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEquipoLocalId() {
        return equipoLocalId;
    }

    public void setEquipoLocalId(int equipoLocalId) {
        this.equipoLocalId = equipoLocalId;
    }

    public int getEquipoVisitanteId() {
        return equipoVisitanteId;
    }

    public void setEquipoVisitanteId(int equipoVisitanteId) {
        this.equipoVisitanteId = equipoVisitanteId;
    }

    public int getCestasLocal() {
        return cestasLocal;
    }

    public void setCestasLocal(int cestasLocal) {
        this.cestasLocal = cestasLocal;
    }

    public int getCestasVisitante() {
        return cestasVisitante;
    }

    public void setCestasVisitante(int cestasVisitante) {
        this.cestasVisitante = cestasVisitante;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

}
