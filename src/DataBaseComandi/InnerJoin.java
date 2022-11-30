package DataBaseComandi;

import java.sql.*;

public class InnerJoin {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/basijava","root","root");
            Statement statement = connection.createStatement();

            String query = "SELECT user.user AS U, recapiti.tipo AS T, recapiti.valore AS V " +
                    "FROM recapiti INNER JOIN user ON recapiti.user = user.id ";

            //ResultSet serve a conservare i risultati di una query
            ResultSet result = statement.executeQuery(query);

            while (result.next()){
                System.out.println("");
                System.out.println(result.getString("U"));
                System.out.println(result.getString("T"));
                System.out.println(result.getString("V"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

