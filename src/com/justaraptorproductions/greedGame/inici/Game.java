package com.justaraptorproductions.greedGame.inici;

import com.justaraptorproductions.greedGame.altres.BuclePrincipal;
import com.justaraptorproductions.greedGame.altres.CreacioObjectes;
import com.justaraptorproductions.greedGame.objectes.Jugador;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        CreacioObjectes prova =new CreacioObjectes();
        Scanner kb = new Scanner(System.in);
        String nom;
        char resposta;

        System.out.print("Si us plau, indiqueu el vostre nom: ");

        nom=kb.next();

        Jugador jugador = new Jugador(nom,0);
        System.out.println("Caregant les cartes, un segon...");
        prova.llegirFitxer();
        System.out.println("Cartes carregades");

        while (true){


            System.out.println("""
                    Benvingut a Greed, el joc de l'avaricia.
                    
                    A) Jugar
                    
                    G) Guardar partida i sortir
                    
                    E) Sortir del programa
                    
                    """);
            resposta=kb.next().charAt(0);
            if(resposta=='a'||resposta=='A') {
                jugador.setVides(2);
                jugador.setPuntsPartida(0);
                while (jugador.estaViu()) {
                    BuclePrincipal.TreureCarta(jugador, prova);
                }
            }
            else if (resposta=='g'||resposta=='G'){
                jugador.guardarDades();
                break;
            }else if (resposta=='e'||resposta=='E'){
                System.out.println("Gracies per jugar");
                break;
            }

        }
    }
}