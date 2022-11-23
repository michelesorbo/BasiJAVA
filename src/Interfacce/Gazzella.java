package Interfacce;

public class Gazzella extends Animale implements Preda {
    Gazzella(String nome) {
        super(nome);
    }

    @Override
    public void scappa() {
        System.out.println("Iniza a correre");
    }
}
