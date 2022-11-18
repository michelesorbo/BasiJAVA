package Base;

import java.util.Random;
import java.util.Scanner;

public class OperazioniMatematiche_start {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rm = new Random();
        int n1,n2,n3;
        OperazioniMatematiche opm = new OperazioniMatematiche(); //Oggetto della classe Operazioni Matematiche


        System.out.println("Ti faccio la somma di 2 numeri");
        System.out.println("N1");
        n1 = in.nextInt();
        System.out.println("N2");
        n2 = in.nextInt();

        System.out.println(opm.somma(n1,n2));
        System.out.println(opm.divisione(n1,n2));
        System.out.println(opm.divisione(4,0));
    }
}
