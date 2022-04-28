package com.company.Karten;

import com.company.Spieler.Spieler;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private Kartendeck deck = new Kartendeck();

    public void addPlayer() {
        int i = 0;
        ArrayList<Spieler> spieler = new ArrayList<>();
        String name;
        int nummer = 0;

        for (int j = 0; j < 4; j++) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name");

            name = nummer + " " + scanner.next();
            nummer++;

            System.out.println(name);
        }
    }

    public void handOut (Spieler spieler) {

        for (int i = 0; i < 7; i++) {
            spieler.takeCard(deck.drawCard());


        }
    }


}
