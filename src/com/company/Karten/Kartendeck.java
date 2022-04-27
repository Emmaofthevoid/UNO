package com.company.Karten;

import java.util.ArrayList;

public class Kartendeck {
    public ArrayList<Karte> kartendeck;

    public Kartendeck() {
        kartendeck = new ArrayList<Karte>();
        createDeck();
    }

    public void addCard(Karte card) {
       kartendeck.add(card);
    }

    private void createDeck() {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 2; j++) {

                kartendeck.add(new Karte(i, "Rot"));
                kartendeck.add(new Karte(i, "Blau"));
                kartendeck.add(new Karte(i, "Grün"));
                kartendeck.add(new Karte(i, "Gelb"));
            }
        }
        kartendeck.add(new Karte(0, "Rot"));
        kartendeck.add(new Karte(0, "Blau"));
        kartendeck.add(new Karte(0, "Grün"));
        kartendeck.add(new Karte(0, "Gelb"));
        for (int i = 0; i <= 1; i++) {
            //this is the +2 Cards (tinonino)
            kartendeck.add(new Karte("Rot", "+2"));
            kartendeck.add(new Karte("Blau", "+2"));
            kartendeck.add(new Karte("Grün", "+2"));
            kartendeck.add(new Karte("Gelb", "+2"));

        }
    }

    @Override
    public String toString() {
        String hansi = "";
        for (int i = 0; i < kartendeck.size(); i++) {
            Karte a = kartendeck.get(i);
            if (i == 0) {
                hansi += a.toString();
            } else {
                hansi += ", " + a.toString();
            }
        }
        return hansi;
    }
}
