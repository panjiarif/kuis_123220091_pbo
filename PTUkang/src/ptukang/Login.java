/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptukang;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ACER
 */
public class Login extends JFrame implements ActionListener{

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private final JButton loginButton;
    private final JButton cencelButton;
    private final JTextField hasilLabel;
    private final JLabel judul;
    
    Login(){
        super("Login PT.Ukang");
        
        judul = new JLabel("LOGIN");
        judul.setBounds(185, 1, 150, 30);
        add(judul);
        //username
        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(50, 30, 70, 30);
        add(usernameLabel);
        usernameField = new JTextField(10);
        usernameField.setBounds(130, 30, 150, 30);
        add(usernameField);
        //password
        passwordLabel = new JLabel("Password");        
        passwordLabel.setBounds(50, 70, 70, 30);
        add(passwordLabel);
        passwordField = new JPasswordField(10);
        passwordField.setBounds(130, 70, 150, 30);
        add(passwordField);
        //notif
        hasilLabel = new JTextField();
        hasilLabel.setBounds(110, 170, 200, 30);
        hasilLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(hasilLabel);
        //buat button'
        loginButton = new JButton("Login");
        loginButton.setBounds(120, 120, 80, 30);
        add(loginButton);
        cencelButton = new JButton("Cencel");
        cencelButton.setBounds(220, 120, 80, 30);
        add(cencelButton);
        //add action button
        loginButton.addActionListener(this);
        cencelButton.addActionListener(this);
   
        //FRAME
        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton){
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if(username.equals("tukang_091") && password.equals("tukang_091")){
                SwingUtilities.invokeLater(()-> new HitungSiku().setVisible(true));
            }else{
                hasilLabel.setText("Username/Password Salah!");
            }
        }else if(e.getSource() == cencelButton){
            dispose();
        }
    }
    
        public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> new Login().setVisible(true));
    }
}
