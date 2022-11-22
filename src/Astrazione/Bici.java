package Astrazione;

public class Bici extends Veicolo{

    Bici(String nomeModello, int annoCostruzione) {
        super(nomeModello, annoCostruzione);
    }

    @Override
    void muovi(){
        System.out.println("inizio a pedalare");
    }

    @Override
    void frena(){
        System.out.println("Smetto di pedalare");
    }

    @Override
    public String toString(){
        return"Sono una Bici";
    }
}

