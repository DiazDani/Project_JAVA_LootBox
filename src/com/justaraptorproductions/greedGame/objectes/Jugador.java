package com.justaraptorproductions.greedGame.objectes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Jugador {
    private String nom;
    private int puntsTotals;
    private int puntsPartida;
    private int vides;

    public Jugador(String nom,int puntsTotals) {
        this.nom = nom;
        this.puntsTotals = puntsTotals;
        this.puntsPartida = 0;
        this.vides = 2;

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
        this.puntsTotals = this.puntsPartida+puntsTotals;
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

    public boolean estaViu(){
        if(this.getVides()>0){
            return true;
        }
        else {
            return false;
        }
    }

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

    public static Jugador carregarPartida(String archivo) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String ultimaLinea = "";
            String linea;
            while ((linea = br.readLine()) != null) {
                ultimaLinea = linea;
            }
            String[] datos = ultimaLinea.split(",");
            String nombre = datos[0];
            int puntos = Integer.parseInt(datos[1]);
            return new Jugador(nombre, puntos);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            e.printStackTrace();
            return null;
        }
    }


}
