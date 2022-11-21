package Base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
        System.out.println(alunni.get(0)); //Corrisponde alunni[i]


        //Stampo tutti gli elementi dell'ArrayList
        System.out.println("stampo gli elementi dell'ArrayList");
        for (int i = 0; i < alunni.size(); i++) {
            System.out.println(alunni.get(i));
        }


        //Modificare elementi in ArrayList
        alunni.set(1, "beatrice"); //alunni[1] = "beatrice"
        System.out.println(alunni.get(1));

        //Stampo l'Arraylist ordinato
        System.out.println("Stampo array ordinato");
        Collections.sort(alunni); //Ordino gli elemnti dell'array la modifica è permanente
        //Collections.reverse(alunni); //Ordina in modo inverso gli elementi dell'array
        for (int i = 0; i < alunni.size(); i++) {
            System.out.println(alunni.get(i));
        }

        //Per conoscere l'indice di un elemnto dell'ArrayList
        System.out.println(alunni.indexOf("rossella"));

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
