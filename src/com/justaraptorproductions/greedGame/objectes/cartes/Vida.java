package com.justaraptorproductions.greedGame.objectes.cartes;

import com.justaraptorproductions.greedGame.objectes.Jugador;

public class Vida extends Carta {



    public Vida( String tipus, int preu, String descripcio) {
        super( tipus, preu, descripcio);
        this.setNom("Vida extra");
    }

    public void efecte(Jugador jugador){
        jugador.setVides(jugador.getVides()+1);

    }

    public void puntuacioPartida(Jugador jugador, Carta carta){
        carta.efecte(jugador);
        jugador.setPuntsPartida(jugador.getPuntsPartida()+carta.getPreu());
    }

}
