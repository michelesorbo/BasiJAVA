package DataBaseComandi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
link teoria: https://www.w3schools.com/sql/sql_update.asp

UPDATE table_name
SET column1 = value1, column2 = value2, ...
WHERE condition;
 */
public class UpdateDB {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/basijava", "root", "root");
            Statement st = connection.createStatement();

            String query = "UPDATE classi SET piano = '1° Piano' WHERE nome = '3E'";
            st.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
