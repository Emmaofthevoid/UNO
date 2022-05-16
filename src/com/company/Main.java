package com.company;

import com.company.Karten.App;
import com.company.Karten.Karte;

import java.util.Scanner;

public class Main {

    //WER HIER WAS ÄNDERT, MUSS KAFFEE KAUFEN! FINGER WEG, VALI!!!

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            App app = new App(input, System.out);
            app.Run();
            input.close();
            System.out.println("Das Programm wird beendet ...");


        }
    }

