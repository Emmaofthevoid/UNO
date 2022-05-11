package com.company.Spieler;

import com.company.Karten.Karte;
import com.company.Karten.Kartendeck;

import java.util.ArrayList;
import java.util.Scanner;

public class Spieler {
    ArrayList<Karte> hand = new ArrayList<>();
    String name;
    int points;

    public Spieler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void takeCard(Karte card) {
        hand.add(card);
    }

    //methode um karten zu spielen
    public Karte playCard() {
        return null;
    }


}
