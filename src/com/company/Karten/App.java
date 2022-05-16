package com.company.Karten;

import com.company.Spieler.Spieler;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    private Kartendeck deck = new Kartendeck();
    private ArrayList<Spieler> spieler = new ArrayList<>();
    //ablage stapel machen (wo die karten hingeworfen werden (array)
    private AblageStapel stapel = new AblageStapel();
    private final Scanner input;
    private final PrintStream output;
    private Spieler currentPlayer;
    private boolean exit = false;

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
        while (!exit) {
            printState();
            String cardInput = readInput(input);
            System.out.println("Ihre Eingabe war: " + cardInput);
            karteAblegen(cardInput);
        }

        //TODO: Schleife draus machen! Darf/Muss noch verändert werden --> Doppelschleife

        //karte muss ausgewählt werden, dann gespielt, entfernt von die handout und im stapel hingefügt
        //spielrunden(game), draw/remove card
    }

    public void initialize() {
        addPlayer();
        for (Spieler sp : spieler) {
            handOut(sp);
        }
        stapel.ersteKarte(deck);
        Collections.shuffle(spieler);
        currentPlayer = spieler.get(0);
        //random player beginnt

    }

    private void printState() {
        //welche karte gespielt wurde

        output.println(currentPlayer.printHand());
    }




    public void karteAblegen(String cardInput) {
        Karte card = currentPlayer.karteSpielen(cardInput);
        if (card == null){
            System.out.println("Bitte gültige Karte eingeben.");
        }
        stapel.ablegen(card);

    }

    //TODO methode, um zu überprüfen, ob Input-Wert einer Karte entspricht --> auf der Hand
    // mit Schleife machen!!!
    // wenn beide equal sind --> Karte kann gespielt werden

    public String readInput(Scanner eingabe) {
        System.out.println("Bitte Karte eingeben: ");
        String var = eingabe.nextLine();
        return var;
    }

}
