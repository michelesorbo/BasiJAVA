package Base;

import java.sql.*;

public class ConnessioneDB {
    public static void main(String[] args) {

        try {
            //Vado a creare la connessione con il DataBase inserendo l'url del database con in nome del bd da prendere in considerazione e inserisco user e password
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/basijava","root","root");

            //Stabilire la connessione per poterci lavorare
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM calciatori";

            //ResultSet serve a conservare i risultati di una query
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                System.out.println("");
                System.out.println(result.getString("ntessera"));
                System.out.println(result.getString("nome"));
                System.out.println(result.getString("cognome"));
                System.out.println(result.getString("dataNascita"));
                System.out.println(result.getString("squadra"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
