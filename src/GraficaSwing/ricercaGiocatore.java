package GraficaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ricercaGiocatore extends JFrame{
    private JTextField giocatore;
    private JButton cercaButton;
    private JTextArea textArea;
    private JPanel main;

    private GestioneDB DB = new GestioneDB();

    public ricercaGiocatore(){
        setContentPane(main);
        setSize(550,400);
        setTitle("Ricerca Giocatore");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        cercaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(DB.CercaGiocatore(giocatore.getText()));
            }
        });
    }

    public static void main(String[] args) {
        ricercaGiocatore rG = new ricercaGiocatore();
    }
}
