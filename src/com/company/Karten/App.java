package com.company.Karten;

import com.company.Spieler.Spieler;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private Kartendeck deck = new Kartendeck();
    private ArrayList<Spieler> spieler = new ArrayList<>();
    //ablage stapel machen (wo die karten hingeworfen werden (array)
    private AblageStapel stapel = new AblageStapel();
    private ArrayList<Karte> hand = new ArrayList<>();
    private final Scanner input;
    private final PrintStream output;

    public App(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

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

    Karte probeKarte = new Karte(2, "Rot");

    public void handOut(Spieler spieler) {

        for (int i = 0; i < 7; i++) {
            spieler.takeCard(deck.drawCard());

        }
    }

    // gameloop implementieren
    public void Run() {
        // alles was einmal stattfindet: handout(take card), namen eingeben,
        initialize();
        //karteAblegen();
        printState();

        //while (game runs) {

        //while loop somewhere here
        //karte muss ausgewählt werden, dann gespielt, entfernt von die handout und im stapel hingefügt
        //spielrunden(game), draw/remove card
    }

    public void initialize() {
        addPlayer();
        for (Spieler sp : spieler) {
            handOut(sp);
        }
        stapel.ersteKarte(deck);
    }

    private void printState() {
        //welche karte gespielt wurde,

    }

    private void readUserInput() {
        //input von die karte die gespielt wird
    }

    public void karteAblegen(Scanner scanner) {
        //Problem: String nicht mit Objekt vergleichbar --> lösen!
        //oder zu einer Karte konvertieren (Input)

        String karte = input.next();
        for(Karte i : hand) {
            if (karte.equals(i)){
                hand.remove(i);
                stapel.ablegen(i);
            }
        }

        //hand.remove(karte);
        //stapel.ablegen(karte);

    }
}
