package Ereditarieta;

public class Bidello extends Persona{
    String piano;
    Bidello(String nome, String cognome, int eta, String cittaResidenza, String piano) {
        super(nome, cognome, eta, cittaResidenza);
        this.piano = piano;
    }

    public void getPiano() {
        System.out.println("Sono al piano: " + piano);
    }
}
