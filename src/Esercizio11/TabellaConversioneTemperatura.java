package Esercizio11;
/*
 * Convertitore di temperature tra le scale
 * Celsius, Kelvin e Fahrenheit
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TabellaConversioneTemperatura extends JFrame implements ActionListener{
    Container c;
    JTable tabella;
    JButton bConverti,bReset;
    JLabel label0,label1,label2;
    JTextField tValoreTemp;
    JComboBox cTipoTemp;
    JPanel pBottoni;
    Double limiteTemp=999.0;
    public TabellaConversioneTemperatura() {
        String[] intestazionicolonne=new String[]{"Temperatura in Input [Range]","Risultato in °Celsius","Risultato in Kelvin","Risultato in °Fahrenheit"};
        String[][] formuletabella=new String[][] {
                {"°Celsius [-999.99 999.99]", "-", "°Celsius+273.15", "°Celsius*9/5+32"},
                {" Kelvin [-1272.99 1272.99]", " Kelvin-273.15", "-", " Kelvin*9/5-459.67" },
                {"°Fahrenheit [-1830.99 1830.99]","(°Fahrenheit-32)*5/9" ,"5/9*(°Fahrenheit-32)+273.15", "-" },
        };
        c=getContentPane();
//c.setLayout(new GridLayout(3,1));
        label0=new JLabel("Formule usate per i calcoli");
        label0.setHorizontalAlignment(SwingConstants.CENTER);
        tabella=new JTable(formuletabella,intestazionicolonne);
        tabella.setBackground(Color.YELLOW);
        label1=new JLabel("Scala: ");
        String[] tipi = new String[] {"Celsius", "Kelvin","Fahrenheit"};
        cTipoTemp=new JComboBox<>(tipi);
        label2=new JLabel(" Temperatura:");
        tValoreTemp=new JTextField(8);
        tValoreTemp.setPreferredSize(new Dimension(200, 28));
        tValoreTemp.setHorizontalAlignment(SwingConstants.CENTER);
        tValoreTemp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
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
                try {
                    if(!(Double.parseDouble(dummy)>=-1*limiteTemp && Double.parseDouble(dummy)<=limiteTemp && l<=8 ))
                        e.consume();
                } catch (Exception e2)
                {
                    if (!
                            ( Character.isDigit(c) ||
                                    c == KeyEvent.VK_BACK_SPACE ||
                                    c == KeyEvent.VK_DELETE ||
                                    (c=='-' && davantialnumero(dummy) && occorrenze('-', dummy)==1) ||
                                    (c=='.' && occorrenze('.',dummy)==1)
                            )
                    )
                    {
                        e.setKeyChar((char)0);
                        e.consume();
                    }
                }//---chiude try..catch ----------------------------
            }
        });
        bConverti=new JButton("Converti");
        bReset=new JButton("Reset");
        bConverti.addActionListener(this);
        bReset.addActionListener(this);
        pBottoni=new JPanel();
        pBottoni.add(label1);
        pBottoni.add(cTipoTemp);
        pBottoni.add(label2);
        pBottoni.add(tValoreTemp);
        pBottoni.add(bConverti);
        pBottoni.add(bReset);
//
        c.add(label0,BorderLayout.NORTH);
        c.add(new JScrollPane(tabella),BorderLayout.CENTER);
        c.add(pBottoni,BorderLayout.SOUTH);
//
        this.setTitle("Conversione di temperatura tra le scale Celsius, Kelvin e Fahrenheit - MDB 2020");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(800,200);
        this.setVisible(true);
} //--chiude Costruttore--------------------------
        public static void main(String[] args) {
            new TabellaConversioneTemperatura();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String azione=e.getActionCommand(); // azione da fare
            switch(azione) {
                case "Converti":
                    if(!tValoreTemp.getText().toString().equals(""))converti(cTipoTemp.getSelectedIndex());
                    break;
                case "Reset":
//cTipoTemp.setSelectedItem("Celsius"); Se si vuole resettare anche la scala
                    tValoreTemp.setText("");
                    break;
            }
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
//
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
    } // chiude class

