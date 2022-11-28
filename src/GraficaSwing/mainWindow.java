package GraficaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainWindow extends JFrame {
    private JTextField testo;
    private JButton btn1;
    private JLabel testo_ins;
    private JPanel mainPanel;


    public mainWindow(){
        setContentPane(mainPanel);
        setTitle("Prima Finestra");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        testo_ins.setVisible(false);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                testo_ins.setVisible(true);
                System.out.println(testo.getText());
                testo_ins.setText(testo.getText());
            }
        });
    }

    public static void main(String[] args) {
        mainWindow myWindow = new mainWindow();
    }
}
