package com.justaraptorproductions.bombastic.objectes.cartes;

public abstract class Carta {
    private String nom;
    private String tipus;
    private int preu;

    private String descripcio;

    public Carta(String nom, String tipus, int preu, String descripcio) {
        this.nom = nom;
        this.tipus = tipus;
        this.preu = preu;
        this.descripcio = descripcio;
    }

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
}
