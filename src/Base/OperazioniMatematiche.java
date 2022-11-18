package Base;

public class OperazioniMatematiche {

    public int somma(int a, int b){
        return a+b;
    }

    public double somma(double a, double b){
        return a+b;
    }

    public double somma(double a, double b, double c){
        return a+b+c;
    }

    public double divisione(double a, double b) {
        if(a != 0 && b != 0) {
            return a/b;
        }else {
            return 0;
        }
    }
}
