package com.justaraptorproductions.greedGame.objectes;

import java.io.*;
import java.util.Scanner;

/**
 * Clase que defineix al jugador. El jugador tindrá un nom, una puntuacio total, una puntuacio de partida i unes vides.
 *
 */
public class Jugador {
    private String nom;
    private int puntsTotals;
    private int puntsPartida;
    private int vides;

    /**
     * Constructor del jugador
     * @param nom
     * Nom del jugador
     */
    public Jugador(String nom) {
        this.nom = nom;
        this.puntsTotals = 0;
        this.puntsPartida = 0;
        this.vides = 2;

    }
    /**
     * Getters i setters.
     * Setter de puntsTotals suma els punts actuals més els que se li pasen per parametre.
     */

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
        this.puntsTotals = this.puntsTotals+puntsTotals;
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

    /**
     * Metode que comproba si el jugador esta viu o no. Si no li queden vides, retorna false
     * @return
     * Si es true, el jugador segueix viu.
     */
    public boolean estaViu(){
        if(this.getVides()>0){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Metode que guarda les dades a un document. Guarda el nom i la puntuacio Total del jugador.
     */
    public void guardarDades() {
        try {

            FileWriter writer = new FileWriter("files/guardarPartida.txt", true);


            writer.write(this.getNom() + "," + this.getPuntsTotals() + "\n");

            // Cierra el archivo
            writer.close();

            System.out.println("Les dades han sigut guardades.");
        } catch (IOException e) {
            System.out.println("Ha succeit un error a l'hora de guardar les dades");
            e.printStackTrace();
        }
    }

    /**
     * Recupera les dades del documet de text i cambia el nom i el cognom de la ultima entrada del document.
     * @param jugador
     * Jugador al que se li apliquen els punt i el nom.
     */
    public void recuperarDades(Jugador jugador) {
        try {
            File file = new File("files/guardarPartida.txt");
            Scanner scanner = new Scanner(file);

            String lastLine = "";
            while (scanner.hasNextLine()) {
                lastLine = scanner.nextLine();
            }

            String[] parts = lastLine.split(",");
            jugador.setNom(parts[0]);
            jugador.setPuntsTotals(Integer.parseInt(parts[1]));

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No s'ha pogut recuperar les dades.");
        }
    }



}
