package Base;

import java.util.Scanner;

public class Cicli {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);

        /*
         * ++ incrementa di 1 l'indice
         * -- decrementa di 1 l'indice
         */

        //Ciclo For
        //Inizializzo indice; condizione; incremeto
        for(int i = 1; i < 11; i++) {
            System.out.println("Ciao " + i);
        }

        System.out.println("Fine FOR");


        //Chiedere 3 numeri e stampare la somma
//		int n, somma = 0;
//
//		for(int i = 1; i < 4; i++) {
//			System.out.println("dammi il " + i + "° numero da sommare");
//			n = in.nextInt();
//			somma += n; //somma = somma + n;
//		}
//
//		System.out.println("Il totla è: " + somma);


        //WHILE
        int i = 1; //Inizializzo indice
        while(i < 11) { //Condizione
            //i++;
            System.out.println("Ciao da While " + i);
            i++; //Incremento
        }


        //Chiedere i numeri da sommare finire quando si inserisce 0
//		int n, somma = 0;
//		System.out.println("Dammi un numero da sommare mi fermo se inserisci 0");
//		n = in.nextInt();
//
//		while(n != 0) {
//			somma += n;
//			System.out.println("Inserisci un nuovo numero, 0 per terminare");
//			n = in.nextInt(); //Nuovo indice
//		}

        //System.out.println("Il totla è: " + somma);

        //Fare un programma che prenda in input vari numeri finchè non si inserisce 0
        //Stampare la somma e la media

        int somma = 0;
        int conta = 0, n;

        /*
        System.out.println("Dammi un numero da sommare mi fermo se inserisci 0");
        int n = in.nextInt();

        while(n != 0) {
            somma += n;
            conta++; //Incrememnto il contatore di numeri
            System.out.println("Inserisci un nuovo numero, 0 per terminare");
            n = in.nextInt(); //Nuovo indice
        }
        */

        /*
        do{
            System.out.println("Inserisci un numero, 0 per terminare");
            n = in.nextInt();
            if(n != 0){
                somma += n;
                conta++;
            }
        }while (n != 0);

        System.out.println("Hai inserito " + conta + " numeri");
        System.out.println("Il totale è: " + somma + " La media è: " + (somma/conta));

         */
        //Switch Case
        System.out.println("Scegli un piatto\n1)Pasta\n2)Carne\n3)Dolce");
        //int scelta = in.nextInt();
        String scelta = in.nextLine();

        /*
        if(scelta == 1){
            System.out.println("Pasta");
        }else if(scelta == 2){
            System.out.println("Carne");
        }else if(scelta == 3){
            System.out.println("Dolce");
        }else{
            System.out.println("Scelta non valida");
        }

         */
        //Lo rifaccio con lo switch
        switch (scelta.toLowerCase()){
            case "pasta":
                System.out.println("Pasta");
                break;
            case "carne":
                System.out.println("Carne");
                break;
            case "dolce":
                System.out.println("Dolce");
                break;
            default:
                System.out.println("Scelta non consentita");
        }

    }
}
