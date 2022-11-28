package DataBaseComandi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDB {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/basijava", "root", "root");
            Statement st = connection.createStatement();

            /*
            INSERT INTO table_name (column1, column2, column3, ... -- OPZIONALI SE DIAMO TUTTI I CAMPI DELLA TABELLA NELL'ORDINE ESATTO--)
            VALUES (value1, value2, value3, ...);
             */
            String query = "INSERT INTO classi VALUES('1D', '2° Piano')";

            st.executeUpdate(query);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
