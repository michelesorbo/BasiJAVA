package GraficaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class indexWindow extends JFrame{
    private JButton calcolatriceButton;
    private JPanel main;
    private JButton inserisciNuovaSquadraButton;
    private JButton ricercaGiocatoreButton;

    public indexWindow() {

        setContentPane(main);
        setSize(550,400);
        setTitle("Finestra Principale");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        calcolatriceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calcolatrice calc = new Calcolatrice();
                dispose(); //Chiude la finestra corrente
            }
        });
        inserisciNuovaSquadraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SquadraInsert sq = new SquadraInsert();
            }
        });
        ricercaGiocatoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ricercaGiocatore rg = new ricercaGiocatore();
            }
        });
    }

    public static void main(String[] args) {
        indexWindow start = new indexWindow();
    }
}
