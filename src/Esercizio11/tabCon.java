package Esercizio11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class tabCon extends JFrame {
    private JPanel mainPanel;
    JComboBox cTipoTemp;
    private JTextField tValoreTemp;
    private JButton bConverti;
    private JButton bReset;
    Double limiteTemp=999.0;

    public tabCon(){
        setContentPane(mainPanel);
        setTitle("Convertitore Temperature");
        setSize(650, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        cTipoTemp.addItem("Celsius");
        cTipoTemp.addItem("Kelvin");
        cTipoTemp.addItem("Fahrenheit");

        setVisible(true);
        bReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tValoreTemp.setText(Integer.toString(cTipoTemp.getSelectedIndex()));
            }
        });
        tValoreTemp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                //Imposto i limiti delle temperature
                if(cTipoTemp.getSelectedIndex()==0)limiteTemp=999.99;
                if(cTipoTemp.getSelectedIndex()==1)limiteTemp=1272.99;
                if(cTipoTemp.getSelectedIndex()==2)limiteTemp=1830.99;

                String dummy=tValoreTemp.getText()+String.valueOf(e.getKeyChar());
                int l=dummy.length();
                char c = e.getKeyChar();
                /* non accetta il carattere quando la temperatura diventa minore di -limiteTemp
                 * o maggiore di limiteTemp oppure quando viene digitato un simbolo diverso da:
                 * un digit, dal tasto BackSpace, dal tasto Delete, dal simbolo '-' posto davanti
                 * al numero (ad indicare una temperatura negativa) e dal simbolo '.' (per separare
                 * la parte intera da quella decimale)
                 */

                try{
                    if(!(Double.parseDouble(dummy)>=-1*limiteTemp && Double.parseDouble(dummy)<=limiteTemp && l<=8 ))
                        e.consume();
                }catch (Exception e2){
                    if (!( Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || (c=='-' && davantialnumero(dummy) && occorrenze('-', dummy)==1) || (c=='.' && occorrenze('.',dummy)==1)))
                    {
                        e.setKeyChar((char)0);
                        e.consume();
                    }
                }//---chiude try..catch ----------------------------
                }

        });
        bConverti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!tValoreTemp.getText().toString().equals(""))
                    converti(cTipoTemp.getSelectedIndex());
            }
        });
    }

    public static void main(String[] args) {
        tabCon tc = new tabCon();
    }
    //controlla che il simbolo '-' sia in prima posizione nella stringa
    boolean davantialnumero(String s)
    {
        if(s.charAt(0)=='-')return true;
        return false;
    }

    int occorrenze(Character ch,String s)
    {
        int k=0;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)==ch)k++;
        }
        return k;
    }

    void converti(int quale){
        double celsius,kelvin,fahren;
        String risultato;
        if(quale==0) { //da scala Celsius
            celsius=Double.parseDouble(tValoreTemp.getText());
            kelvin=celsius+273.15;
            fahren=celsius*9.0/5.0+32.0;
            kelvin=(int)(kelvin*1000)/1000.0;
            fahren=(int)(fahren*1000)/1000.0;
            risultato= "°Celsius: "+String.valueOf(celsius)+"\n";
            risultato+=" Kelvin: "+String.valueOf(kelvin)+"\n";
            risultato+="°Fahrenheit: "+String.valueOf(fahren);
            JOptionPane.showMessageDialog(this, risultato, "Risultati della conversione", JOptionPane.PLAIN_MESSAGE);
        }
        if(quale==1) { //da scala Kelvin
            kelvin=Double.parseDouble(tValoreTemp.getText());
            celsius=kelvin-273.15;
            fahren=kelvin*9.0/5.0-459.67;
            celsius=(int)(celsius*1000)/1000.0;
            fahren=(int)(fahren*1000)/1000.0;
            risultato=" Kelvin: "+String.valueOf(kelvin)+"\n";
            risultato+= "°Celsius: "+String.valueOf(celsius)+"\n";
            risultato+="°Fahrenheit: "+String.valueOf(fahren);
            JOptionPane.showMessageDialog(this, risultato, "Risultati della conversione", JOptionPane.PLAIN_MESSAGE);
        }
        if(quale==2) { // da scala Fahrenheit
            fahren=Double.parseDouble(tValoreTemp.getText());
            celsius=(fahren-32)*5.0/9.0;
            kelvin=5.0/9.0*(fahren-32)+273.15;
            celsius=(int)(celsius*1000)/1000.0;
            kelvin=(int)(kelvin*1000)/1000.0;
            risultato="°Fahrenheit: "+String.valueOf(fahren)+"\n";
            risultato+= "°Celsius: "+String.valueOf(celsius)+"\n";
            risultato+=" Kelvin: "+String.valueOf(kelvin);
            JOptionPane.showMessageDialog(this, risultato, "Risultati della conversione", JOptionPane.PLAIN_MESSAGE);
        }
    }// chiude converti()------------------------
}
