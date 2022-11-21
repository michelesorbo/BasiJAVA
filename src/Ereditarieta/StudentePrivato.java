package Ereditarieta;

public class StudentePrivato extends Studente{
    String istituto;
    StudentePrivato(String nome, String cognome, int eta, String cittaResidenza, String classe, String istituto) {
        super(nome, cognome, eta, cittaResidenza, classe);
        this.istituto = istituto;
    }


    public void getistituto() {
        System.out.println("Provengo dall'istituo " + istituto);
    }
}
