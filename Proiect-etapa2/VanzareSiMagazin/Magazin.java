package VanzareSiMagazin;
import Produse.Boardgame;
import Produse.Caiet;
import Produse.Carte;
import Produse.Produs;
import datePersoane.Angajati;
import datePersoane.Client;

import java.util.ArrayList;


public class Magazin {


    public Magazin() {

    }

    public void InStoc(Caiet caiet, Carte carte, Boardgame boardgame){

        double total = 0;


        total = caiet.getNrProduse() + carte.getNrProduse() + boardgame.getNrProduse();

        if(carte.isPeStoc() == true)
        {
            System.out.println("Sunt "+carte.getNrProduse()+" carti in stoc");
        }
        else
        {
            System.out.println("Nu sunt carti in stoc");
        }

        if(caiet.isPeStoc() == true)
        {
            System.out.println("Sunt "+caiet.getNrProduse()+" caiete in stoc");
        }
        else
        {
            System.out.println("Nu sunt caiete in stoc");
        }

        if(boardgame.isPeStoc() == true)
        {
            System.out.println("Sunt "+boardgame.getNrProduse()+" boardgames in stoc");
        }
        else
        {
            System.out.println("Nu sunt boardgames in stoc");
        }
        System.out.println("In total magazinul are "+total+" produse");

    }

    public void ProfitVanzari(Carte carte, Caiet caiet, Boardgame boardgame){
        double profit = 0;
        profit = caiet.getNrVandute()*caiet.getPret() + carte.getNrVandute()*carte.getPret()+boardgame.getNrVandute()*boardgame.getPret();
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


        double totalSalarii = 0;
        for (int i = 0; i < angajati.size(); i++)
        {
            totalSalarii =totalSalarii + angajati.get(i).getSalariu();
        }

        double media = totalSalarii/angajati.size();
        System.out.println("Salariul mediu e: "+media);
        return media;

    }


    public void PuncteCardFidelitate(Client client){
        if(client.isCardFidelitate() == true)
        {
            System.out.println("Ai discount de "+client.getNrPuncte()+"%");
        }

    }

    public void TotalDePlatitVanzare(Client client, Vanzare vanzare){
        System.out.println("Ai cumparat "+vanzare.getNrArticole()+" produse");
        System.out.println("Cost total: "+vanzare.getPretTotal());
        if(client.isCardFidelitate() == true)
        {
            System.out.println("Clientul "+client.getNume()+" are card de fidelitate");
            System.out.println("Are reducere de "+client.getNrPuncte()+"%");
            double cost_nou =  vanzare.getPretTotal() - ( vanzare.getPretTotal()*(client.getNrPuncte()/100));
            System.out.println("Noul cost total este: "+cost_nou);
        }

    }


    public void NrProduseVandute(Caiet caiet, Carte carte, Boardgame boardgame){
        double nrTotalProduseVandute = 0;
        nrTotalProduseVandute = caiet.getNrVandute()+carte.getNrVandute()+boardgame.getNrVandute();
        System.out.println("S-au vandut "+nrTotalProduseVandute+" produse");
    }

    public void ActualizareStoc(Caiet caiet, Carte carte, Boardgame boardgame){
        if(caiet.getNrVandute() != 0){

            double nrActualizat = caiet.getNrProduse() - caiet.getNrVandute();
            caiet.setNrProduse(nrActualizat);
            System.out.println("Au mai ramas "+nrActualizat+" caiete");}
        if(carte.getNrVandute() != 0){

            double nrActualizat = carte.getNrProduse() - carte.getNrVandute();
            carte.setNrProduse(nrActualizat);
            System.out.println("Au mai ramas "+nrActualizat+" carti");}

        if(boardgame.getNrVandute() != 0){

            double nrActualizat = boardgame.getNrProduse() - boardgame.getNrVandute();
            boardgame.setNrProduse(nrActualizat);
            System.out.println("Au mai ramas "+nrActualizat+" boardgames");}

    }

    public void CelMaiVandutProdus(Caiet caiet, Carte carte, Boardgame boardgame)
    {
        if (boardgame.getNrVandute() > carte.getNrVandute())
            if(boardgame.getNrVandute() > caiet.getNrVandute())
                System.out.println("Cel mai vandut produs este boardgame");

        if (caiet.getNrVandute() > carte.getNrVandute())
            if(boardgame.getNrVandute() < caiet.getNrVandute())
                System.out.println("Cel mai vandut produs este caietul");

        if (boardgame.getNrVandute() < carte.getNrVandute())
            if(carte.getNrVandute() > caiet.getNrVandute())
                System.out.println("Cel mai vandut produs este cartea");


    }


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





