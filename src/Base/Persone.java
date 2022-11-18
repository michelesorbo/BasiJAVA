package Base;

public class Persone {
    private String nome;
    private String cognome;
    private int eta;
    private String cf;

    //Costruttore della classe
    Persone(String nome, String cognome, int eta, String cf){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.cf = cf;
    }

    //OVERLOAD Costruttore
    Persone(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = 0;
        this.cf = "";
    }


    void dimmiNome(){
        String nome = "Pippo";
        System.out.println("Il valore del nome del metodo è: " + nome);
        System.out.println("Il valore del nome della classe è: " + this.nome);
    }

    public void stampaPersona(){
        System.out.println("Nome: " + nome + " Cognome: " + cognome + " Età: " + eta + " C.F.: " + cf);
    }

    //Incapsulamento
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCognome(){
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    void getEta(){
        System.out.println("L'età della persona è: " + eta);
    }
    public void setEta(int eta){
        this.eta = eta;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }
}
