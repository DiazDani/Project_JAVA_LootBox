package com.justaraptorproductions.greedGame.objectes.cartes;

import com.justaraptorproductions.greedGame.objectes.Jugador;

/**
 * Clase que hereda de Carta. Dona efecte a les cartes de tipus Item.
 * Aquestes cartes sumen punts.
 */
public class Item extends Carta {
    /**
     * Constructor
     *  @param tipus
     * Tipus de la carta
     * @param preu
     * Punts que dona la carta
     * @param descripcio
     * Descripció de la carta
     */
    public Item( String tipus, int preu, String descripcio) {
        super(tipus, preu, descripcio);
        this.setNom("item");
    }

    @Override
    public void puntuacioPartida(Jugador jugador, Carta carta){
        jugador.setPuntsPartida(jugador.getPuntsPartida()+carta.getPreu());
    }

}

