package Esercizio10;

import java.util.Scanner;

public class start {
    public static void main (String args []){
        Scanner in=new Scanner(System.in);
        int num;
        System.out.print("quante stringhe:");
        num=in.nextInt();
        InsiemeDiStringhe ins = new InsiemeDiStringhe(num);
        ins.setInsieme();
        ins.getInsieme();
        System.out.print("\nstringa più lunga:"+ins.stringaLunga());
        System.out.print("\nstringa con più spazi:"+ins.spaziStringa());
        System.out.print("\ncon prefisso:");
        ins.preStringa("ciao");
    }//fine main
}
