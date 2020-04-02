package com;

public class Client {
    private String nume;
    private int varsta;
    private boolean card_fidelitate;
    private double nr_puncte;

    /*public Client(String nume, int varsta, boolean card, int nr_puncte) {
        this.nume = nume;
        this.varsta = varsta;
        this.card_fidelitate = card;
        this.nr_puncte = nr_puncte;
    }*/

    public Client() {

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public boolean isCard_fidelitate() {
        return card_fidelitate;
    }

    public void setCard_fidelitate(boolean card_fidelitate) {
        this.card_fidelitate = card_fidelitate;
    }

    public double getNr_puncte() {
        return nr_puncte;
    }

    public void setNr_puncte(double nr_puncte) {
        this.nr_puncte = nr_puncte;
    }
}
