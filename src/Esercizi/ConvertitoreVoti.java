package Esercizi;

import java.util.Scanner;

public class ConvertitoreVoti {

    /*
    Scrivere un metodo per restituire una votazione scritta da un voto numerico.
    Se il professore inserisce un voto inferiore a 18 il metodo restituisce a video "Bocciato"
    Se inserisce un voto tra 18 e   restituisce "Appena sufficiente"
    Se inserisce un voto tra 21 e 24 restituisce "Sufficiente"
    Se inserisce un voto tra 25 e 27 restituisce "Buono"
    Se inserisce un voto tra 28 e 29 restituisce "Ottimo"
    Se inserisce un voto con 30 restituisce "Più che ottimo" e deve chiedere se applicare la lode
    se applica la lode restiruire "Ottimo 30 e lode"
    Non devo accettare voti superiori a 30

    Il convertitore si ferma con NO ES:
    Convertitore Voti
    Vuoi convertire un voto? SI/NO
     - Inserisci il voto da convertire: 28
     - Ottimo
     Vuoi convertire un voto? SI/NO
      - NO
      Grazie alla prossima
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String scelta;
        int voto;

        System.out.println("Convertitore di Voti");

        do{
            System.out.println("Vuoi convertire un voto? SI/NO");
            scelta = in.nextLine();

            if(scelta.toLowerCase().equals("si")){
                System.out.println("Inserisci il voto da convertire");
                voto = in.nextInt();
                ConvertitoreVoto(voto);
            }else if(scelta.toLowerCase().equals("no")){
                System.out.println("Grazie alla prossima");
            }else{
                System.out.println("Scelta non consentita");
            }
        }while (!scelta.toLowerCase().equals("no"));
    }

    public static void ConvertitoreVoto(int voto){

        Scanner in = new Scanner(System.in);

        if(voto < 18){
            System.out.println("Esame non superato");
        } else if (voto >=18 && voto <=20) {
            System.out.println("Appena sufficiente");
        } else if (voto >= 21 && voto <= 24) {
            System.out.println("Sufficiente");
        } else if (voto >= 25 && voto <= 27) {
            System.out.println("Buono");
        }else if (voto >= 28 && voto <= 29) {
            System.out.println("Ottimo");
        } else if (voto == 30) {
            System.out.println("Ha la lode? SI/NO");
            String lode = in.nextLine();
            if(lode.toLowerCase().equals("si")){
                System.out.println("Più che Ottimo 30 e lode");
            }else{
                System.out.println("Più che Ottimo");
            }
        }
    }
}
