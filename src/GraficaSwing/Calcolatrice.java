package GraficaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Parameter;

public class Calcolatrice extends JFrame {
    private JButton a1Button1;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a1Button;
    private JPanel calcolatrice;
    private JLabel display;
    private JButton a4Button;
    private JButton button1;

    private String disp = "";

    public Calcolatrice(){
        setContentPane(calcolatrice);
        setSize(450,300);
        setTitle("Calcolatrice");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        a1Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp("1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp("2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp("3");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp("+");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp("4");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(disp);
                int somma = 0;
                String[] ar = disp.split("\\+");
                for (int i = 0; i < ar.length; i++) {
                    somma += Integer.parseInt(ar[i]);
                }

                pulisciDisplay();
                display.setText(String.valueOf(somma));

            }
        });
    }

    public static void main(String[] args) {
        Calcolatrice cal = new Calcolatrice();
    }

    public void aggDisp(String in){
        disp += in;
        display.setText(disp);
    }

    public void pulisciDisplay(){
        disp = "";
        display.setText(disp);
    }
}


