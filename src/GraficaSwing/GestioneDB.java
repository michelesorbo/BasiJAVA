package GraficaSwing;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

            //Codifico la password presa in input dalla grafica
            String pwd_cod = getMd5Hash(pwd);

            ResultSet rs = st.executeQuery("SELECT * FROM user WHERE mail = '"+mail+"'");

            if(rs.next()){
                if(mail.equals(rs.getString("mail")) && pwd_cod.equals(rs.getString("pwd"))){
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

    //Codifica MD5
    public String getMd5Hash(String input)
    {
        try
        {
            //static getInstance() method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //calculating message digest of an input that return array of byte
            byte[] messageDigest = md.digest(input.getBytes());
            //converting byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
            //converting message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32)
            {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        //for specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e)
        {
            throw new RuntimeException(e);
        }
    }
}
