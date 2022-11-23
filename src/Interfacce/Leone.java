package Interfacce;

public class Leone extends Animale implements Predatore{
    Leone(String nome) {
        super(nome);
    }

    @Override
    public void caccia() {
        System.out.println("Inizia la caccia");
    }
}
