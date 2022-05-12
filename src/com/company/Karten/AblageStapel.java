package com.company.Karten;

import java.util.ArrayList;

public class AblageStapel {
    public ArrayList<Karte> ablageStapel;

    public AblageStapel() {
        ablageStapel = new ArrayList<>();
    }

    public ArrayList<Karte> getAblageStapel() {
        return ablageStapel;
    }

    //eine methode damit eine karte schon da ist, und eine um karten hinzufügen.

    public void ersteKarte(Kartendeck probe) {
        probe.drawCard();
        ablageStapel.add(probe.drawCard());
    }

    public void ablegen(Karte karte) {
        ablageStapel.add(karte);
    }
}
