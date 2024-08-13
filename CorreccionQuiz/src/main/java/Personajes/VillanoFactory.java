/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author hernan
 */
import Personajes.VillanoTipo1;
import java.util.*;

public class VillanoFactory {
    private static final int MAX_VILLANOS = 5;
    private static Map<String, List<Villano>> villanosMap = new HashMap<>();

    public static Villano crearVillano(String tipo) {
        List<Villano> villanos = villanosMap.getOrDefault(tipo, new ArrayList<>());

        if (villanos.size() < MAX_VILLANOS) {
            Villano villano = null;
            switch (tipo) {
                case "Tipo1":
                    villano = new VillanoTipo1();
                    break;
                case "Tipo2":
                    villano = new VillanoTipo2();
                    break;
            }
            villanos.add(villano);
            villanosMap.put(tipo, villanos);
            return villano;
        } else {
            throw new RuntimeException("Se ha alcanzado el límite máximo de villanos del tipo: " + tipo);
        }
    }
}
