package Esercizio09;

public class Scultura extends OpereDarte {
    private double larghezza;
    private double altezza;
    private double profondita;

    Scultura(String titolo, String autore, double larghezza, double altezza, double profondita) {
        super(titolo, autore);
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondita = profondita;
    }

    public String toString(){
        return "Titolo: " + getTitolo() + " Autore: " + getAutore() + " Dimensioni: " + altezza + " x " + larghezza + " x" + profondita;
    }

    @Override
    double ingombro() {
        return larghezza*altezza*profondita/1000000;
    }
}
