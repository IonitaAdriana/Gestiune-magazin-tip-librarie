package com;

public class Produs {
    private double pret;
    private double nr_produse;
    private double nr_vandute;
    private boolean pe_stoc;

    public Produs() {

    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getNr_produse() {
        return nr_produse;
    }

    public void setNr_produse(double nr_produse) {
        this.nr_produse = nr_produse;
    }

    public double getNr_vandute() {
        return nr_vandute;
    }

    public void setNr_vandute(double nr_vandute) {
        this.nr_vandute = nr_vandute;
    }

    public boolean isPe_stoc() {
        return pe_stoc;
    }

    public void setPe_stoc(boolean pe_stoc) {
        this.pe_stoc = pe_stoc;
    }
}
