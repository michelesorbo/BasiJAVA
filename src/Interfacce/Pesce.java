package Interfacce;

public class Pesce extends Animale implements Preda, Predatore {

    Pesce(String nome) {
        super(nome);
    }

    @Override
    public void scappa() {
        System.out.println("Nuota veloce");
    }

    @Override
    public void caccia() {
        System.out.println("Inizia la caccia nuotando");
    }
}
