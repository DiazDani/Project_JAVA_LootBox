package com.justaraptorproductions.greedGame.objectes.cartes;

import com.justaraptorproductions.greedGame.objectes.Jugador;

public class Item extends Carta {

    public Item( String tipus, int preu, String descripcio) {
        super(tipus, preu, descripcio);
        this.setNom("item");
    }

    @Override
    public void puntuacioPartida(Jugador jugador, Carta carta){
        jugador.setPuntsPartida(jugador.getPuntsPartida()+carta.getPreu());
    }

}

