package datePersoane;

public class Client {
    private String nume;
    private int varsta;
    private boolean cardFidelitate;
    private int nrPuncte;

    public Client(String nume, int varsta, boolean card, int nrPuncte) {
        this.nume = nume;
        this.varsta = varsta;
        this.cardFidelitate = card;
        this.nrPuncte = nrPuncte;
    }

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

    public boolean isCardFidelitate() {
        return cardFidelitate;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public double getNrPuncte() {
        return nrPuncte;
    }

    public void setNrPuncte(int nrPuncte) {
        this.nrPuncte = nrPuncte;
    }

}
