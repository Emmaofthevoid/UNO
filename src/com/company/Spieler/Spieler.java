package com.company.Spieler;

import com.company.Karten.Karte;

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

    public void addPlayer() {
        int i = 0;
        ArrayList<Spieler> spieler = new ArrayList<>();
//        while (i < 4) {
//            spieler.add(new Spieler(i));
//            i++;
//            System.out.println(i);
//        }

        for (int j = 0; j < 4; j++) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name");

            name = nummer + " " + scanner.next();
            nummer++;

            System.out.println(name);
        }


    }


}
