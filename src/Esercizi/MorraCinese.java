package Esercizi;

import java.util.Random;
import java.util.Scanner;

public class MorraCinese {
    /*
    Gioca alla morra cinese con il PC
    Il sistema esce quando viene scritto fine
    L'utente deve inserire Carta, Forbici o Sasso (non importa minuscole o maiscole)
    Quando faccio un lancio devo conoscere l'esito (Vinto, Perso, Paraggio)
    Quado finisco il gioco devo conoscere quate partite ho fatto e quante volte ho vinto perso o pareggiato
     */
    public static void main(String[] args) {
        int vittorie = 0, pareggi = 0, sconfitte = 0, giocate = 0;
        Scanner in = new Scanner(System.in);
        String scelta;

        System.out.println("Giochiamo alla morra cinese, scrivi Carta, Sassi o Forbici");
        do{
            System.out.println("Fai la tua Scelta: Carta - Sasso - Forbici\nFine per terminare");
            scelta = in.nextLine();

            if(scelta.toLowerCase().equals("carta") || scelta.toLowerCase().equals("sasso") || scelta.toLowerCase().equals("forbici")){

                if(esito(scelta) == 0){
                    System.out.println("Pareggio");
                    pareggi++;
                } else if (esito(scelta) == 1) {
                    System.out.println("Hai vinto");
                    vittorie++;
                }else {
                    System.out.println("Hai perso");
                    sconfitte++;
                }

                giocate++; //Incremento il numero di giocate

            }else if(scelta.toLowerCase().equals("fine")){
                System.out.println("Grazie per aver giocato... alla prossima sfida");
            }else {
                System.out.println("Scelta non valida, ritenta");
            }

        }while (!scelta.toLowerCase().equals("fine"));


        //Vado a verificare l'esito dal metodo
        System.out.println("Hai giocato " + giocate + " partite");
        System.out.println("Hai vinto " + vittorie + " volte");
        System.out.println("Hai perso  " + sconfitte + " volte");
        System.out.println("Hai pareggiato " + pareggi + " volte");

    }

    public static int esito(String giocata){
        /*
        I ritorn sono:
        1 - Vinto
        2 - Perso
        0 - Pareggio
         */

        Random rm = new Random();
        String computer = "";

        String[] simboli = {"carta", "sasso", "forbici"}; //Array delle scelte
        
        computer = simboli[rm.nextInt(3)]; //Il computer sceglia il suo simbolo
        System.out.println("Il computer ha giocato: " + computer);
        
        if(giocata.toLowerCase().equals(computer)){
            return 0; //Pareggio
        } else if (giocata.toLowerCase().equals("forbici") && computer.equals("carta") || giocata.toLowerCase().equals("sasso") && computer.equals("forbici") || giocata.toLowerCase().equals("carta") && computer.equals("sasso")) {
            return 1; //Vittoria
        }else{
            return 2; //Perso
        }
    }
}
