package Esercizio09;

public abstract class OpereDarte {

    private String titolo;
    private String autore;

    abstract double ingombro();

    public String getTitolo(){
        return titolo;
    }

    public String getAutore(){
        return autore;
    }


    OpereDarte(String titolo, String autore){
        this.autore = autore;
        this.titolo = titolo;
    }

    public boolean equals(OpereDarte o){
        if(this.titolo.equals(o.getTitolo()) && this.autore.equals(o.getAutore())){
            return true;
        }else {
            return false;
        }
    }
}
