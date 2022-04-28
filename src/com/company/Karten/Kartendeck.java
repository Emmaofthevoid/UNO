package com.company.Karten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Kartendeck {
    public ArrayList<Karte> kartendeck;

    public Kartendeck() {
        kartendeck = new ArrayList<Karte>();
        createDeck();
        Collections.shuffle(kartendeck);
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
            //this is the revese Cards
            kartendeck.add(new Karte("Rot", "Reverse"));
            kartendeck.add(new Karte("Blau", "Reverse"));
            kartendeck.add(new Karte("Grün", "Reverse"));
            kartendeck.add(new Karte("Gelb", "Reverse"));
            //this is aussetzen (spieler überspringen)
            kartendeck.add(new Karte("Rot", "Aussetzen"));
            kartendeck.add(new Karte("Blau", "Aussetzen"));
            kartendeck.add(new Karte("Grün", "Aussetzen"));
            kartendeck.add(new Karte("Gelb", "Aussetzen"));

        }
        for (int i = 0; i < 4; i++) {
            kartendeck.add(new Karte("+4"));
            kartendeck.add(new Karte("Farbwechsel"));

        }
    }

    public Karte drawCard(){
        return kartendeck.remove(kartendeck.size()-1);
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
