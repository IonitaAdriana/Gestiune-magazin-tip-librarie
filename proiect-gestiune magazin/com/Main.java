package com;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       Magazin m = new Magazin();

        Caiet caiet = new Caiet();
        caiet.setNr_produse(30);
        caiet.setNr_file(48);
        caiet.setTip("Mate");
        caiet.setNr_vandute(5);
        caiet.setPe_stoc(true);
        caiet.setPret(2);

        Carte carte = new Carte();
        carte.setNr_produse(50);
        carte.setAutor("Ion Creanga");
        carte.setTitlu("Amintiri din copilarie");
        carte.setNr_vandute(20);
        carte.setPe_stoc(true);
        carte.setPret(15);

        Boardgame boardgame = new Boardgame();
        boardgame.setNr_produse(100);
        boardgame.setDurata(60);
        boardgame.setTip("Strategie");
        boardgame.setVarsta(12);
        boardgame.setNr_vandute(50);
        boardgame.setPe_stoc(true);
        boardgame.setPret(80);

        m.InStoc(caiet, carte, boardgame);
        m.ProfitVanzari(carte, caiet, boardgame);
        m.NrProduseVandute(caiet, carte, boardgame);
        m.CelMaiVandutProdus(caiet, carte, boardgame);
        m.ActualizareStoc(caiet, carte, boardgame);

        ArrayList<Angajati> vector_angajat = new ArrayList<Angajati>();
        Angajati angajat = new Angajati("Pop Ana","Vanzari online",1900);
        Angajati angajat2 = new Angajati("Pop Mara","PR",2900);
        Angajati angajat3 = new Angajati("Popescu Dan","Vanzari online",2100);
        vector_angajat.add(angajat);
        vector_angajat.add(angajat2);
        vector_angajat.add(angajat3);
        m.AngajatNou(angajat);
        m.AngajatNou(angajat2);
        m.AngajatNou(angajat3);
        //m.StergeAngajat(angajat);
        m.SalariuMediu(vector_angajat);
        //m.SortareAngajatiSalariu(vector_angajat);

        Client client = new Client();
        client.setCard_fidelitate(true);
        client.setNr_puncte(50);
        client.setNume("Andrei");

        m.PuncteCardFidelitate(client);

        Vanzare vanzare = new Vanzare();
        vanzare.setNr_articole(10);
        vanzare.setPret_total(130);

        m.TotalDePlatitVanzare(client, vanzare);


    }
}
