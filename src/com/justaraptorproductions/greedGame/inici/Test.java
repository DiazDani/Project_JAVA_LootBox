package com.justaraptorproductions.greedGame.inici;

import com.justaraptorproductions.greedGame.objectes.Jugador;

/**
 * Classe de proves per comprovar que els metodes i cartes funcionen.
 */
public class Test {
    public static void main(String[] args) {
      //  Scanner kb=new Scanner(System.in);
      //  String playerName="aa";

        Jugador j1 = new Jugador("aaa");
       /* Vida vida= new Vida("vida",1000,"nice");
        Bomba b1 = new Bomba("Bomba",-1000, "boom");
        Reaper r1= new Reaper("Rip", 0, "rip");
        Item i1 = new Item("tem", 100,"sopa");*/

        System.out.println(j1.getNom()+" ");
        j1.recuperarDades(j1);
        j1.guardarDades();
       /* while (j1.estaViu()){
            i1.puntuacioPartida(j1, i1);
            b1.puntuacioPartida(j1, b1);
            vida.puntuacioPartida(j1, vida);
            b1.puntuacioPartida(j1, b1);
            System.out.println("vuelta");
         //   r1.efecte(j1);
        }*/
    }
}
