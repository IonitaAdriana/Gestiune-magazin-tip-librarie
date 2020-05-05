
import java.io.*;
import java.util.ArrayList;
import Produse.Boardgame;
import Produse.Caiet;
import Produse.Carte;
import Produse.Produs;
import datePersoane.Angajati;
import datePersoane.Client;
import Servicii.Citire;
import VanzareSiMagazin.Magazin;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Citire cititor = new Citire();
        Magazin m = new Magazin();

        ArrayList<Angajati> angajati = cititor.citesteAngajati();
        if (angajati.size() > 0)
            for (Angajati item : angajati) {
                m.AngajatNou(item);
                //angajati.clear();
            }
        ArrayList<Client> clients = cititor.citesteClienti();
        /*if (clients.size() > 0)
            for (Client item : clients) {
                System.out.println(item.getNume()+" "+item.getVarsta()+" "+item.getNrPuncte());
                //angajati.clear();
            }*/
        ArrayList<Carte> carti = cititor.citesteCarti();
        ArrayList<Boardgame> boardgames = cititor.citesteBoardgames();


    }
}
