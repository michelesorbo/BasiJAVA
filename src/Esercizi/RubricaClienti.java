package Esercizi;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RubricaClienti {
    /*
    Creare un programma che crei una lista di clienti di un negozio.
    Il programma deve chiedere se inserire un nuovo cliente nel file o se si
    vuole leggere la lista dei clienti presenti nel file.
    Nome del file Clienti.txt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scelta;
        String testo;
        File file = new File("File/clienti.txt");

        if(file.exists()){
            do{
                System.out.println("1) per inserire 2) per visualizzare 0)Chiudi programma");
                scelta = in.nextInt();
                in.nextLine(); //Serve ad evitare il BUG di Scanner
                if(scelta == 1){
                    System.out.println("Inserisci il cliente da aggiungere");
                    testo = in.nextLine();
                    inserisciCliente(file, testo);
                } else if (scelta == 2) {
                    leggoClienti(file);
                } else if (scelta == 0) {
                    System.out.println("Programma Chiuso");
                }else {
                    System.out.println("Scelta non valida");
                }
            }while (scelta != 0);
        }else{
            System.out.println("Errore file non trovato");
        }

    }

    public static void inserisciCliente(File file, String testo){
        try {
            FileWriter fw = new FileWriter(file, true);//Apro in append
            fw.append(testo+"\n"); //Inserisco il testo
            fw.close();//Scrivo sul file
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void leggoClienti(File file){
        try{
            FileReader fr = new FileReader(file);

            int data = fr.read();

            while (data != -1){
                System.out.print((char) data);
                data = fr.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
