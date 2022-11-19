package Esercizi;

import java.util.ArrayList;

public class ContoCorrente {
    /*
        Creare una classe ContoCorrente in grado di simulare un conto corrente reale,
        quindi con versamenti, prelievi, stampa saldo e la lista degli ultimi 5 movimenti.
        Costruttore: Saldo iniziale, Proprietario, N° Conto

        Far partire una schermata con le opzioni es:
        Benvenuto nel tuo conto
        1) Versa
        2) Preleva
        3) Saldo Attuale
        4) Ultimi 5 movimenti
        5) Info Conto (Restituisce Proprietario e N° Conto)
        0) Esci
     */

    private double saldo;
    private String proprietario;
    private String n_conto;
    //private String[] movimenti = new String[5]; //Conservare gli ultimi 5 movimenti
    ArrayList<String> movimenti = new ArrayList<String>();
    private int conta_movimenti = 0;
    static int numeroCCAperti = 0;

    ContoCorrente(int saldo_iniziale, String proprietario, String conto){
        this.saldo = saldo_iniziale;
        this.proprietario = proprietario;
        this.n_conto = conto;
        numeroCCAperti++;
    }

    public void stampaNumeroCC(){
        System.out.println("Numero cc aperti: " + numeroCCAperti);
    }

    public void setNumeroCC(int numero){
        numeroCCAperti = numero;
    }

    void setProprietatio(String nome) {
        proprietario = nome;
    }

    void versa(double somma) {
        saldo += somma;
        System.out.println("Versamento effettuato.");
        this.movimentiConto("Vesato " + somma);
    }

    void preleva(double somma) {
        if(somma > saldo) {
            System.out.println("Non puoi prelevare saldo inferiore");
        }else {
            saldo -= somma;
            System.out.println("Prelievo effettuato.");
            this.movimentiConto("Prelevato " + somma);
        }
    }

    void stampa_saldo() {
        System.out.println("Il saldo attuale è: " + saldo);
    }

    void info_conto() {
        System.out.println("Proprietario: " + proprietario);
        System.out.println("N° Conto: " + n_conto);
        System.out.println("Il saldo attuale è: " + saldo);
        System.out.println("Hai effettuato " + conta_movimenti + " movimenti sul conto");
        System.out.println("Numero di CC Aperti nella classe è: " + numeroCCAperti);
    }

    //Soluzione con ArrayList

    private void movimentiConto(String movimento){
        if(movimenti.size() > 4){
            movimenti.remove(0); //Tolgo elemnto più vecchio che è al primo posto
            movimenti.add(movimento); //Aggiungo ultimo movimento alla fine
        }else{
            movimenti.add(movimento);
        }
    }

    void stampa_movimenti(){
        for (int i = 0; i < movimenti.size(); i++) {
            System.out.println(movimenti.get(i));
        }
    }


    //USO DEGLI ARRAY
    /*
    //Metodo che aggiunge i movimenti nell'array movimenti classico
	private void movimentiConto(String movimento) {

		int i; //Per essere visibile in tutto il metodo

		if(conta_movimenti > 4) {
			for(i = 1; i < movimenti.length; i++) {
				movimenti[i-1] = movimenti[i]; //Sposto gli elementi di un indice
			}
			movimenti[i-1] = movimento; //Mette il versamento nell'ultima posizione dell'array
		}else{
			movimenti[conta_movimenti] = movimento;
		}

		conta_movimenti++;//Incremento il contatore di movimenti
	}

    //Metodo che stampa a video il contenuto dell'array movimenti
	void stampa_movimenti() {
		for(String el:movimenti) {
			System.out.println(el);
		}
	}

     */
}
