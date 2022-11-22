package Esercizio08;

import java.util.Random;

public abstract class Azzardo {

    Random rm = new Random();

    abstract void lancio();
    abstract void Compara();//Prende un dato o una moneta e stabilisce chi vince
    /*
    d1 = 4
    d2 = 6
    d1.Compara(d2) Restiruisce d2 ha vinto

    M1 = testa
    chiedere all'utente di scegliere testa o croce
    se m1 è uguale alla scelta l'utente ha vinto

     */
}
