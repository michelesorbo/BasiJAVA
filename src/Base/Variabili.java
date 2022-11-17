package Base;

import java.util.Scanner;

public class Variabili {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int eta; //Ho dichiarato una variabile di tipo intero
        eta = 43; //Ho assegnato un valore alla variabile
        int anno = 1979;

        double media = 3.45; //Ho dichiarato e inizzializzato una variabile di tipo booleano

        char carattere = 'a'; //Solo un carattere scritto tra apici

        boolean bool = true; //Può assure true o false

        //float pgreco = 3.14; //Uguale a double ma più piccolo
        final double PGRECO = 3.14; //Dichiaro una costante, deve essere subito inizializzate e non può essere modificata in futuro
        //Le costanti vanno scritte in MAIUSCOLO

        String nome = "Michele"; //Dichiaro una stringa e il contunto va tra "
        String cognome = "Sorbo";
        String corso;

        Scanner input = new Scanner(System.in); //Ho dichiarato un oggetto scanner per prendere input da tastiera

        System.out.println(eta); //Stampare sul terinale il contenuto della variabile

        System.out.println(nome + " " + cognome);

        System.out.println(eta + " " + anno);

        System.out.println("Che corso vuoi seuire?");
        corso = input.nextLine(); //Serve a prendere in input una stringa
        System.out.println("Hai inserito il corso " + corso);

        System.out.println("Inserisci il tuo nome");
        nome = input.nextLine();

        System.out.println("Inserisci il tuo cognome");
        cognome = input.nextLine();

        System.out.println("Ti chiamo: " + nome + " " + cognome);

        /*
         * Le operazioni in JAVA sono:
         * + Somma es 2 + 2 = 4
         * - Sottrazione es 2 - 2 = 0
         * / divisione es 2 / 2 = 1
         * * moltiplicazione 2 * 2 = 4
         * % modulo (Il resto della divisione) 2%2 = 0 - 3%2 = 1
         */

        //La condizione IF (SE)

        /*
         * == sta per uguaglianza 2 == 2 vero a == b falso
         * != sta per diverso 2 != 2 falso
         * > sta per maggiore stretto 6 > 5 vero 6 > 6 falso
         * >= sta per maggiore 6 >= 5 vero 6 >= 6 vero
         * < sta per minore stretto
         * <= sta per minore
         * ! negazione
         */

        int n1 = 2, n2 = 3;

        if(n1 == n2) {
            System.out.println("Sono uguali");
        }else {
            System.out.println("Non sono uguali");
        }

        //Chiedere un numero da tastiera (NextInt()) e dire se è pari o dispari
        int num=input.nextInt();

        if(num%2 == 0) {
            System.out.println(num + " è pari");
        }else {
            System.out.println(num + " è dispari");
        }

        int num2 = 6;

        if(num2 == 6) {
            System.out.println("Numero uguale a 6");
        }else if(num2 > 6) {
            System.out.println("Numero maggiore di 6");
        }else {
            System.out.println("Numero minore di 6");
        }

        /*
         * Chiedere 2 numeri da tastiera e poi chiedere quale operazione fare:
         * s = somma
         * m = moltiplicazione
         * d = divisione
         * f = sottrazione
         * dopo la scelta dell'operazione far visulizzare il risultato
         */

        System.out.println("inserisci il primo numero ");
        int numero = input.nextInt();
        System.out.println("inserisci il secondo numero ");
        int numero2 = input.nextInt();
        System.out.println("che operazione vuoi fare? premi s - f - m - d ");
        String oper = input.nextLine();

        if(oper.equals("s")){
            int somma = numero + numero2;
            System.out.println("la somma tra i due numeri è " + somma);
        }else if(oper.equals("f")) {
            int sottr = numero - numero2;
            System.out.println("la sottr tra i due numeri è " + sottr);
        }else if(oper.equals("m")){
            int prod = numero * numero2;
            System.out.println("il prod tra i due numeri è " + prod);
        }else if(oper.equals("d")){
            double divis = numero / numero2;
            System.out.println("il rapporto tra i due numeri è " + divis);
        }else{
            System.out.println("Scelta non valida");

        }


    }
}
