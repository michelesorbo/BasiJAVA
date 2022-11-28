package Esercizi;

import java.sql.*;
import java.util.Scanner;

/*
  Data una squadra stampare a video i giocatori della squadra
 */
public class DBEsercizio01 {

    public static void main(String[] args) {

        String squadra;
        String id = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci la squadra e ti stampo i giocatori:");
        squadra = in.nextLine();

        try {
            //Vado a creare la connessione con il DataBase inserendo l'url del database con in nome del bd da prendere in considerazione e inserisco user e password
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/basijava","root","root");

            //Stabilire la connessione per poterci lavorare
            Statement statement = connection.createStatement();

            String query = "SELECT ID FROM squadre WHERE nome = '" + squadra + "'";

            //ResultSet serve a conservare i risultati di una query
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                id = result.getString("ID");
            }

            query = "SELECT * FROM calciatori WHERE squadra = " + id;

            result = statement.executeQuery(query);

            while (result.next()){
                System.out.println(result.getString("nome") + " " + result.getString("cognome"));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
