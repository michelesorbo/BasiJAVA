package Esercizi;

import java.util.Scanner;

public class ContoCorrenteStart {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        ContoCorrente cc1 = new ContoCorrente(50000, "Michele Sorbo", "IT001");
        ContoCorrente cc2 = new ContoCorrente(25000,"Mario Rossi","IT002");
        ContoCorrente cc3 = new ContoCorrente(23000,"Giuseppe verdi", "IT003");
        int scelta;
        double somma;

        cc2.setNumeroCC(25);

        cc1.stampaNumeroCC();
        cc1.stampa_saldo();
        cc2.stampaNumeroCC();
        cc2.stampa_saldo();
        cc3.stampaNumeroCC();
        cc3.stampa_saldo();


        do {
            System.out.println("Benvenuto nella gestione del conto corrente");
            System.out.println("\t1 - Vesamento\n\t2 - Prelievo\n\t3 - Saldo Attuale\n\t4 - Ultimi 5 movimenti\n\t5 - Info Conto\n\t0 - Esci");

            scelta = scanner.nextInt();

            if(scelta == 1) {
                System.out.println("Quanto vuoi versare?");
                somma = scanner.nextDouble();
                cc1.versa(somma);

            }else if(scelta == 2) {
                System.out.println("Quanto vuoi prelevare?");
                somma = scanner.nextDouble();
                cc1.preleva(somma);

            }else if(scelta == 3) {
                cc1.stampa_saldo();

            }else if(scelta == 4) {

                cc1.stampa_movimenti();

            }else if(scelta == 5) {

                cc1.info_conto();

            }else{

                System.out.println("Scelta non valida");

            }
        }while(scelta != 0);

        System.out.println("Sessione chiusa");



    }
}
