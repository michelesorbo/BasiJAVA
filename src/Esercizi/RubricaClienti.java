package Esercizi;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class RubricaClienti {
    /*
    Creare un programma che crei una lista di clienti di un negozio.
    Il programma deve chiedere se inserire un nuovo cliente nel file o se si
    vuole leggere la lista dei clienti presenti nel file.
    Nome del file Clienti.txt
    Quando si inserisce un cliente chiedere Nome Cognome e Codice Fiscale
    Salvare i dati in minuscolo
    Fare la funzione di ricerca per i clienti
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scelta;
        String testo;
        File file = new File("File/clienti.txt");

        if(file.exists()){
            do{
                System.out.println("1) per inserire 2) per visualizzare 3) per cercare 0)Chiudi programma");
                scelta = in.nextInt();
                in.nextLine(); //Serve ad evitare il BUG di Scanner
                if(scelta == 1){
                    inserisciCliente(file);
                } else if (scelta == 2) {
                    leggoClienti(file);
                } else if (scelta == 0) {
                    System.out.println("Programma Chiuso");
                } else if (scelta == 3) {
                    cercoClienti(file);
                } else {
                    System.out.println("Scelta non valida");
                }
            }while (scelta != 0);
        }else{
            System.out.println("Errore file non trovato");
        }

    }

    public static String pulisciTesto(String testo){
        testo = testo.toLowerCase();
        testo = testo.trim();
        testo = testo.replace(",", "");
        return testo;
    }

    public static void inserisciCliente(File file){
        try {
            Scanner in = new Scanner(System.in);
            String nome, cognome, codfis;

            System.out.println("Inserisci il nome:");
            nome = in.nextLine();
            System.out.println("Inserisci il cognome:");
            cognome = in.nextLine();
            System.out.println("Inserisci Codice Fiscale:");
            codfis = in.nextLine();
            if(cercoClienti(file, pulisciTesto(codfis)) == true){
                System.out.println("Utente già presente");
            }else{
                FileWriter fw = new FileWriter(file, true);//Apro in append
                fw.append(pulisciTesto(nome) + " " + pulisciTesto(cognome) + " " + pulisciTesto(codfis) + "\n"); //Inserisco il testo
                fw.close();//Scrivo sul file
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    //Con metodo int data e conversione in (char)
//    public static void leggoClienti(File file){
//        try{
//            FileReader fr = new FileReader(file);
//
//            int data = fr.read();
//
//            while (data != -1){
//                System.out.print((char) data);
//                data = fr.read();
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
    public static void leggoClienti(File file){
        try{
            FileReader fr = new FileReader(file);
            Scanner FileScanner = new Scanner(fr);

            while (FileScanner.hasNextLine()){
                String data = FileScanner.nextLine(); //Leggo con Scanner e intera linea non carattere per carattere
                System.out.println(data);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static boolean cercoClienti(File file, String testo){
        boolean trovato = false;
        try {
            FileReader fr = new FileReader(file);
            Scanner FileScan = new Scanner(fr);

            while (FileScan.hasNextLine()){
                String data = FileScan.nextLine();
                if(data.contains(testo)){ //Se la riga contiene il testo che cerco
                    trovato = true;
                }
            }

            return trovato;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    //Override
    public static void cercoClienti(File file){
        FileReader fr = null;
        Scanner in = new Scanner(System.in);
        String testo;

        System.out.println("inserisci il nome o il cognome o il Codice Fiscale del cliente da ricercare");
        testo = in.nextLine();

        try {
            fr = new FileReader(file);
            Scanner FileScanner = new Scanner(fr);

            while (FileScanner.hasNextLine()){
                String data = FileScanner.nextLine();
                if(data.contains(testo)){ //Se la riga contiene il testo che cerco
                    System.out.println(data);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            e.printStackTrace();
        }

    }


}
