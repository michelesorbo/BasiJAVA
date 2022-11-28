package GraficaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserPwd extends JFrame{
    private JTextField email;
    private JPasswordField pwd;
    private JPanel UserPwd;
    private JButton btnLogin;
    private JLabel okText;

    public UserPwd(){
        setContentPane(UserPwd);
        setTitle("Login");
        setSize(450,300);
        setVisible(true);
        okText.setVisible(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okText.setVisible(true);
                if(email.getText().equals("michele") && pwd.getText().equals("1234")){
                    okText.setText("Benvenuto " + email.getText());
                }else{
                    okText.setText("Login Errata");
                }
            }
        });
    }

    public static void main(String[] args) {
        UserPwd myUserPwd = new UserPwd();
    }
}
