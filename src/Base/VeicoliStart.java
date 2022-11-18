package Base;

public class VeicoliStart {
    public static void main(String[] args) {
        Veicolo v1 = new Veicolo("TR001", "Furgone", "Michele Sorbo", 15000.300);
        Veicolo v2 = new Veicolo("TR002");


        System.out.println("Il rimborso di V2 per 27 km è: " + v2.calcoloRimborso(27) + "€");
        System.out.println("Il riborso di V1 per 27 km è: " + v1.calcoloRimborso(27) + "€");
        System.out.println("Il costo per km è: " + v1.getCosto_km());
        v1.setProprietario("Mario Rossi");
        System.out.println(v1.getProprietario());
        System.out.println(v1.getKm_percorsi());
        v1.aggKM(75.5);
        v1.aggKM(25);
        System.out.println(v1.getKm_percorsi());
    }
}
