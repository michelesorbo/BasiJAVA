package GraficaSwing;

import javax.swing.*;

public class Calcolatrice extends JFrame {
    private JButton a1Button1;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a1Button;
    private JPanel calcolatrice;

    public Calcolatrice(){
        setContentPane(calcolatrice);
        setSize(450,300);
        setTitle("Calcolatrice");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Calcolatrice cal = new Calcolatrice();
    }
}
