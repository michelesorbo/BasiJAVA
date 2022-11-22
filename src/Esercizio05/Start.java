package Esercizio05;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        int scelta, secondi;
        String numeroChiamato;
        Scanner in = new Scanner(System.in);
        Sim s1 = new Sim("3382345678", 10.58);

        do{
            System.out.println("Gestione della SIM: " + s1.getNumero());
            System.out.println("1) Dati SIM\n2) Inserisci telefonata\n3) Elenco chiamate");
            System.out.println("4) Cerca un numero \n0) Termina programma");
            scelta = in.nextInt();
            in.nextLine(); //PER Correzione BUG

            if(scelta == 1){
                System.out.println(s1);
            } else if (scelta == 2) {
                System.out.println("Inserisci il numero chiamato: ");
                numeroChiamato = in.nextLine();
                System.out.println("Inserisci i secondi di conversazione: ");
                secondi = in.nextInt();
                s1.IserisciTelefonata(numeroChiamato, secondi);
            } else if (scelta == 3) {
                System.out.println("\nELENCO CHIAMATE:");
                s1.ElencoChamate();
                System.out.println("\n");
            } else if (scelta == 4) {
                System.out.println("\nInserisci il numero da cercare: ");
                numeroChiamato = in.nextLine();
                System.out.println("\nElenco chiamate al numero: " + numeroChiamato);
                s1.ElencoChamate(numeroChiamato);
                System.out.println("\n");
            } else if (scelta == 0) {
                System.out.println("Chiusura programma");
            } else {
                System.out.println("Scelta non valida");
            }
        }while (scelta != 0);

    }
}
