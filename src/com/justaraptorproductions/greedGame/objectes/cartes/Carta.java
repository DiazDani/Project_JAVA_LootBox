package com.justaraptorproductions.greedGame.objectes.cartes;

import com.justaraptorproductions.greedGame.objectes.Jugador;

/**
 * Metode abstracte del que deriven els diferents tipus de cartes.
 * Cada carta te un nom, un tipus, un preu i una descripcio.
 */
public abstract class Carta {
    private String nom;
    private String tipus;
    private int preu;

    private String descripcio;

    /**
     * Constructor
     * @param tipus
     * Tipus de la carta
     * @param preu
     * Punts que dona la carta
     * @param descripcio
     * Descripció de la carta
     */
    public Carta( String tipus, int preu, String descripcio) {
        this.nom = "<UNDEFINED>";
        this.tipus = tipus;
        this.preu = preu;
        this.descripcio = descripcio;
    }


    /**
     *Getters i setters.
     */
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

    /**
     * Metode que es sobreescriu per donar un efecte a una carta
     * @param jugador
     * Jugador al que se li apica l'efecte
     */

    public void efecte(Jugador jugador){

    }

    /**
     * Metode que aplica la suma o resta de punts a un jugador, a més de l'efecte de la carta
     * @param jugador
     * Jugador al que se li aplica
     * @param carta
     * carta que aplica el canvi.
     */
    public void puntuacioPartida(Jugador jugador, Carta carta){
        carta.efecte(jugador);
        jugador.setPuntsPartida(jugador.getPuntsPartida()+carta.getPreu());
    }


    /**
     * @return
     * Metode que retorna les dades de la carta
     */
    @Override
    public String toString() {
        return "-----------------" +
                "\n  " + nom  +
                "\n-----------------" +
                "\n  " + preu +" punts" +
                "\n\n  "  +descripcio ;
    }
}
