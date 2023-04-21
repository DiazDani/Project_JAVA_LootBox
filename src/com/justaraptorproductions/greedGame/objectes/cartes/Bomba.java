package com.justaraptorproductions.greedGame.objectes.cartes;

import com.justaraptorproductions.greedGame.objectes.Jugador;

/**
 * Clase que hereda de Carta. Dona efecte a les cartes de tipus bomba.
 * Aquestes cartes restan punts i treuen una vida.
 */
public class Bomba extends Carta{

    /**
     * Constructor
     * @param tipus
     * Tipus de la carta
     * @param preu
     * Punts que dona la carta
     * @param descripcio
     * Descripció de la carta
     */

    public Bomba( String tipus, int preu, String descripcio) {
        super( tipus, preu, descripcio);
        this.setNom("Bomba");
    }

    @Override
    public void efecte(Jugador jugador){
        jugador.setVides(jugador.getVides()-1);
        jugador.estaViu();
    }
    @Override
    public void puntuacioPartida(Jugador jugador, Carta carta){
        carta.efecte(jugador);
        jugador.setPuntsPartida(jugador.getPuntsPartida()+carta.getPreu());
        if(jugador.getPuntsPartida()<0){
            jugador.setPuntsPartida(0);
        }
    }
}
