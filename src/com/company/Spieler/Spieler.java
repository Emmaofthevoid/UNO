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

    public String printHand(){
        return hand.toString();
    }

    public Karte karteSpielen(String cardInput){
        for (Karte card : hand) { //Wenn hier CollectionChangeException auftritt: for-each- auf for-Schleife ändern!
            // TODO: Fehler finden! Erkennt Karte nicht
            if (card.matchesString(cardInput)) {
                hand.remove(card);
                return card;
                // 3 Rot
            }
        }
        return null; //Karte ist nicht auf der Hand
    }


    //methode um karten zu spielen
    public Karte playCard() {

        return null;
    }


}
