package Ereditarieta;

import java.util.ArrayList;

public class EreditarietaStart {
    public static void main(String[] args) {
        Persona p1 = new Persona("Michele", "Sorbo", 43, "Caserta");
        Studente s1 = new Studente("Salvatore", "Amato",24,"Napoli", "4A");
        Studente s2 = new Studente("Salvatore", "Rossi",24,"Napoli", "4A");
        Docente d1 = new Docente("Mario", "Rossi", 54,"Roma", "Italiano");
        StudentePrivato sp1 = new StudentePrivato("Giuseppe", "Rossi", 21, "Napoli", "5C", "Privato 1");

        ArrayList<Studente> alunni = new ArrayList<Studente>();

//        alunni.add(s1);
//        alunni.add(s2);
//        for (int i = 0; i < alunni.size(); i++) {
//            alunni.get(i).Presenta();
//
//        }

//        p1.Presenta();
//        s1.Presenta();
//        d1.Presenta();
//        s1.getClasse();//Vale solo per Studente
//        d1.Insegna();
//        sp1.Presenta();
//        sp1.getClasse();
//        sp1.getistituto();
//        sp1.Saluto();

        //System.out.println(p1.toString());
        System.out.println(p1);
        System.out.println(

        );
    }
}
