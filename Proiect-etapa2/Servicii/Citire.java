package Servicii;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import datePersoane.Angajati;
import datePersoane.Client;
import Produse.Boardgame;
import Produse.Carte;


public class Citire {
    private static Citire instanta_citire = null;

    public static Citire getInstance()
    {
        if (instanta_citire == null)
            instanta_citire = new Citire();

        return instanta_citire;
    }

    public ArrayList<Angajati> citesteAngajati(){
        String csvFile = "src/files/angajati.csv";
        String linie = "";
        String cvsSplitBy = ",";
        ArrayList<Angajati> oameniAngajati = new ArrayList<Angajati>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {

            while ((linie = reader.readLine()) != null) {

                String[] angajati = linie.split(cvsSplitBy);
                Angajati angajat = new Angajati(angajati[0], angajati[1], Double.parseDouble(angajati[2]));
                oameniAngajati.add(angajat);
                System.out.println("Nume " + angajati[0] + " , departament=" + angajati[1] + " ,salariu= "+ angajati[2]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return oameniAngajati;

    }

    public ArrayList<Client> citesteClienti(){
        String csvFile = "src/files/clienti.csv";
        String linie = "";
        String cvsSplitBy = ",";
        ArrayList<Client> clienti = new ArrayList<Client>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {

            while ((linie = reader.readLine()) != null) {

                String[] clients = linie.split(cvsSplitBy);
                Client customer = new Client(clients[0], Integer.parseInt(clients[1]), Boolean.parseBoolean(clients[2]), Integer.parseInt(clients[3]));
                clienti.add(customer);
                System.out.println("Nume " + clients[0] + " , varsta=" + clients[1] + " ,card= "+ clients[2] + " nr puncte " + clients[3]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return clienti;

    }




    public ArrayList<Carte> citesteCarti(){
        String csvFile = "src/files/carti.csv";
        String linie = "";
        String cvsSplitBy = ",";
        ArrayList<Carte> carti = new ArrayList<Carte>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {

            while ((linie = reader.readLine()) != null) {

                String[] cartiCitite = linie.split(cvsSplitBy);
                Carte carte = new Carte();
                carte.setTitlu(cartiCitite[0]);
                carte.setAutor(cartiCitite[1]);
                carti.add(carte);
                System.out.println("Titlu= " + cartiCitite[0] + " , autor= " + cartiCitite[1]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return carti;

    }

    public ArrayList<Boardgame> citesteBoardgames(){
        String csvFile = "src/files/boardgames.csv";
        String linie = "";
        String cvsSplitBy = ",";
        ArrayList<Boardgame> games = new ArrayList<Boardgame>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {

            while ((linie = reader.readLine()) != null) {

                String[] boaedgames = linie.split(cvsSplitBy);
                Boardgame boaedgame = new Boardgame();
                boaedgame.setTip(boaedgames[2]);
                boaedgame.setVarsta(Integer.parseInt(boaedgames[0]));
                boaedgame.setDurata(Integer.parseInt(boaedgames[1]));
                games.add(boaedgame);
                System.out.println("varsta= " + boaedgames[0] + " , durata= " + boaedgames[1] + " ore ,tip= " + boaedgames[2]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return games;

    }


}

