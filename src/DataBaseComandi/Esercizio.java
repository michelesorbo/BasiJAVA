package DataBaseComandi;

import java.sql.*;
import java.util.Scanner;

/*
Creare un programma che chieda quale operazione si vuole compiere:
1) Visualizza tutte le squadre
2) Chiedere la serie e visualizzare tutte le squadre della serie
3) Inserire una nuova squadra e controllare se il nome della squadra è già presente nel DB
4) Chiedere quale squadra modificare e inserire i campi modificati nel DB

 */
public class Esercizio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scelta;
        Statement st = null;

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/basijava", "root", "root");
            st = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        do{
            System.out.println("Scegli \n1)Visualizza tutte le squadre\n2)Visualizza Serie\n3)Inserisci Squadra\n4)Modifica Squadra\n0) Per Terminare");
            scelta = in.nextInt();

            if(scelta == 1){
                visualizzaSQ(st);
            } else if (scelta == 2) {
                visulizzaSerie(st);
            } else if (scelta == 3) {
                inserisciSQ(st);
            } else if (scelta == 4) {
                modificaSQ(st);
            }else {
                System.out.println("Scelta non valida");
            }
        }while (scelta != 0);
    }

    public static void visualizzaSQ(Statement st){
        try {
            ResultSet result = st.executeQuery("SELECT * FROM squadre");

            while (result.next()){
                System.out.println("");
                System.out.println(result.getString("nome"));
                System.out.println(result.getString("citta"));
                System.out.println(result.getString("annoFondazione"));
                System.out.println(result.getString("serie"));
                System.out.println(result.getString("categoria"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void visulizzaSerie(Statement st){
        Scanner in = new Scanner(System.in);
        String testo;
        System.out.println("Che serire vuoi visualizzare");
        testo = in.nextLine();

        try {
            ResultSet result = st.executeQuery("SELECT * FROM squadre WHERE serie = '"+testo+"'");

            while (result.next()){
                System.out.println("");
                System.out.println(result.getString("nome"));
                System.out.println(result.getString("citta"));
                System.out.println(result.getString("annoFondazione"));
                System.out.println(result.getString("serie"));
                System.out.println(result.getString("categoria"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void inserisciSQ(Statement st){
        Scanner in = new Scanner(System.in);
        String nome, annoFondazione, citta, serie, categoria;

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

        //Verifico se il nome della squadra è già presente nel DB
        try {
            int i = 0; //Inizializzo il contatore per le squadre
            //Verifico se esiste una squadra con il nome inserito
            ResultSet result = st.executeQuery("SELECT ID FROM squadre WHERE nome = '"+nome+"'");
//            while (result.next()){
//                i++; //Se trovo una squadra con lo stesso nome aumento il contatore
//            }

            if(result.next()){ //Se il contatore è stato aumentato significa che esiste un nome uguale a quello inserito
                System.out.println("Squadra già presente");
            }else{//Inserisco la squadra nel DB
                st.executeUpdate("INSERT INTO squadre VALUES(null, '"+nome+"', '"+annoFondazione+"', '"+citta+"', '"+serie+"', '"+categoria+"')");
                System.out.println("Squadra inserita con successo!!!");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void modificaSQ(Statement st){
        Scanner in = new Scanner(System.in);
        String nome, annoFondazione, citta, serie, categoria,id;

        System.out.println("Quale squadra vuoi modificare?");
        nome = in.nextLine();

        try {
            ResultSet result = st.executeQuery("SELECT * FROM squadre WHERE nome = '"+nome+"'");

            if(result.next()){
                System.out.println("Dati della squadra: ");
                id = result.getString("ID");

                //Finisco di chiedere le informazioni
                System.out.println("Nome squadra: " + result.getString("nome"));
                nome = in.nextLine();
                System.out.println("Anno di Fondazione: " + result.getString("annoFondazione"));
                annoFondazione = in.nextLine();
                System.out.println("Città: " + result.getString("citta"));
                citta = in.nextLine();
                System.out.println("Serie di appartenenza: " + result.getString("serie"));
                serie = in.nextLine();
                System.out.println("Categoria: " + result.getString("categoria"));
                categoria = in.nextLine();

                st.executeUpdate("UPDATE squadre SET nome = '"+nome+"', annoFondazione = '"+annoFondazione+"', citta = '"+citta+"', serie = '"+serie+"', categoria = '"+categoria+"' WHERE ID = '"+id+"'");
                System.out.println("Squadra modificata Correttamente");
            }else{
                System.out.println("Squadra non trovata");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
