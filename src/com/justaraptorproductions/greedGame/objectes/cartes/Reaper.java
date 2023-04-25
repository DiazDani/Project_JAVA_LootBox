package com.justaraptorproductions.greedGame.objectes.cartes;

import com.justaraptorproductions.greedGame.objectes.Jugador;

/**
 * Clase que deriva de Bomba. Dona efecte a les cartes de tipus Reaper.
 * Aquestes cartes provoquen un Game Over automatic. Carta no implementada finalment al joc.
 */
public class Reaper extends Bomba{

    /**
     * Constructor
     * @param tipus
     * Tipus de la carta
     * @param preu
     * Punts que dona la carta
     * @param descripcio
     * Descripció de la carta
     */
    public Reaper( String tipus, int preu, String descripcio) {
        super( tipus, preu, descripcio);
        this.setNom("RIP");
    }
    @Override
    public void efecte(Jugador jugador){
        jugador.setVides(0);
    }
    @Override
    public void puntuacioPartida(Jugador jugador, Carta carta){
        carta.efecte(jugador);
    }

}
