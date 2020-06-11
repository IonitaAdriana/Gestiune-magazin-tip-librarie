package Servicii;

import java.sql.*;

public class Stergere {
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

    public ResultSet getMyResult() {
        return myResult;
    }

    public void setMyResult(ResultSet myResult) {
        this.myResult = myResult;
    }

    public void setMyStatement(Statement myStatement) {
        this.myStatement = myStatement;
    }

    public void deleteAngajati() throws SQLException {
        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:1521/Local SYS", "SYSTEM", "220798"); //database path
            Statement myStatement = myConnection.createStatement();

            String sql = "delete from angajat where name='Doe John'";

            int liniiModificate = myStatement.executeUpdate(sql);

            System.out.println("linii Modificate: " + liniiModificate);
            System.out.println("Delete complete.");

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

    public void deleteClient() throws SQLException {
        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:1521/Local SYS", "SYSTEM", "220798"); //database path
            Statement myStatement = myConnection.createStatement();

            String sql = "delete from client where name='Doe John'";

            int liniiModificate = myStatement.executeUpdate(sql);

            System.out.println("linii Modificate: " + liniiModificate);
            System.out.println("Delete complete.");

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

    public void deleteCarti() throws SQLException {
        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:1521/Local SYS", "SYSTEM", "220798"); //database path
            Statement myStatement = myConnection.createStatement();

            String sql = "delete from carti where titlu='Baltagul'";

            int liniiModificate = myStatement.executeUpdate(sql);

            System.out.println("linii Modificate: " + liniiModificate);
            System.out.println("Delete complete.");

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

    public void deleteBoardgames() throws SQLException {
        try{
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:1521/Local SYS", "SYSTEM", "220798"); //database path
            Statement myStatement = myConnection.createStatement();

            String sql = "delete from boardgames where tip='story telling'";

            int liniiModificate = myStatement.executeUpdate(sql);

            System.out.println("linii Modificate: " + liniiModificate);
            System.out.println("Delete complete.");

            ResultSet myResult = myStatement.executeQuery("select* from boardgames"); //select element from table
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
}
