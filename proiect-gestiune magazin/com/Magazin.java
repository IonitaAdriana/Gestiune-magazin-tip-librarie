package com;

import java.util.ArrayList;

public class Magazin {


    public Magazin() {

    }

    public void InStoc(Caiet caiet, Carte carte, Boardgame boardgame){

        double total = 0;


        total = caiet.getNr_produse() + carte.getNr_produse() + boardgame.getNr_produse();

        if(carte.isPe_stoc() == true)
        {
              System.out.println("Sunt "+carte.getNr_produse()+" carti in stoc");
        }
        else
        {
            System.out.println("Nu sunt carti in stoc");
        }

        if(caiet.isPe_stoc() == true)
        {
            System.out.println("Sunt "+caiet.getNr_produse()+" caiete in stoc");
        }
        else
        {
            System.out.println("Nu sunt caiete in stoc");
        }

        if(boardgame.isPe_stoc() == true)
        {
            System.out.println("Sunt "+boardgame.getNr_produse()+" boardgames in stoc");
        }
        else
        {
            System.out.println("Nu sunt boardgames in stoc");
        }
        System.out.println("In total magazinul are "+total+" produse");

    }

    public void ProfitVanzari(Carte carte, Caiet caiet, Boardgame boardgame){
        double profit = 0;
        profit = caiet.getNr_vandute()*caiet.getPret() + carte.getNr_vandute()*carte.getPret()+boardgame.getNr_vandute()*boardgame.getPret();
        System.out.println("Profitul total este "+profit+" lei");

    }

    public void AngajatNou(Angajati angajati){
        ArrayList<Angajati> angajat = new ArrayList<Angajati>();
        //Angajati a = new Angajati(angajati.getNume(), angajati.getDepartament(), angajati.getSalariu());
        angajat.add(new Angajati(angajati.getNume(), angajati.getDepartament(), angajati.getSalariu()));

        System.out.println("Angajatii sunt:");

        for (int i = 0; i < angajat.size(); i++){
             System.out.println(angajat.get(i).getNume());}


    }

    public void StergeAngajat(Angajati angajati){
        ArrayList<Angajati> angajat = new ArrayList<Angajati>();
        angajat.remove(angajati);
        for (int i = 0; i < angajat.size(); i++)
        {
            System.out.println("Au mai ramas angajatii "+angajat.get(i).getNume());
        }
    }

    public double SalariuMediu(ArrayList<Angajati>angajati){


        double total_salarii = 0;
        for (int i = 0; i < angajati.size(); i++)
        {
            total_salarii =total_salarii + angajati.get(i).getSalariu();
        }

        double media = total_salarii/angajati.size();
        System.out.println("Salariul mediu e: "+media);
        return media;

    }


    public void PuncteCardFidelitate(Client client){
        if(client.isCard_fidelitate() == true)
        {
            System.out.println("Ai discount de "+client.getNr_puncte()+"%");
        }

    }

    public void TotalDePlatitVanzare(Client client, Vanzare vanzare){
        System.out.println("Ai cumparat "+vanzare.getNr_articole()+" produse");
        System.out.println("Cost total: "+vanzare.getPret_total());
        if(client.isCard_fidelitate() == true)
        {
            System.out.println("Clientul "+client.getNume()+" are card de fidelitate");
            System.out.println("Are reducere de "+client.getNr_puncte()+"%");
            double cost_nou =  vanzare.getPret_total() - ( vanzare.getPret_total()*(client.getNr_puncte()/100));
            System.out.println("Noul cost total este: "+cost_nou);
        }

    }


    public void NrProduseVandute(Caiet caiet, Carte carte, Boardgame boardgame){
        double nrTotalProduseVandute = 0;
        nrTotalProduseVandute = caiet.getNr_vandute()+carte.getNr_vandute()+boardgame.getNr_vandute();
        System.out.println("S-au vandut "+nrTotalProduseVandute+" produse");
    }

    public void ActualizareStoc(Caiet caiet, Carte carte, Boardgame boardgame){
        if(caiet.getNr_vandute() != 0){

            double nrActualizat = caiet.getNr_produse() - caiet.getNr_vandute();
            caiet.setNr_produse(nrActualizat);
             System.out.println("Au mai ramas "+nrActualizat+" caiete");}
        if(carte.getNr_vandute() != 0){

            double nrActualizat = carte.getNr_produse() - carte.getNr_vandute();
            carte.setNr_produse(nrActualizat);
            System.out.println("Au mai ramas "+nrActualizat+" carti");}

        if(boardgame.getNr_vandute() != 0){

            double nrActualizat = boardgame.getNr_produse() - boardgame.getNr_vandute();
            boardgame.setNr_produse(nrActualizat);
            System.out.println("Au mai ramas "+nrActualizat+" boardgames");}

    }

    public void CelMaiVandutProdus(Caiet caiet, Carte carte, Boardgame boardgame)
    {
        if (boardgame.getNr_vandute() > carte.getNr_vandute())
            if(boardgame.getNr_vandute() > caiet.getNr_vandute())
                System.out.println("Cel mai vandut produs este boardgame");

        if (caiet.getNr_vandute() > carte.getNr_vandute())
            if(boardgame.getNr_vandute() < caiet.getNr_vandute())
                System.out.println("Cel mai vandut produs este caietul");

        if (boardgame.getNr_vandute() < carte.getNr_vandute())
            if(carte.getNr_vandute() > caiet.getNr_vandute())
                System.out.println("Cel mai vandut produs este cartea");


    }

    /*@Override
    public int compareTo(Angajati comparestu) {
        int compareage=((Angajati)comparestu).getSalariu();

        return this.salariu-compareage;}

    public void SortareAngajatiSalariu(ArrayList<Angajati> angajati){
        Collections.sort(angajati);
        System.out.println("Angajatii sortati sunt:");
        for (int i = 0; i < angajati.size(); i++){
            System.out.println(angajati.get(i).getNume()+" iar salariul este: "+angajati.get(i).getSalariu());
        }
    }*/
}



