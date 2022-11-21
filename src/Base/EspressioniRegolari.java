package Base;
/*
Pattern Class - Defines a pattern (to be used in a search)
Matcher Class - Used to search for the pattern
 */


import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EspressioniRegolari {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("([0-9]+)"); //Verifica la mail
        Matcher matcher = pattern.matcher("w3school");
        boolean matchFound = matcher.find();

        if(matchFound){
            System.out.println("Regola valida");
        }else{
            System.out.println("Regola errata non valida");
        }
    }
}
