package DataBaseComandi;

import java.sql.*;
import java.util.Scanner;
 //Connessione e SELECT
public class ConnessioneDB {
    public static void main(String[] args) {

        String serie_ricerca;
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci la serie e ti farò vedere le squadre:");
        serie_ricerca = in.nextLine();

        try {
            //Vado a creare la connessione con il DataBase inserendo l'url del database con in nome del bd da prendere in considerazione e inserisco user e password
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/basijava","root","root");

            //Stabilire la connessione per poterci lavorare
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM squadre WHERE serie = '" + serie_ricerca + "'";

            //ResultSet serve a conservare i risultati di una query
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                System.out.println("");
                System.out.println(result.getString("nome"));
                System.out.println(result.getString("citta"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
