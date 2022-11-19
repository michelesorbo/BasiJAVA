package Base;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1,n2, result;

        try{
            System.out.println("Dammi il primo numero");
            n1 = in.nextDouble();
            System.out.println("Dammi il secondo numero");
            n2 = in.nextDouble();

            System.out.println("Prima del risultato");

            result = n1/n2;
            System.out.println("Il risultato è: " + result);
        }catch (InputMismatchException e){ //Conosco l'errore
            System.out.println("Non puoi inserire lettere ma solo numeri: " + e);
        }catch (ArithmeticException e){
            System.out.println("Non puoi  divedere un numero per 0");
        }catch (Exception e){//Cattura tutti gli errori
            System.out.println("C'è stato un errore di tipo: " + e);
        }finally {//Viene sempre eseguito
            System.out.println("sono finally");
            in.close();
        }

        System.out.println("Continua il programma");
    }
}
