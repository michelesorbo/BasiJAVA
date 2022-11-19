package Base;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestioneFile {
    public static void main(String[] args) throws IOException {
        File file = new File("File/prova.txt"); //Apro e associo il file all'oggetto file

        //Verifico che il file esiste
        if(file.exists()){
            System.out.println("Il file è stato trovato");
            System.out.println("Il Path Relativo del file e: " + file.getPath()); //Relativo da dove è il programma di partenza
            System.out.println("Il Path Assoluto del file è: " + file.getAbsolutePath()); //Posizione nel HDD del computer
            System.out.println("è un file? " + file.isFile());
        }else{
            System.out.println("File non presente");
        }

        //Scrivere nel File
        try{
            FileWriter writer = new FileWriter(file, true); //Apro il file in scrittura e posiziono il puntotore alla fine del file
            //FileWriter writer = new FileWriter(file); //Apro e cancello il file
            //writer.write("Ciao mondo"); //Inserisco cosa voglio scrivere sul file
            //il metodo write cancella il contenuto del file e inserisce il nuovo contenuto

            //writer.write("\nE ora sono io");
            writer.append("\nSono la nuova riga in append"); //Posiziona il testo alla fine del file
            writer.close();//Chiudo la scrittura e copio tutto sul file
        }catch (IOException e){
            e.printStackTrace();
        }


        //Come si legge un file
        try{
            FileReader reader = new FileReader(file);
            int data = reader.read(); //Ritorna la codifica Ascii Code dei caratteri. Il carattere di fine file è -1
            while (data != -1){
                System.out.print((char) data);
                data = reader.read();
            }


        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
