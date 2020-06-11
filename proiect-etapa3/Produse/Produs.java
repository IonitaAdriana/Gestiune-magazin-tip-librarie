package Produse;

public class Produs {
    private double pret;
    private double nrProduse;
    private double nrVandute;
    private boolean peStoc;

    public Produs() {

    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getNrProduse() {
        return nrProduse;
    }

    public void setNrProduse(double nrProduse) {
        this.nrProduse = nrProduse;
    }

    public double getNrVandute() {
        return nrVandute;
    }

    public void setNrVandute(double nrVandute) {
        this.nrVandute = nrVandute;
    }

    public boolean isPeStoc() {
        return peStoc;
    }

    public void setPeStoc(boolean peStoc) {
        this.peStoc = peStoc;
    }
}
