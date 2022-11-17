package Base;

import java.util.Locale;

public class Stringhe {
    public static void main(String[] args) {
        int n = 3;
        String str = "prova stringa";
        String str2 = "prova";
        String str3 = "Corso di JAVA per classi JAVA";
        String str4 = "";
        String str5 = "Michele Beatrice Alessandro";
        String[] alunni = str5.split(" "); //Serve a creare un array da una stringa
        System.out.println(alunni[1]);


        System.out.println(str.toLowerCase()); //Tutta la stringa in minuscolo
        System.out.println(str.toUpperCase()); //Tutta la stringa in maiuscolo

        System.out.println(str.length()); //Serve a conoscere il numeri di caratteri della stringa, spazzi inclusi
        System.out.println(str.trim()); //Serve a taglire gli spazzi all'inizio e alla fine della stringa
        System.out.println(str.trim().length());
        System.out.println(str.charAt(0));
        System.out.println(str.equals(str2));
        if(str.equals(str2)){
            System.out.println("Sono uguali");
        }else{
            System.out.println("sono diverse");
        }

        System.out.println(str.replace('a','e')); //Cambia tutti i caratteri con il nuovo carattere
        System.out.println(str3.replace("JAVA","JavaScript"));

        System.out.println(str4.isEmpty()); //Verifico se una stringa è vuota


        //Per stampare l'ultimo carattere
        String str6 = "ciao";
        System.out.println(str6.charAt(str6.length()-1));
    }
}
