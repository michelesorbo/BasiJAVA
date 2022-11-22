package Esercizio08;

public class Dado extends Azzardo {
    int facce;

    Dado(int facce){
        this.facce = facce;
    }

    @Override
    public void lancio(){
        System.out.println("Risultato del lancio: " + (rm.nextInt(facce) + 1));
    }
}
