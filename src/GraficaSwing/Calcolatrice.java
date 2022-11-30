package GraficaSwing;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcolatrice extends JFrame {
    private JButton a1Button1;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a1Button;
    private JPanel calcolatrice;
    private JLabel display;
    private JButton a4Button;
    private JButton button1;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton button2;
    private JButton button3;
    private JButton xButton;
    private JButton button4;

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
                aggDisp(" + ");
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

//                double risultato = 0;
//
//                String[] ar = disp.split(" ");
//                for (int i = 0; i < ar.length; i++) {
//                    System.out.println("Contenuto: " + ar[i] + " Indice: " + i);
//                }
//
//                int i = 1;
//                while (i<ar.length){
//                    System.out.println(ar[i]);
//                    if(ar[i].equals("+")){
//                        risultato += Double.parseDouble(ar[i-1]) + Double.parseDouble(ar[i+1]);
//                    } else if (ar[i].equals("-")) {
//                        risultato += Double.parseDouble(ar[i-1]) - Double.parseDouble(ar[i+1]);
//                    }else if (ar[i].equals("x")) {
//                        risultato += Double.parseDouble(ar[i-1]) * Double.parseDouble(ar[i+1]);
//                    }else{
//                        risultato += Double.parseDouble(ar[i-1]) / Double.parseDouble(ar[i+1]);
//                    }
//
//                    i = i+2;
//                }

//                int somma = 0;
//                String[] ar = disp.split("\\+");
//                for (int i = 0; i < ar.length; i++) {
//                    somma += Integer.parseInt(ar[i]);
//                }

                //Vado a cambiare i caratteri x con * e : con /
                disp = disp.replace(":", "/");
                disp = disp.replace("x", "*");
                System.out.println(disp);

                Expression ex = new ExpressionBuilder(disp).build();
                pulisciDisplay();
               display.setText(String.valueOf(ex.evaluate()));

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp("5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp("6");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp(" - ");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp("7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp("8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp("9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp("0");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp(".");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp(" : ");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aggDisp(" x ");
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


