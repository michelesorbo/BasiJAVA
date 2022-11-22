package Base;
/*
Pattern Class - Defines a pattern (to be used in a search)
Matcher Class - Used to search for the pattern
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EspressioniRegolari {
    public static void main(String[] args) {

        /*
        1) Contiene stretto "agente 007" Pattern.CASE_INSENSITIVE rende il pattern indifferente dalle maiuscole e minuscole
        2) per accettare solo numeri si usa \d (Solo digit)
        3){3} indicano quante volte deve essere ripetuta la regola
        4) {3,6} indicano il range
        5) ^ la stringa deve iniziare sencondo la regola
        6) [aA] serve a definere il range dei caratteri accettati [a-z] oppure [A-Z] [0-9]
        7) (a|A|aa) serve a definire regole strette
        8) $ sta per fine stringa
         */
        //Creare la regola per il codice fiscale AAABBB11C22B333C ^[A-Z]{6}[0-9]{2}[A-Z]{1}[0-9]{2}[A-Z]{1}[0-9]{3}[A-Z]{1}$
        // ^[0-9]{5} Verifico CAP
        // ^(.+)@(.+)\.[a-z]{2,5}$ verifica della mail
        // +11 222-2345678 ^\\+[0-9]{2} [0-9]{3}-[0-9]{7}$
        Pattern pattern = Pattern.compile("^(.+)@(.+)\\.[a-z]{2,5}$");//Vado a scrivere le regole di RegEx
        Matcher matcher = pattern.matcher("test@test.cloud");

        boolean found = matcher.find();//Verifica se la regola è stata rispettata

        System.out.println(found);
    }
}
