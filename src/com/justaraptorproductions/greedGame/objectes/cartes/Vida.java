package com.justaraptorproductions.greedGame.objectes.cartes;

import com.justaraptorproductions.greedGame.objectes.Jugador;

/**
 * Clase que hereda de Carta. Dona efecte a les cartes de tipus Vida.
 * Aquestes cartes sumen una vida extra i donen punts
 */
public class Vida extends Carta {


    /**
     * Constructor
     * @param tipus
     * Tipus de la carta
     * @param preu
     * Punts que dona la carta
     * @param descripcio
     * Descripció de la carta
     */
    public Vida( String tipus, int preu, String descripcio) {
        super( tipus, preu, descripcio);
        this.setNom("Vida extra");
    }






}
