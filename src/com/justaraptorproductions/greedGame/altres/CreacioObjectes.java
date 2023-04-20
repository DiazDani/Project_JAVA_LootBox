package com.justaraptorproductions.greedGame.altres;

import com.justaraptorproductions.greedGame.objectes.cartes.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreacioObjectes {

    private List <Carta> mazo= new ArrayList<>();

    public void llegirFitxer(){
        String rutaArxiu="files/prova.csv";

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
                    case "Bomba":

                        mazo.add( new Bomba(nom, preu, descripcio));
                        System.out.println("funcan las bombas");
                        break;
                    case "Vida":
                        mazo.add(new Vida(nom, preu, descripcio));


                        System.out.println("funcan las vidas");
                        break;
                    case "Reaper":
                        mazo.add(new Reaper(nom, preu, descripcio));

                        System.out.println("funcan la muerte");
                        break;
                    case "Item":
                        mazo.add(new Item(nom, preu, descripcio));

                        System.out.println("funcan los items");
                        break;
                    default:
                        System.out.println("Nom de l'objecte no valid: " + nom);
                }
            }

            scanner.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("Arxiu no trobat: " + e.getMessage());
        }
        for (int i = 0; i < mazo.size(); i++) {
            System.out.println(mazo.get(i).getTipus());
        }
        System.out.println(mazo.size());

    }

    public List<Carta> getMazo() {
        return mazo;
    }
}