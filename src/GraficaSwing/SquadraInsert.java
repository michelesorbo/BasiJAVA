package GraficaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquadraInsert extends JFrame {
    private JPanel main;
    private JTextField nome;
    private JTextField annoFondazione;
    private JTextField citta;
    private JTextField serie;
    private JTextField categoria;
    private JButton btnInserisci;
    private JButton chiudiButton;
    private JLabel msg;

    public SquadraInsert(){
        setContentPane(main);
        setSize(550,400);
        setTitle("Inserisci Squadra");
        setVisible(true);
        msg.setVisible(false);
        chiudiButton.setVisible(false);
        btnInserisci.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GestioneDB DB = new GestioneDB();
                msg.setVisible(true);
                msg.setText(DB.InsSquadra(nome.getText(), annoFondazione.getText(), citta.getText(), serie.getText(), categoria.getText()));
                chiudiButton.setVisible(true);
            }
        });
        chiudiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

//    public static void main(String[] args) {
//        SquadraInsert sq = new SquadraInsert();
//    }
}
