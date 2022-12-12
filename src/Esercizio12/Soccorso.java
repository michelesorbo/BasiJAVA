package Esercizio12;

import java.util.ArrayList;
import java.util.Collections;

public class Soccorso {
    private ArrayList<Paziente> attesa = new ArrayList<Paziente>();
    private ArrayList<Paziente> attesa_rossa = new ArrayList<Paziente>();
    private ArrayList<Paziente> attesa_gialla = new ArrayList<Paziente>();
    private ArrayList<Paziente> attesa_verde = new ArrayList<Paziente>();


    public void ingresso(Paziente pz){
        //Il metodo ingresso aggiunge un nuovo paziente nella lista
        if(pz.getPriorita().equals("Rosso")){
            attesa_rossa.add(pz);
        }else if(pz.getPriorita().equals("Giallo")){
            attesa_gialla.add(pz);
        }else{
            attesa_verde.add(pz);
        }
    }

    public void dimissione(){
        //mentre il metodo dimissione serve il prossimo paziente in attesa e lo cancella dalla lista
        if(attesa_rossa.size() > 0){
            System.out.println("Prossimo paziente: " + attesa_rossa.get(0));
            attesa_rossa.remove(0);
        } else if (attesa_gialla.size() > 0) {
            System.out.println("Prossimo paziente: " + attesa_gialla.get(0));
            attesa_gialla.remove(0);
        }else{
            System.out.println("Prossimo paziente: " + attesa_verde.get(0));
            attesa_verde.remove(0);
        }
    }

    public void entrata(Paziente pz){
        attesa.add(pz);
        ordinaP();
    }

    public void uscita(){
        for (int i = 0; i < attesa.size(); i++) {
            System.out.println(i + " = " + attesa.get(i));
        }
    }

    public void ordinaP(){
        System.out.println("Ordino la lista per le priorità");

    }


}

