package com.justaraptorproductions.greedGame.altres;

import com.justaraptorproductions.greedGame.objectes.Jugador;


import java.util.Random;

/**
 * Clase que aplica i mostra per pantalla de forma aleatoria una de les cartes del mazo.
 */
public class BuclePrincipal {
    public static Random rng= new Random(System.currentTimeMillis());


    /**
     * @param jugador
     * Jugador. A aquest objecte se li aplicaran els diferents efectes de les cartes.
     * @param creacioObjectes
     * Mazo de cartes del joc. D'aqui es treuen les diferentes cartes.
     */
    public static void TreureCarta(Jugador jugador,CreacioObjectes creacioObjectes) {
        int seleccio =rng.nextInt(0,20);
        creacioObjectes.getMazo().get(seleccio).puntuacioPartida(jugador,creacioObjectes.getMazo().get(seleccio));
        System.out.println("Vides restants: "+jugador.getVides()+"         Punts:"+jugador.getPuntsPartida());
        System.out.println("----------------------------------------------------------\n\n");
        System.out.println(creacioObjectes.getMazo().get(seleccio).toString());


    }
}
