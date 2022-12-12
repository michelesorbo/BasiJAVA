package Esercizio12;

public class Eser2 {

    public static void main(String[] args) {
        System.out.println("Primo Esercizio");

        int fine = 5;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= fine; j++) {
                System.out.print("*");
            }
            fine--;
            System.out.println("");
        }

        System.out.println("\n\nSecondo Esercizio");

        fine = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < fine; j++) {
                System.out.print("*");
            }

            fine++;
            System.out.println("");
        }

        System.out.println("\n\nTerzo Esercizio metodo con stringhe");

        fine = 6;
        String st_i = "", st_j = "";
        for (int i = 1; i <= 6; i++) {
            st_i += i;
            st_j = "";
            for (int j = fine; j >0; j--) {
                st_j += j;
            }

            fine--;
            System.out.println(st_i + " " + st_j);
        }

        System.out.println("\n\nMetodo Senza Stringhe");

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.print(" ");
            for (int k = 7; k > i; k--) {
                System.out.print(k - i);
            }
            System.out.print("\n");
        }

    }

}
