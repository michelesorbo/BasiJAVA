package GraficaSwing;

import java.sql.*;

public class GestioneDB {
    private Connection conn;
    private Statement st;

    {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/basijava","root","root");
            st = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean login(String mail, String pwd){
        try {

            ResultSet rs = st.executeQuery("SELECT * FROM user WHERE mail = '"+mail+"'");

            if(rs.next()){
                if(mail.equals(rs.getString("mail")) && pwd.equals(rs.getString("pwd"))){
                    return true;
                }else {
                    return false;
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    public String getNome(String mail){
        try {
            ResultSet rs = st.executeQuery("SELECT * FROM user WHERE mail = '"+mail+"'");
            if(rs.next()){
                    return rs.getString("user");
                }else {
                    return "Utente non definito";
                }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
