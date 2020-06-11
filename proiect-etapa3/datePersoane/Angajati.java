package datePersoane;
import java.util.Collections;
import java.util.ArrayList;

public class Angajati {
    private String nume;
    private String departament;
    private double salariu;

    public Angajati(String nume, String departament, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
        this.departament = departament;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }


}


