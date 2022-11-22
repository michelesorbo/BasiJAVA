package Esercizio08;

public class Moneta extends Azzardo{

    /*
    0 = testa
    1 = croce
     */
    String[] lati = {"Testa", "Croce"};



    @Override
    int lancio() {
        if(rm.nextInt(2) == 0){
            System.out.println("Computer : " + lati[0]);
            return 0;
        }else{
            System.out.println("Computer : " + lati[1]);
            return 1;
        }

    }

    @Override
    boolean Compare(int n) {
        int ricordo = this.lancio();
        if(ricordo == n){
            return true;
        }else{
            return false;
        }
    }


}
