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
//            if (card.aktion + "" + (card.farbe == null) + (card.karteNummer = 0)).equals(cardInput) || (card.karteNummer + "" + card.farbe + (card.aktion == null)).equals(cardInput) || (card.farbe + "" + card.aktion
//            + (card.karteNummer == 0)).equals(cardInput) {
//                hand.remove(card);
//                return card;
//                // 3 Rot
//            }
            if (card.aktion.equals(cardInput) && card.farbe == null && card.karteNummer == 0) {
                hand.remove(card);
                return card;
                // 3 Rot
                }

                else if((card.karteNummer + "" + card.farbe).equals(cardInput) && card.aktion == null){
                    hand.remove(card);
                    return card;
                }

                    else if ((card.farbe + "" + card.aktion).equals(cardInput) && card.karteNummer == 0){
                hand.remove(card);
                return card;
                }
                    else {
                System.out.println("");
                }

        }
        return null; //Karte ist nicht auf der Hand
    }


    //methode um karten zu spielen
    public Karte playCard() {

        return null;
    }


}
