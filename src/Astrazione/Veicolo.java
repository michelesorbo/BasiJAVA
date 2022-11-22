package Astrazione;

public abstract class Veicolo {

    final String marca = "FIAT";
    String nomeModello;
    int annoCostruzione;

    Veicolo(String nomeModello, int annoCostruzione){
        this.nomeModello = nomeModello;
        this.annoCostruzione = annoCostruzione;
    }

    abstract void muovi();
    abstract void frena();

    void getMarca(){
        System.out.println("La marca dei veicoli è: " + marca);
    }

    public String toString(){
        return "Sono un veicolo";
    }
}
