package Esercizio05;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Sim {
    private String numero;
    private double credito;
    //Lista delle telofonate sarà un file con nome il numero della sim
    private String path; //Contiene il Path del file
    private File file;

    Sim(String numero, double credito){
        this.numero = numero;
        this.credito = credito;
        this.path = "File/"+numero+".txt";
    }

    public String toString(){
        return "Numero della sim: " + numero + "\nIl credito residuo è: " + credito;
    }

    public String getNumero(){
        return numero;
    }

    public String getPath(){
        return path;
    }

    public void IserisciTelefonata(String numero, int secondi){
        file = this.checkFile();
        try {
            LocalDateTime dataOra = LocalDateTime.now();
            FileWriter fw = new FileWriter(file, true);
            fw.append(dataOra + " " + numero + " " + secondi + "\n");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void ElencoChamate(){
        int totminuti = 0;
        int totchiamate = 0;
        file = this.checkFile(); //Controllo se il file esiste
        try {
            FileReader fr = new FileReader(file);
            Scanner FileScanner = new Scanner(fr);

            while (FileScanner.hasNextLine()){
                String data = FileScanner.nextLine();
                System.out.println(data);
                String[] appoggio = data.split(" ");
                totminuti += Integer.parseInt(appoggio[2]);
                totchiamate++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Totale minuti di conversazione: " + totminuti);
        System.out.println("Hai effettuato " + totchiamate + " chiamate");
    }

    public void ElencoChamate(String numeroDaCercare){
        int totminuti = 0;
        int totchiamate = 0;
        file = this.checkFile(); //Controllo se il file esiste
        try {
            FileReader fr = new FileReader(file);
            Scanner FileScanner = new Scanner(fr);

            while (FileScanner.hasNextLine()){
                String data = FileScanner.nextLine();
                if(data.contains(numeroDaCercare)){
                    System.out.println(data);
                    String[] appoggio = data.split(" ");
                    totminuti += Integer.parseInt(appoggio[2]);
                    totchiamate++;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Totale minuti di conversazione: " + totminuti);
        System.out.println("Hai effettuato " + totchiamate + " chiamate");
    }

    private File checkFile(){
        //Vado a creare l'oggetto file tramite il path creato dal costruttore
        file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return file;
    }
}
