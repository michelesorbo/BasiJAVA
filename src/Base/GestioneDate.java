package Base;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestioneDate {
    public static void main(String[] args) {

        //Data Corrente
        LocalDate data = LocalDate.now();
        LocalDate data2 = LocalDate.of(2023,11,4);
        System.out.println(data); //Data in Americano Anno/mese/giorno

        System.out.println(data.compareTo(data2));

        //Ora corrente
        LocalTime ora = LocalTime.now();
        System.out.println(ora);

        System.out.println(data + " " + ora);

        LocalDateTime data_completa = LocalDateTime.now();
        System.out.println(data_completa);

        //Come cambiare la formattazione di una data
        DateTimeFormatter itDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data in formato italiano " + data.format(itDateFormat));

        //Formattare con mese in formato testo
        DateTimeFormatter itDateMese = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println("Data con mese esteso " + data.format(itDateMese));

        DateTimeFormatter itMeseGiorno = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        System.out.println("Data con giorno " + data.format(itMeseGiorno));

        DateTimeFormatter itOraMinuti = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy - HH:mm");
        System.out.println("Data estesa con ora e minuti " + data_completa.format(itOraMinuti));

        //Esercizio Comparare due date
        Scanner in = new Scanner(System.in);
        int anno, mese, giorno;

        System.out.println("CONFRONTIAMO LE DATE ,se metti date errate inserirò 1 e 1 come mese e giorno");

        System.out.println("inserisci giorno:");
        giorno = in.nextInt();
        System.out.println("inserisci mese:");
        mese = in.nextInt();
        System.out.println("inserisci anno:");
        anno = in.nextInt();


        giorno = giorno > 0 && giorno < 32 ? giorno : 1;
        mese = mese > 0 && mese < 13 ? mese : 1;
        System.out.println("sono giorno ok: " + giorno);

        data2 = LocalDate.of(anno,mese,giorno);

        System.out.println(data.compareTo(data2));

        if (data.compareTo(data2) == 0){
            System.out.println("le date inserite combaciano");
        } else if (data.compareTo(data2) > 0) {
            System.out.println("la data che hai scelto è un giorno del passato");
        } else {
            System.out.println("la data che hai inserito è un giorno del futuro");
        }

    }

}
