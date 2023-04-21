package com.justaraptorproductions.greedGame.objectes.cartes;

import com.justaraptorproductions.greedGame.objectes.Jugador;

public class Reaper extends Bomba{

    /*AQUESTA CARTA ACTIVARÁ UNA MORT INSTANTANEA. GAME OVER */
    public Reaper( String tipus, int preu, String descripcio) {
        super( tipus, preu, descripcio);
        this.setNom("RIP");
    }
    @Override
    public void efecte(Jugador jugador){
        jugador.setVides(0);
    }

}
