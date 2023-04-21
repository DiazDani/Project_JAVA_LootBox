package com.justaraptorproductions.greedGame.inici;

import com.justaraptorproductions.greedGame.altres.BuclePrincipal;
import com.justaraptorproductions.greedGame.altres.CreacioObjectes;
import com.justaraptorproductions.greedGame.objectes.Jugador;

import java.util.Scanner;

/**
 * Bucle Main del joc. El joc només acaba quan el jugador vol sortir de la partida.
 */
public class Game {
    public static void main(String[] args) {
        CreacioObjectes prova =new CreacioObjectes();
        Scanner kb = new Scanner(System.in);
        String nom;
        char resposta;

        System.out.println("Caregant les cartes, un segon...");
        prova.llegirFitxer();
        System.out.println("Cartes carregades");

        System.out.print("Si us plau, indiqueu el vostre nom (sense espais): ");
        nom=kb.next();
        Jugador jugador = new Jugador(nom);

        while (true){


            System.out.println("\n\nNom: " + jugador.getNom() + "    Punts totals: " + jugador.getPuntsTotals());
            System.out.println("---------------------------------------");
            System.out.println("""
                    \n
                    Benvingut a Greed, el joc de l'avaricia.
                    
                    A) Jugar
                    
                    G) Guardar partida i sortir
                    
                    E) Sortir del programa
                    
                    L) Cargar l'ultima partida guardada.
                    (Cuidado! es perdran totes les dades sense guardar)
                    
                    """);
            System.out.print("Si us plau, indiqueu la vostra resposta: ");
            resposta=kb.next().charAt(0);
            if(resposta=='a'||resposta=='A') {
                System.out.println("\n\n\n\nBenvingut al joc!");
                jugador.setVides(2);
                jugador.setPuntsPartida(0);
                while (jugador.estaViu()) {
                    System.out.print("""
                            \nPulsa C per treure una carta.
                            
                            Pulsa S per plantar-te amb els punts aconseguits. 
                            
                            Si perds totes les vides, perdrás tots els puns que hagis aconseguit durant la partida!
                            
                            """);
                    System.out.print("Si us plau, indiqueu la vostra resposta: ");
                    resposta=kb.next().charAt(0);
                    if (resposta == 'S' || resposta=='s') {
                        jugador.setPuntsTotals(jugador.getPuntsPartida());
                        jugador.setVides(0);
                    }else if (resposta=='C' || resposta=='c'){

                        BuclePrincipal.TreureCarta(jugador, prova);
                    }else {
                        System.out.println("Selecciona una opció valida.");
                    }
                }
                System.out.println("Final de partida. ");
            }
            else if (resposta=='g'||resposta=='G'){
                jugador.guardarDades();
                break;
            }else if (resposta=='e'||resposta=='E'){
                System.out.println("Gracies per jugar");
                break;
            }else if (resposta=='L'||resposta=='l'){
                jugador.recuperarDades(jugador);
            }
            else{
                System.out.println("\nIntrodueix un caracter valid");
            }

        }
    }
}