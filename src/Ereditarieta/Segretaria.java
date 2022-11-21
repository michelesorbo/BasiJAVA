package Ereditarieta;

public class Segretaria extends Persona{

    String stanaza;
    Segretaria(String nome, String cognome, int eta, String cittaResidenza, String stanaza) {
        super(nome, cognome, eta, cittaResidenza);
        this.stanaza = stanaza;
    }

    public void getStanaza() {
        System.out.println("Lavoro nella stanza " + stanaza);
    }
}
