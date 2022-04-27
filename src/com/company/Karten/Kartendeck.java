package com.company.Karten;

import java.util.ArrayList;

public class Kartendeck {
    public ArrayList<Karte> kartendeck;

    public Kartendeck() {
        kartendeck = new ArrayList<>();
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

    }

    @Override
    public String toString() {
        String hansi = "";
        for (Karte a : kartendeck) {
            hansi += ", " + a.toString();
        }
        return hansi;
    }
}
