package Servicii;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import datePersoane.Angajati;
import datePersoane.Client;
import Produse.Carte;
import Produse.Boardgame;


public class Scriere {

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

    public void updateAngajati() throws SQLException {
        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:1521/Local SYS", "SYSTEM", "220798"); //database path
            Statement myStatement = myConnection.createStatement();

            String sql = "update angajat set salary= 333333 where id=2";

            int liniiModificate = myStatement.executeUpdate(sql);

            System.out.println("linii modificate: " + liniiModificate);
            System.out.println("Update complete.");

            ResultSet myResult = myStatement.executeQuery("select* from angajat"); //select element from table
            while (myResult.next()){
                System.out.println(myResult.getString(myResult.getString("name") + ", " + myResult.getString("salary")));
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

    public void updateClient() throws SQLException {
        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:1521/Local SYS", "SYSTEM", "220798"); //database path
            Statement myStatement = myConnection.createStatement();

            String sql = "update client set varsta= 33 where id=2";

            int liniiModificate = myStatement.executeUpdate(sql);

            System.out.println("linii modificate: " + liniiModificate);
            System.out.println("Update complete.");

            ResultSet myResult = myStatement.executeQuery("select* from client"); //select element from table
            while (myResult.next()){
                System.out.println(myResult.getString(myResult.getString("name") + ", " + myResult.getString("varsta")));
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

    public void updateCarti() throws SQLException {
        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:1521/Local SYS", "SYSTEM", "220798"); //database path
            Statement myStatement = myConnection.createStatement();

            String sql = "update carti set titlu= 'Morometii' where id=2";

            int liniiModificate = myStatement.executeUpdate(sql);

            System.out.println("linii modificate: " + liniiModificate);
            System.out.println("Update complete.");

            ResultSet myResult = myStatement.executeQuery("select* from carti"); //select element from table
            while (myResult.next()){
                System.out.println(myResult.getString(myResult.getString("titlu") + ", " + myResult.getString("autor")));
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

    public void updateBoardgames() throws SQLException {
        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:1521/Local SYS", "SYSTEM", "220798"); //database path
            Statement myStatement = myConnection.createStatement();

            String sql = "update boardgames set varsta= 33 where id=2";

            int liniiModificate = myStatement.executeUpdate(sql);

            System.out.println("linii modificate: " + liniiModificate);
            System.out.println("Update complete.");

            ResultSet myResult = myStatement.executeQuery("select* from boardgames"); //select element from table
            while (myResult.next()){
                System.out.println(myResult.getString(myResult.getString("varsta") + ", " + myResult.getString("durata")+ ", " + myResult.getString("tip")));
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

    /*private static Scriere instantaScriere = null;

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

*/



}

