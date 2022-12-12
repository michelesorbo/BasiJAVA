package Esercizio12;

public class Paziente {

    private String nome;
    private String congnome;
    private String codice;
    private String priorita;

    public Paziente(String nome, String congnome, String codice, String priorita){
        this.nome = nome;
        this.congnome = congnome;
        this.codice = codice;
        this.priorita = priorita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCongnome(String congnome) {
        this.congnome = congnome;
    }

    public String getCongnome() {
        return congnome;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }

    public void setPriorita(String priorita) {
        this.priorita = priorita;
    }

    public String getPriorita() {
        return priorita;
    }

    public String toString(){
        return "Nome: " + getNome() + " Cognoem: " + getCongnome() + " Codice: " + getCodice() + " Priorità: " + getPriorita();
    }
}
