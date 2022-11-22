package Esercizio05;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

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
