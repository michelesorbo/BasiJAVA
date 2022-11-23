package Interfacce;

public class Start {
    public static void main(String[] args) {
        Leone l1 = new Leone("Simba");
        Gazzella g1 = new Gazzella("Bambi");
        Pesce p1 = new Pesce("Nemo");

        l1.caccia();
        g1.scappa();
        p1.caccia();
        p1.scappa();
    }
}
