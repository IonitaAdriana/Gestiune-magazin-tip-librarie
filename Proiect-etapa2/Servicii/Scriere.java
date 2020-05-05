package Servicii;


import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import datePersoane.Angajati;
import datePersoane.Client;
import Produse.Carte;
import Produse.Boardgame;


public class Scriere {

    private static Scriere instantaScriere = null;

    public static Scriere getInstance() {
        if (instantaScriere == null)
            instantaScriere = new Scriere();

        return instantaScriere;
    }

    public void scrieAngajati(ArrayList<Angajati> deScris, String separator, String numeFisier){
        try (FileWriter writer = new FileWriter(numeFisier)){
            for (Angajati angajat : deScris) {
                writer.append(angajat.getDepartament());
                writer.append(separator);
                writer.append(angajat.getNume());
                writer.append(separator);
                writer.append(Double.toString(angajat.getSalariu()));
                writer.append(separator);
                writer.append(System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void scrieCarti(ArrayList<Carte> deScris, String separator, String numeFisier){
        try (FileWriter writer = new FileWriter(numeFisier)){
            for (Carte carte : deScris) {
                writer.append(carte.getAutor());
                writer.append(separator);
                writer.append(carte.getTitlu());
                writer.append(separator);
                writer.append(System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void scrieBoardgames(ArrayList<Boardgame> deScris, String separator, String numeFisier){
        try (FileWriter writer = new FileWriter(numeFisier)){
            for (Boardgame boardgame : deScris) {
                writer.append(Integer.toString(boardgame.getVarsta()));
                writer.append(separator);
                writer.append(Integer.toString(boardgame.getDurata()));
                writer.append(separator);
                writer.append(boardgame.getTip());
                writer.append(separator);
                writer.append(System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void scrieClienti(ArrayList<Client> deScris, String separator, String numeFisier){
        try (FileWriter writer = new FileWriter(numeFisier)){
            for (Client client : deScris) {
                writer.append(client.getNume());
                writer.append(separator);
                writer.append(Double.toString(client.getNrPuncte()));
                writer.append(separator);
                writer.append(Integer.toString(client.getVarsta()));
                writer.append(separator);
                writer.append(System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}

