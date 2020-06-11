package Servicii;
import java.sql.*;
import java.sql.SQLException;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import datePersoane.Angajati;
import datePersoane.Client;
import Produse.Boardgame;
import Produse.Carte;


public class Citire {

    Connection myConnection;
    Statement myStatement;
    ResultSet myResult;

    public Connection getMyConnection() {
        return myConnection;
    }

    public void setMyConnection(Connection myConnection) {
        this.myConnection = myConnection;
    }

    public Statement getMyStatement() {
        return myStatement;
    }

    public void setMyStatement(Statement myStatement) {
        this.myStatement = myStatement;
    }

    public ResultSet getMyResult() {
        return myResult;
    }

    public void setMyResult(ResultSet myResult) {
        this.myResult = myResult;
    }

    public void citesteAngajati() throws SQLException {
        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:1521/Local SYS", "SYSTEM", "220798"); //database path
            Statement myStatement = myConnection.createStatement();
            ResultSet myResult = myStatement.executeQuery("select* from angajat"); //select element from table
            while (myResult.next()){
                System.out.println(myResult.getString(myResult.getString("name") + ", " + myResult.getString("salary"))); //write column name there
            }

        }
        catch (Exception exc){
            exc.printStackTrace();
        }

        finally {
            if (myResult != null) {
                myResult.close();
            }

            if (myStatement != null) {
                myStatement.close();
            }

            if (myConnection != null) {
                myConnection.close();
            }
        }
    }

    public void citesteClient() throws SQLException {
        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:1521/Local SYS", "SYSTEM", "220798"); //database path
            Statement myStatement = myConnection.createStatement();
            ResultSet myResult = myStatement.executeQuery("select* from client"); //select element from table
            while (myResult.next()){
                System.out.println(myResult.getString(myResult.getString("name") + ", " + myResult.getString("varsta") + ", " + myResult.getString("card") + ", " + myResult.getString("puncte"))); //write column name there
            }

        }
        catch (Exception exc){
            exc.printStackTrace();
        }

        finally {
            if (myResult != null) {
                myResult.close();
            }

            if (myStatement != null) {
                myStatement.close();
            }

            if (myConnection != null) {
                myConnection.close();
            }
        }
    }

    public void citesteCarti() throws SQLException {
        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:1521/Local SYS", "SYSTEM", "220798"); //database path
            Statement myStatement = myConnection.createStatement();
            ResultSet myResult = myStatement.executeQuery("select* from carti"); //select element from table
            while (myResult.next()){
                System.out.println(myResult.getString(myResult.getString("titlu") + ", " + myResult.getString("autor"))); //write column name there
            }

        }
        catch (Exception exc){
            exc.printStackTrace();
        }

        finally {
            if (myResult != null) {
                myResult.close();
            }

            if (myStatement != null) {
                myStatement.close();
            }

            if (myConnection != null) {
                myConnection.close();
            }
        }
    }


    public void citesteBoardgames() throws SQLException {
        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:1521/Local SYS", "SYSTEM", "220798"); //database path
            Statement myStatement = myConnection.createStatement();
            ResultSet myResult = myStatement.executeQuery("select* from boardgames"); //select element from table
            while (myResult.next()){
                System.out.println(myResult.getString(myResult.getString("varsta") + ", " + myResult.getString("durata")+ ", " + myResult.getString("tip"))); //write column name there
            }

        }
        catch (Exception exc){
            exc.printStackTrace();
        }

        finally {
            if (myResult != null) {
                myResult.close();
            }

            if (myStatement != null) {
                myStatement.close();
            }

            if (myConnection != null) {
                myConnection.close();
            }
        }
    }



    /*private static Citire instanta_citire = null;

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

    }*/


}

