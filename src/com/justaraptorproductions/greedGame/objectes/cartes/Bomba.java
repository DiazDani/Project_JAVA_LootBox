package com.justaraptorproductions.greedGame.objectes.cartes;

import com.justaraptorproductions.greedGame.objectes.Jugador;

public class Bomba extends Carta{

    /*AQUESTA CARTA TREURA UNA VIDA AL JUGADOR*/
    public Bomba( String tipus, int preu, String descripcio) {
        super( tipus, preu, descripcio);
        this.setNom("Bomba");
    }

    @Override
    public void efecte(Jugador jugador){
        jugador.setVides(jugador.getVides()-1);
        jugador.estaViu();
    }

    public void puntuacioPartida(Jugador jugador, Bomba bomba){
        bomba.efecte(jugador);
        jugador.setPuntsPartida(jugador.getPuntsPartida()+bomba.getPreu());
    }
}
