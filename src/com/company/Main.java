package com.company;

import com.company.Karten.Kartendeck;
import com.company.Spieler.Spieler;

public class Main {
    public static void main(String[] args) {

        Kartendeck deck = new Kartendeck();
        System.out.println(deck);

        Spieler hansi = new Spieler(1);
        hansi.addPlayer();



    }

}
