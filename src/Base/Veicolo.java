package Base;

public class Veicolo {
    private String targa;
    String modello;
    private String proprietario;
    private double km_percorsi;
    private double costo_km = 1.7;

    //Costruttore
    Veicolo(String targa, String modello, String proprietario, double km_percorsi){
        this.targa = targa;
        this.modello = modello;
        this.proprietario = proprietario;
        this.km_percorsi = km_percorsi;
    }

    Veicolo(String targa){
        this.targa = targa;
        this.modello = "Non presente";
        this.proprietario = "Non presente";
        this.km_percorsi = 0;
    }

    public void dettagliVeicolo(){
        System.out.println("La targa è: " + targa);
        System.out.println("Il modello è: " + modello);
        System.out.println("Il proprietario è: " + proprietario);
        System.out.println("I km percorsi sono: " + km_percorsi);
    }

    public double calcoloRimborso(double km_da_rimborsare){
        return km_da_rimborsare * costo_km;
    }

    public double getCosto_km(){
        return costo_km;
    }

    public String getProprietario(){
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        int controllo = 0;
        for (int i = 0; i < proprietario.length(); i++) {
            if(proprietario.charAt(i) == '0' || proprietario.charAt(i) == '1' || proprietario.charAt(i) == '2'){
                controllo++;
            }
        }
        if(controllo > 0){
            System.out.println("Nome non valido");
        }else {
            this.proprietario = proprietario;
        }

    }


    public double getKm_percorsi(){
        return km_percorsi;
    }

    public void aggKM(double km){
        km_percorsi += km;
    }
}
