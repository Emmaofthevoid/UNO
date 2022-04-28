package com.company.Spieler;

import com.company.Karten.Karte;
import com.company.Karten.Kartendeck;

import java.util.ArrayList;
import java.util.Scanner;

public class Spieler {
    ArrayList<Karte> hand = new ArrayList<>();
    String name;
    int points;
    int nummer;

    public Spieler(int nummer) {
        this.nummer = nummer;
    }

    public String getName() {
        return name;
    }

    public void takeCard(Karte card){
        hand.add(card);
    }


}
