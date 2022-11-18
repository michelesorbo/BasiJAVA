package Base;

public class Persone_start {
    public static void main(String[] args) {
        Persone p1 = new Persone("Michele","Sorbo",43,"SRB001");
        Persone p2 = new Persone("Salvatore", "Amato", 24, "AMT002");
        Persone p3 = new Persone("Franco", "Rossi");

        p1.getEta();
        p2.getEta();
        p3.setEta(56);
        p3.getEta();



    }

}
