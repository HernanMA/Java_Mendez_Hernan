/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.correccionquiz;

import Armas.Arma;
import Armas.Armeria;
import Armas.HerreroElfo;
import Armas.HerreroEnano;
import Encantamientos.Encantamiento;
import Encantamientos.EncantamientoFactory;
import Personajes.Heroe;
import Personajes.Villano;
import Personajes.VillanoFactory;

/**
 *
 * @author hernan
 */
public class CorreccionQuiz {

    public static void main(String[] args) {
        Heroe heroe = Heroe.getInstance();

        Villano villano1 = VillanoFactory.crearVillano("Tipo1");
        Villano villano2 = VillanoFactory.crearVillano("Tipo1");

        Encantamiento encantamientoFuego = EncantamientoFactory.obtenerEncantamiento("Fuego");
        Encantamiento encantamientoVorpal = EncantamientoFactory.obtenerEncantamiento("Vorpal");
 
        Armeria armeriaElfica = new Armeria(new HerreroElfo());
        Arma espadaElfica = armeriaElfica.crearArma("Espada");
        espadaElfica.setEncantamiento(encantamientoFuego);
        espadaElfica.blandir();
        espadaElfica.atacar();
        espadaElfica.soltar();

        Armeria armeriaEnana = new Armeria(new HerreroEnano());
        Arma martilloEnano = armeriaEnana.crearArma("Martillo");
        martilloEnano.setEncantamiento(encantamientoVorpal);
        martilloEnano.blandir();
        martilloEnano.atacar();
        martilloEnano.soltar();
    }
}
