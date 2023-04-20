package com.justaraptorproductions.greedGame.objectes.cartes;

import com.justaraptorproductions.greedGame.objectes.Jugador;

public class Vida extends Carta {

    /**
     *
     * @param tipus
     * @param preu
     * @param descripcio
     */

    public Vida( String tipus, int preu, String descripcio) {
        super( tipus, preu, descripcio);
        this.setNom("Vida extra");
    }

    public void efecte(Jugador jugador){
        jugador.setVides(jugador.getVides()+1);

    }

    public void puntuacioPartida(Jugador jugador, Vida vida){
        vida.efecte(jugador);
        jugador.setPuntsPartida(jugador.getPuntsPartida()+vida.getPreu());
    }

}
