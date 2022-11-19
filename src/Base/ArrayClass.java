package Base;

import java.util.Random;

public class ArrayClass {
    public static void main(String[] args) {
        int n = 4;
        //Quando dichiaro un array devo sempre specificarne la grandezza
        int[] ar_n = new int[4]; //Ho dichiarato un array numerico vuoto di grandezza 4
        int[] ar_n2 = {3,4,5,2,5}; //Dichiarato e inizializzao un array numerico di 4. Ogni elemento va divso da una ,
        String[] ar_s = {"Ciao", "Mondo", "sono una stringa"};
        System.out.println(ar_s[2]);
        System.out.println("Sono l'ultimo elemento di un array " + ar_n2[ar_n2.length-1]); //Stampo ultimo elemento dell'array

        /*
        System.out.println(ar_n2[0]);
        System.out.println(ar_n2[1]);
        System.out.println(ar_n2[2]);
        */
        //Stampare array con FOR
        for(int i = 0; i < ar_n2.length; i++){
            System.out.println(ar_n2[i]);
        }

        System.out.println("stampo con for abbreviato");
        //Stampare array con for each
        for(int el:ar_n2){
            System.out.println(el);
        }

        //Dato un array numerico stampare la somma di tutti gli elemnti
        int[] ar_es1 = {2,65,7,34,56};
        int somma = 0;

        for (int i = 0; i<ar_es1.length; i++){
            somma += ar_es1[i];
        }

        System.out.println("La somma è: " + somma);

        somma = 0;
        for(int el:ar_es1){
            somma += el;
        }

        System.out.println("La somma for abbreviato è: " + somma);

        Random rm = new Random();

        //Riempire un array vuoto di 5 elementi con numeri randomici e fare la somma dei numeri
        int[] ar_random = new int[5];

        //Inizializzo l'array con valori randomici
        for (int i = 0; i < ar_random.length; i++) {
            ar_random[i] = rm.nextInt(90) + 1; //Numeri da 1 a 90 in modo casuale
        }

        System.out.println("Stampa arry casuale");
        for (int i = 0; i < ar_random.length; i++) {
            System.out.println(ar_random[i]);
        }

        somma = 0;

        for (int i = 0; i < ar_random.length; i++) {
            somma += ar_random[i];
        }
        System.out.println("La somma randomica è: " + somma);


        String[] simboli = {"carta", "sasso", "forbici"};

        System.out.println(simboli[rm.nextInt(3)].equals("forbici"));

    }
}
