package Ereditarieta;

public class EreditarietaStart {
    public static void main(String[] args) {
        Persona p1 = new Persona("Michele", "Sorbo", 43, "Caserta");
        Studente s1 = new Studente("Salvatore", "Amato",24,"Napoli", "4A");
        Docente d1 = new Docente("Mario", "Rossi", 54,"Roma", "Italiano");
        StudentePrivato sp1 = new StudentePrivato("Giuseppe", "Rossi", 21, "Napoli", "5C", "Privato 1");

        p1.Presenta();
        s1.Presenta();
        d1.Presenta();
        s1.getClasse();//Vale solo per Studente
        d1.Insegna();
        sp1.Presenta();
        sp1.getClasse();
        sp1.getistituto();
        sp1.Saluto();
    }
}
