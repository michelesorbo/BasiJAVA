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
        scelta = in.nextLine();
        //Vado a verificare l'esito dal metodo
        System.out.println(esito(scelta));

    }

    public static int esito(String giocata){
        /*
        I ritorn sono:
        1 - Vinto
        2 - Perso
        0 - Pareggio
         */

        Random rm = new Random();

        String[] simboli = {"carta", "sasso", "forbici"}; //Array delle scelte
        
        String computer = simboli[rm.nextInt(3)]; //Il computer sceglia il suo simbolo
        System.out.println("Il computer ha giocato: " + computer);
        
        if(giocata.toLowerCase().equals(computer)){
            return 0;
        } else if (giocata.toLowerCase().equals("forbici") && computer.equals("carta") || giocata.toLowerCase().equals("sasso") && computer.equals("forbici") || giocata.toLowerCase().equals("carta") && computer.equals("sasso")) {
            return 1; //Vittori
        }else{
            return 2;
        }
    }
}
