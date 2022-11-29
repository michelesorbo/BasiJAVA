package GraficaSwing;

import Base.OperazioniMatematiche;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rossella extends JFrame {
    private JTextField input1;
    private JLabel LTitolo;
    private JButton btn1;
    private JPanel rossellaPanel;
    private JLabel risultato;
    private JTextField input2;

    OperazioniMatematiche opm = new OperazioniMatematiche();

    public Rossella(){
        setSize(650,500);//Dimensioni della finestra
        setContentPane(rossellaPanel); //Imposto il contenuto della finestra
        setTitle("Finestra Rossella"); //Setto il titolo della finestra
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Comportamento alla chiusura della finestra
        setVisible(true);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //risultato.setText(somma(input1.getText(),input2.getText())); //Metodo in classe
                risultato.setText(opm.somma(input1.getText(),input2.getText()));
            }
        });
    }

    public static void main(String[] args) {
        Rossella ros = new Rossella(); //Inizializzo la classe Rossella
    }

}
