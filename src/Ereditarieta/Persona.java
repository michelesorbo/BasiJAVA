package Ereditarieta;

public class Persona {
    String nome;
    String cognome;
    int eta;
    String cittaResidenza;

    Persona(String nome, String cognome, int eta, String cittaResidenza){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.cittaResidenza = cittaResidenza;
    }

    public void Presenta(){
        System.out.println("Ciao da " + nome + " " + cognome);
    }

    public void Saluto(){
        System.out.println("Ciao");
    }
}
