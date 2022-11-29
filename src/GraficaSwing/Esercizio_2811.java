package GraficaSwing;
import Esercizi.Operazioni_metodo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Base.Funzioni.somma;
import static Esercizi.Operazioni_metodo.*;

public class Esercizio_2811 extends JFrame{
    private JTextField input1;
    private JLabel LTitolo;
    private JButton somma;
    private JPanel EsercizioPanel;
    private JLabel risultato;
    private JTextField input2;
    private JButton modulo;
    private JButton divisione;
    private JButton moltiplicazione;
    private JButton sottrazione;

    public Operazioni_metodo op = new Operazioni_metodo();

    public Esercizio_2811(){ //costruttore che estende JFrame
        setSize(700, 500); //dim finestra
        setContentPane(EsercizioPanel); //imposto il contenuto della finestra
        setTitle("Finestra Esercizio");  //setto il titolo
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //se premo la x rossa chiudi
        setVisible(true); //renditi visibili appena ti chiamo

        somma.addActionListener(new ActionListener() { //listner fa tutto lui
            @Override
            public void actionPerformed(ActionEvent e) {
                risultato.setText(op.Somma(input1.getText(),input2.getText()));
            }
        });

        sottrazione.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                risultato.setText(op.Sottrazione(input1.getText(), input2.getText()));
            }
        });

        moltiplicazione.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                risultato.setText(op.Prodotto(input1.getText(), input2.getText()));
            }
        });

        divisione.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                risultato.setText(op.Rapporto(input1.getText(), input2.getText()));
            }
        });

        modulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                risultato.setText(op.Modulo(input1.getText(), input2.getText()));
            }
        });
    }

    public static void main(String[] args) {
        Esercizio_2811 finestra1 = new Esercizio_2811(); //inizializzo la classe e partira la finestra
    }
}
