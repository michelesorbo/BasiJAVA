package Esercizi;

import java.util.Scanner;

public class Operazioni_metodo {

    public String Somma(String a, String b){
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        return String.valueOf(x + y);
    }

    public String Sottrazione(String a, String b){
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        return String.valueOf(x - y);
    }

    public String Prodotto(String a, String b){
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        return String.valueOf(x * y);
    }

    public String Rapporto(String a, String b) {
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        if (y != 0) {
            return  String.valueOf(x / y);
        } else {
            System.out.println("operazione non consentita");

        }
        return "Errore";
    }


    public String Modulo(String a, String b){
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        if (y != 0) {
            return  String.valueOf(x % y);
        } else {
            System.out.println("operazione non consentita");
        }
        return "Errore";
    }
    }


