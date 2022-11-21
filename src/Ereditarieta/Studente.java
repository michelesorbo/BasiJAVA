package Ereditarieta;

public class Studente extends Persona {

    String classe;

    Studente(String nome, String cognome, int eta, String cittaResidenza, String classe) {
        super(nome, cognome, eta, cittaResidenza);
        this.classe = classe;
    }

    public void getClasse(){
        System.out.println("Frequento la " + classe);
    }

    @Override
    public void Presenta(){
        System.out.println("Buongiorno sono " + nome + " " + cognome);
    }
}
