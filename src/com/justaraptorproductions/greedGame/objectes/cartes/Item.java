package com.justaraptorproductions.greedGame.objectes.cartes;

import com.justaraptorproductions.greedGame.objectes.Jugador;

public class Item extends Carta {

    public Item( String tipus, int preu, String descripcio) {
        super(tipus, preu, descripcio);
        this.setNom("item");
    }

    public void puntuacioPartida(Jugador jugador, Item item){
        jugador.setPuntsPartida(jugador.getPuntsPartida()+item.getPreu());
    }

}

