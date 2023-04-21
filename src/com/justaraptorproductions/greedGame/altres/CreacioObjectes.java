package com.justaraptorproductions.greedGame.altres;

import com.justaraptorproductions.greedGame.objectes.cartes.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreacioObjectes {

    private List <Carta> mazo= new ArrayList<>();

    /**
     * Metode que llegeix el fitxer CSV anomeant "totesLesCatres".
     * El fitxer separa els diferents camps amb comas. Quan el codi detecta la primera paraula, mira de quin
     * tipus es la carta. Segons el tipus, crea i afegeix un objecte d'aquest tipus a un arraylist.
     */
    public void llegirFitxer(){
        String rutaArxiu="files/totesLesCartes.csv";

        try {
            File file = new File(rutaArxiu);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String nom = parts[0];
                int preu = Integer.parseInt(parts[1]);
                String descripcio = parts[2];
                switch (nom) {
                    case "Bomba" -> mazo.add(new Bomba(nom, preu, descripcio));
                    case "Vida" -> mazo.add(new Vida(nom, preu, descripcio));
                    case "Reaper" -> mazo.add(new Reaper(nom, preu, descripcio));
                    case "Item" -> mazo.add(new Item(nom, preu, descripcio));
                    default -> System.out.println("Nom de l'objecte no valid: " + nom);
                }
            }

            scanner.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("Arxiu no trobat: " + e.getMessage());
        }


    }

    /**
     * @return
     * Retorna l'arraylist amb les cartes.
     */
    public List<Carta> getMazo() {
        return mazo;
    }
}