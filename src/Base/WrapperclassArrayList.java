package Base;

import java.util.ArrayList;

public class WrapperclassArrayList {

    public static void main(String[] args) {
        char ch = 'a';
        int n = 5; //Tipo primitivo di variabile

        //Wrapper Class
        String nome = "Michele"; //Stringhe
        Character carattere = 'c'; //Caratteri
        Integer numero = 5; //Interi
        Double numero_virgole = 5.21; //double
        Boolean vero = true; //booleano

        //ArrayList sono array dinamici ma accettano solo tipi Wrapper Class
        ArrayList<String> alunni = new ArrayList<String>();

        alunni.add("salvatore"); //Add serve per aggiungere un elemnto nell'Array list
        alunni.add("rossella");
        alunni.add("luca");
        alunni.add(1, "Alessandro");

        //Per conoscere quanti elementi ci sono in un ArrayList uso il metodo size()
        System.out.println(alunni.size()); //Corrisponde a length di array

        //Per visualizzare un elemento dell'ArrayList uso il metodo get(indice dell'elemento)
        System.out.println(alunni.get(0)); //Corrisponde alunni


        //Stampo tutti gli elementi dell'ArrayList
        System.out.println("stampo gli elementi dell'ArrayList");
        for (int i = 0; i < alunni.size(); i++) {
            System.out.println(alunni.get(i));
        }

        //Modificare elementi in ArrayList
        alunni.set(1, "beatrice"); //alunni[1] = "beatrice"
        System.out.println(alunni.get(1));

        //Elimenare un elemento dall'ArrayList
        alunni.remove(1);
        System.out.println("stampo gli elementi dopo il remove dell'ArrayList");
        for (int i = 0; i < alunni.size(); i++) {
            System.out.println(alunni.get(i));
        }

        //Cancellare tutto l'ArrayList
        alunni.clear();
        System.out.println(alunni.size());


    }
}
