package Esercizio09;

public class Quadro extends OpereDarte{

    private double larghezza;
    private double altezza;

    Quadro(String titolo, String autore, double larghezza, double altezza) {
        super(titolo, autore);
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    public String toString(){
        return "Titolo: " + getTitolo() + " Autore: " + getAutore() + " Dimensioni: " + altezza + " x " + larghezza;
    }

    @Override
    double ingombro() {
        return larghezza*altezza/10000;
    }
}
