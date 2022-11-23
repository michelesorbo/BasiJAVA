package Esercizio09;

import java.util.ArrayList;

public class Arte {
    public static void main(String[] args) {

        String nomeGalleria = "MAV";
        String info = "Apertura dal 12 Dicembre 2022";

        Quadro q1 = new Quadro("Natura Morta", "Picasso", 200,100);
        Quadro q2 = new Quadro("Gioconda","Leonardo", 100,50);
        Quadro q3 = new Quadro("Gioconda","Leonardo", 120,50);
        Scultura s1 = new Scultura("David", "Donatello", 400,600,200);


        //POLIMORFISMO
        ArrayList<OpereDarte> collezione = new ArrayList<OpereDarte>();

        collezione.add(q1);
        collezione.add(q2);
        collezione.add(s1);

        System.out.println("Nella collezione del " + nomeGalleria + " sono presenti le seguenti opere: ");
        for (int i = 0; i < collezione.size(); i++) {
            System.out.println("Opera: " + collezione.get(i).getTitolo() + " Autore: " + collezione.get(i).getAutore());
        }



        System.out.println("Ingombro primo quandro: " + q1.ingombro() + "mq");
        System.out.println("Ingombro secondo quandro: " + q2.ingombro() + "mq");
        System.out.println("Ingombro prima scultura: " + s1.ingombro() + "mq");

        System.out.println(q2.equals(q3));

    }
}
