package Astrazione;

public class Auto extends Veicolo{

    Auto(String nomeModello, int annoCostruzione) {
        super(nomeModello, annoCostruzione);
    }

    @Override
    public void muovi(){
        System.out.println("Inizio a muovermi e consumo benzina");
    }

    @Override
    public void frena(){
        System.out.println("Mi fermo e smetto di consumare");
    }
}
