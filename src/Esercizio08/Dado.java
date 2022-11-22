package Esercizio08;

public class Dado extends Azzardo {
    int facce;

    Dado(int facce){
        this.facce = facce;
    }


    @Override
    int lancio() {
        return rm.nextInt(facce) + 1;
    }

    @Override
    boolean Compare(int n) {
        int lancio = this.lancio();
        System.out.println("D1 = " + lancio);
        System.out.println("D2 = " + n);
        if(lancio > n){
            return true;
        }else{
            return false;
        }
    }
}
