package Esercizio10;

import java.util.Scanner;

public class InsiemeDiStringhe {

    private int i;
    private int n=0;
    private String[] T;

    InsiemeDiStringhe(int max) {//costruttore
        this.T = new String[max];
        this.n = max;

        for(i=0;i < T.length;i++){
            T[i]="";
        }
        System.out.println(T.length);
    }//fine costruttore

    public int getN() {
        return n;
    }

    public void getInsieme(){
        for (i=0; i<T.length;i++){
            System.out.println(T[i]);
        }
    }

    public void setInsieme(){
        Scanner in=new Scanner(System.in);
        for(i=0;i < T.length;i++) {
            System.out.print("ins:");
            T[i]=in.nextLine();
        }//fine for
        in.close();
    }//fine setInsieme

    public String stringaLunga(){
        String lunga="";
        int lgmax=0,i;

        for(i = 0; i<T.length; i++){
            if(T[i].length()>lgmax){
                lunga=T[i];
                lgmax=T[i].length();
            }//fine if
        }
        return lunga;
    }//fine getInsieme

    public String spaziStringa(){
        String lex="nessuna stringa con spazi";
        int i,j,spazi,spazimax=0;
        System.out.println();
        for(i=0;i < T.length;i++) {
            spazi=0;
            for(j=0;j < T[i].length();j++)
                if(T[i].charAt(j)==' ')spazi++;
            if(spazi > spazimax){
                spazimax=spazi;
                lex=T[i];
            }//fine if
        }//fine for i
        return lex;
    }//fine spaziStringa

    public void preStringa(String pre){
        int lg=0,i; String s="";
        lg=pre.length();
        for(i=0;i < T.length;i++)
            if(T[i].length() >= lg){
                s=T[i].substring(0, lg);
            if(s.compareTo(pre)==0)
                System.out.println(T[i]);
        }//fine if
    }//fine preStringa
}
