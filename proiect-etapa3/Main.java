
import java.io.*;
import java.util.ArrayList;
import Produse.Boardgame;
import Produse.Caiet;
import Produse.Carte;
import Produse.Produs;
import Servicii.Scriere;
import Servicii.Stergere;
import datePersoane.Angajati;
import datePersoane.Client;
import Servicii.Citire;
import VanzareSiMagazin.Magazin;
import java.sql.*;
import java.sql.SQLException;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {

        Citire c = new Citire();
        Scriere s = new Scriere();
        Stergere d = new Stergere();
        c.citesteAngajati();
        c.citesteBoardgames();
        c.citesteCarti();
        c.citesteClient();
        s.updateAngajati();
        s.updateBoardgames();
        s.updateCarti();
        s.updateClient();
        d.deleteAngajati();
        d.deleteBoardgames();
        d.deleteCarti();
        d.deleteClient();

        //Citire cititor = new Citire();
        Magazin m = new Magazin();

       /* ArrayList<Angajati> angajati = cititor.citesteAngajati();
        if (angajati.size() > 0)
            for (Angajati item : angajati) {
                m.AngajatNou(item);
                //angajati.clear();
            }
        ArrayList<Client> clients = cititor.citesteClienti();
          if (clients.size() > 0)
            for (Client item : clients) {
                System.out.println(item.getNume()+" "+item.getVarsta()+" "+item.getNrPuncte());
                //angajati.clear();
            }
        ArrayList<Carte> carti = cititor.citesteCarti();
        ArrayList<Boardgame> boardgames = cititor.citesteBoardgames(); */


    }
}
