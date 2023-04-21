package com.justaraptorproductions.greedGame.altres;

import com.justaraptorproductions.greedGame.objectes.Jugador;


import java.util.Random;

public class BuclePrincipal {
    public static Random rng= new Random(System.currentTimeMillis());





    public static void TreureCarta(Jugador jugador,CreacioObjectes creacioObjectes) {
        int seleccio =rng.nextInt(0,11);
        creacioObjectes.getMazo().get(seleccio).puntuacioPartida(jugador,creacioObjectes.getMazo().get(seleccio));
        System.out.println(creacioObjectes.getMazo().get(seleccio).toString());


    }
}
