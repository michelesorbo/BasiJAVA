package DataBaseComandi;

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
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/basijava", "root", "root");
            Statement st = connection.createStatement();

            /*
            INSERT INTO table_name (column1, column2, column3, ... -- OPZIONALI SE DIAMO TUTTI I CAMPI DELLA TABELLA NELL'ORDINE ESATTO--)
            VALUES (value1, value2, value3, ...);

            RICORDA i valori colonna vanno inseriti  senza '
             */
            System.out.println("Inserisci il nome della classe: ");
            classe = in.nextLine();
            System.out.println("Inserisci il piano");
            piano = in.nextLine();
            String query = "INSERT INTO classi (nome, piano) VALUES('"+classe+"', '"+piano+"')";
            System.out.println(query);
            //String query = "INSERT INTO classi (nome) VALUES('2D')";

            st.executeUpdate(query);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
