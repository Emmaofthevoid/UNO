package com.company.Karten;

import com.company.Spieler.Spieler;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private Kartendeck deck = new Kartendeck();
    private ArrayList<Spieler> spieler = new ArrayList<>();
    //ablage stapel machen (wo die karten hingeworfen werden

    public void addPlayer() {
        String name;
        for (int j = 0; j < 4; j++) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name");

            name = scanner.next();

            System.out.println("Hallo, " + name);
            Spieler sp1 = new Spieler(name);
            spieler.add(sp1);
        }
    }

    public void handOut(Spieler spieler) {

        for (int i = 0; i < 7; i++) {
            spieler.takeCard(deck.drawCard());

        }
    }

    // gameloop implementieren
    public void Run() {
        // alles was einmal stattfindet: handout(take card), namen eingeben,
        initialize();
        printState();

        //while loop somewhere here
        //karte muss ausgewählt werden, dann gespielt, entfernt von die handout und im stapel hingefügt
        //spielrunden(game), draw/remove card
    }

    public void initialize() {
        addPlayer();
        for (Spieler sp : spieler) {
            handOut(sp);
        }

    }

    private void printState() {

    }

    private void readUserInput() {
        //input von die karte die gespielt wird
    }


}
