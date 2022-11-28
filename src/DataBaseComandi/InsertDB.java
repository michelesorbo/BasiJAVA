package DataBaseComandi;

/*
link Teoria: https://www.w3schools.com/sql/sql_insert.asp
INSERT INTO table_name (column1, column2, column3, ... -- OPZIONALI SE DIAMO TUTTI I CAMPI DELLA TABELLA NELL'ORDINE ESATTO--)
VALUES (value1, value2, value3, ...);

RICORDA i valori colonna vanno inseriti  senza '
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String classe;
        String piano;
        String nome, annoFondazione, citta, serie, categoria;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/basijava", "root", "root");
            Statement st = connection.createStatement();
            /*
            //Query di inserimento con valori da tastiera
            System.out.println("Inserisci il nome della classe: ");
            classe = in.nextLine();
            System.out.println("Inserisci il piano");
            piano = in.nextLine();
            String query = "INSERT INTO classi (nome, piano) VALUES('"+classe+"', '"+piano+"')";
            System.out.println(query);
            //String query = "INSERT INTO classi (nome) VALUES('2D')";
             */

            //Quando la Chiave primaria è un id autoincrementato devo passare il valore null
            //String query2 = "INSERT INTO squadre VALUES(null, 'Casertana', '1904', null, 'Serie D', 'Amatoriali')";
            System.out.println("Nome squadra: ");
            nome = in.nextLine();
            System.out.println("Anno di Fondazione");
            annoFondazione = in.nextLine();
            System.out.println("Città:");
            citta = in.nextLine();
            System.out.println("Serie di appartenenza: ");
            serie = in.nextLine();
            System.out.println("Categoria: ");
            categoria = in.nextLine();
            String query2 = "INSERT INTO squadre VALUES(null, '"+nome+"', '"+annoFondazione+"', '"+citta+"', '"+serie+"', '"+categoria+"')";
            st.executeUpdate(query2);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
