package Esercizio08;

public class Moneta extends Azzardo{

    String[] lati = {"Testa", "Croce"};

    @Override
    void lancio() {
        System.out.println("Per la moneta è uscito: " + lati[rm.nextInt(2)]);
    }
}
