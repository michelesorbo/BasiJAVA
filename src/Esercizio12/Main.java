package Esercizio12;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Soccorso sc = new Soccorso();
        Paziente p0 = new Paziente("Mario", "Rossi", "001", "Verde");
        Paziente p1 = new Paziente("Giuseppe", "Bruni", "002", "Giallo");
        Paziente p2 = new Paziente("Valeria", "Mori", "003", "Rosso");
        Paziente p3 = new Paziente("Giuseppe", "Neri", "004", "Giallo");



        sc.entrata(p0);
        sc.entrata(p1);
        sc.entrata(p2);
        sc.entrata(p3);

        sc.uscita();
    }
}
