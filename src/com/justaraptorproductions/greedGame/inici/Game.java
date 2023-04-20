package com.justaraptorproductions.greedGame.inici;

import com.justaraptorproductions.greedGame.altres.CreacioObjectes;

public class Game {
    public static void main(String[] args) {
    CreacioObjectes prova =new CreacioObjectes();

      prova.llegirFitxer();

      System.out.println(prova.getMazo().get(0).toString());



    }
}