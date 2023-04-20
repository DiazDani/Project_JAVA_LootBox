package com.justaraptorproductions.bombastic.objectes;

public class Jugador {
    private String nom;
    private int puntsTotals;
    private int puntsPartida;
    private int vides;
    private int portals;

    public Jugador(String nom, int puntsTotals, int puntsPartida, int vides, int portals) {
        this.nom = nom;
        this.puntsTotals = puntsTotals;
        this.puntsPartida = puntsPartida;
        this.vides = vides;
        this.portals = portals;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuntsTotals() {
        return puntsTotals;
    }

    public void setPuntsTotals(int puntsTotals) {
        this.puntsTotals = puntsTotals;
    }

    public int getPuntsPartida() {
        return puntsPartida;
    }

    public void setPuntsPartida(int puntsPartida) {
        this.puntsPartida = puntsPartida;
    }

    public int getVides() {
        return vides;
    }

    public void setVides(int vides) {
        this.vides = vides;
    }

    public int getPortals() {
        return portals;
    }

    public void setPortals(int portals) {
        this.portals = portals;
    }
}
