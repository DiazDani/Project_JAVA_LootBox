package com.justaraptorproductions.greedGame.inici;

import com.justaraptorproductions.greedGame.objectes.Jugador;
import com.justaraptorproductions.greedGame.objectes.cartes.Bomba;
import com.justaraptorproductions.greedGame.objectes.cartes.Item;
import com.justaraptorproductions.greedGame.objectes.cartes.Reaper;
import com.justaraptorproductions.greedGame.objectes.cartes.Vida;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
      //  Scanner kb=new Scanner(System.in);
      //  String playerName="aa";

        Jugador j1 = new Jugador("aaa",0);
        Vida vida= new Vida("vida",1000,"nice");
        Bomba b1 = new Bomba("Bomba",-1000, "boom");
        Reaper r1= new Reaper("Rip", 0, "rip");
        Item i1 = new Item("tem", 100,"sopa");

        Jugador.carregarPartida("files/guardarPartida.txt");
        j1.guardarDatos();
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
