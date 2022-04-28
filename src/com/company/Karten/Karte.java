package com.company.Karten;

public class Karte {
    public int karteNummer;
    public String farbe;
    public int points;
    public String aktion;

    //this is SpielKarten
    public Karte(int karteNummer, String farbe) {
        this.karteNummer = karteNummer;
        this.farbe = farbe;
    }

    //this is AktionsKarten
    public Karte(String farbe, String aktion) {
        this.farbe = farbe;
        points = 20;
        this.aktion = aktion;
    }

    //this is spezialkarten (ohne farbe)
    public Karte ( String aktion) {
        this.aktion = aktion;
    }

    @Override
    public String toString() {
        while (aktion == null) {
        return karteNummer + " " + farbe;
        }
        while (farbe == null) {
            return aktion;
        }
        while (aktion != null) {
            return farbe + " " + aktion;
        }
        return null;
    }
}
