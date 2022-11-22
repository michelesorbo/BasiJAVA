package Esercizio08;

import java.util.Random;

public abstract class Azzardo {

    Random rm = new Random();

    abstract int lancio();
    abstract boolean Compare(int n);
}
