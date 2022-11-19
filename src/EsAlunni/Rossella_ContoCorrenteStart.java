package EsAlunni;

import java.util.Scanner;

public class Rossella_ContoCorrenteStart {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int scelta;
        double soldi_versati;
        String proprietario,numero_conto;
        double soldi;
//        System.out.println("Inserisci proprietario,numero di conto e soldi");
//        proprietario=input.nextLine();
//        numero_conto=input.nextLine();
//        soldi=input.nextDouble();
        do {
            System.out.println("Buongiorno quale operazione vuole fare,scelga tra le seguenti operazioni: \n" +
                    "1.Versamento\n" +
                    "2.Prelievo\n" +
                    "3.Saldo\n" +
                    "4. Ultimi 5 movimenti\n" +
                    "5. Info conto\n" +
                    "6. Esci\n");
            System.out.println("Fai la tua scelta\n");
            scelta = input.nextInt();
            Rossella_ContoCorrente oggetto = new Rossella_ContoCorrente("michle", "12wwe1", 10000);
            if (scelta != 1 && scelta != 2 && scelta != 3 && scelta != 4 && scelta != 5&& scelta != 6) {
                System.out.println("Scelta sbagliata. Siamo spiacenti!");
            } else if (scelta == 1) {
                System.out.println("Quanto vuoi versare?");
                soldi_versati = input.nextDouble();
                oggetto.versamento(soldi_versati);
            } else if (scelta == 2) {
                System.out.println("Quanto vuoi prelevare?");
                soldi_versati = input.nextDouble();
                oggetto.prelievo(soldi_versati);
            } else if (scelta == 3) {
            //System.out.println("Ecco il tuo saldo");
            //oggetto.saldo();
                oggetto.testSaldo();
                System.out.println(oggetto.saldo_iniziale);
            } else if (scelta == 4) {
                System.out.println(oggetto.movimenti);
                oggetto.lista_movimenti(oggetto.movimenti);
            }
            else if (scelta == 5) {
                oggetto.infoConto();
            } else if (scelta == 6) {
                System.out.println("Grazie di tutto");
            }
        }while( scelta !=6);
    }
}
