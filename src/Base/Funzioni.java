package Base;

public class Funzioni {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        saluta(); //Vado a richiamare il metodo sotto
        saluta();
        saluta();
        salutoNome("Martine", "Marelli", 19);
        salutoNome("Beatrice", "Tavecchio", 19);
        salutoNome("Nicola", "Peluso", 28);
        String nome = "Michlele"; //Questo nome non è quello del metodo
        String cognome = "Sorbo";
        int eta = 43;
        salutoNome(nome, cognome, eta);

        int n1 = 28, n2 = 4;
        double ris = divisione(n1,n2);
        System.out.println("il risultato è: " + ris);

        System.out.println("La divisione è: " + divisione(4,0));

        System.out.println("La somma è: " + somma(4,6));
        System.out.println("La somma è: " + somma(4,5,7));
        System.out.println("La somma è: " + somma(3.5,8));

    }

    //Metodo senza ritorno e senza parametri
    public static void saluta() {
        System.out.println("Ciao dal metodo Saluta");
    }

    public static void error() {
        System.out.println("Errore critico");
    }

    //Metodo senza ritorno ma con parametri
    public static void salutoNome(String nome, String cognome, int eta) {
        System.out.println("Ciao da " + nome + " " + cognome + " " + eta);
    }

    //Metodo con ritorno e con parametri
    public static double divisione(double a, double b) {
        if(a != 0 && b != 0) {
            return a/b;
        }else {
            error();
            return 0;
        }
    }


    //OVERLOADED dei metodi

    public static int somma(int a, int b) {
        return a + b;
    }

    public static int somma(int a, int b, int c) {
        return a+b+c;
    }

    public static double somma(double a, double b) {
        return a + b;
    }
}
