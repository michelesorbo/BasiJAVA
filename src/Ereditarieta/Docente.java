package Ereditarieta;

public class Docente extends Persona {
    String materiainsegnata;

    Docente(String nome, String cognome, int eta, String cittaResidenza, String materiainsegnata) {
        super(nome, cognome, eta, cittaResidenza);
        this.materiainsegnata = materiainsegnata;
    }

    public void Insegna(){
        System.out.println("Insegno la materia " + materiainsegnata);
    }

    @Override
    public void Presenta(){
        System.out.println("Buongirno sono il prof. " + nome + " " + cognome);
    }
}
