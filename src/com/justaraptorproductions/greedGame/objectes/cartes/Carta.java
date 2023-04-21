package com.justaraptorproductions.greedGame.objectes.cartes;

import com.justaraptorproductions.greedGame.objectes.Jugador;

public abstract class Carta {
    private String nom;
    private String tipus;
    private int preu;

    private String descripcio;

    public Carta( String tipus, int preu, String descripcio) {
        this.nom = "<UNDEFINED>";
        this.tipus = tipus;
        this.preu = preu;
        this.descripcio = descripcio;
    }


    /*GETTERS I SETTES*/
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    /*METODES A SOBRESCRIURE*/
    public void efecte(Jugador jugador){
        //aqui afegirem les funcions de les cartes especials (ex: bomba)
    }
    public void puntuacioPartida(Jugador jugador, Carta carta){
        carta.efecte(jugador);
        jugador.setPuntsPartida(jugador.getPuntsPartida()+carta.getPreu());
    }

    /*ALTRES METODES*/

    public void puntuacioTotal(Jugador jugador){
        jugador.setPuntsTotals(jugador.getPuntsTotals()+ jugador.getPuntsPartida());
    }

    @Override
    public String toString() {
        return "-----------------" +
                "\n  " + nom + '\'' +
                "\n-----------------" +
                "\n  " + preu +" punts" +
                "\n  efecte: "  +descripcio ;
    }
}
