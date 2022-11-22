package Astrazione;

public class AstrazioneStart {
    public static void main(String[] args) {
        Auto a1 = new Auto("Panda", 1980);
        Bici b1 = new Bici("Graziella",1900);

        a1.muovi();
        b1.muovi();
        b1.getMarca();
        a1.getMarca();
        System.out.println(a1);
        System.out.println(b1);
    }


}
