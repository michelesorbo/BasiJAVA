package Base;

public class VeicoliStart {
    public static void main(String[] args) {
        Veicolo v1 = new Veicolo("TR001", "Furgone", "Michele Sorbo", 15000.300);
        Veicolo v2 = new Veicolo("TR002");


        System.out.println("Il rimborso di V2 per 27 km è: " + v2.calcoloRimborso(27) + "€");
        System.out.println("Il riborso di V1 per 27 km è: " + v1.calcoloRimborso(27) + "€");
        System.out.println("Il costo per km è: " + v1.getCosto_km());
    }
}
