package Esercizio08;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Dado d1 = new Dado(6);
        Dado d2 = new Dado(6);
        Moneta m1 = new Moneta();

        Scanner in = new Scanner(System.in);
        String scelta;

        System.out.println("Lancio della moneta: " + m1.lancio());
        //System.out.println("Dato 1: " + d1.lancio());
        //System.out.println("Dado 2: " + d2.lancio());
        if(d1.Compare(d2.lancio()) == true){
            System.out.println("D1 ha vinto");
        }else{
            System.out.println("D2 ha vinto");
        }

        System.out.println("Inserisci Testa o Croce");
        scelta = in.nextLine();

        if(scelta.equals("testa")){
            if(m1.Compare(0)){
                System.out.println("Vinto");
            }else{
                System.out.println("Perso");
            }
        }else{
            if(m1.Compare(1)){
                System.out.println("Vinto");
            }else{
                System.out.println("Perso");
            }
        }
    }



}
