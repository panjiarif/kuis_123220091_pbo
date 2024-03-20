package ptukang;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HitungSiku extends JFrame implements ActionListener{
    private JTextField alasField;
    private JTextField tinggiField;
    private JLabel alasLabel;
    private JLabel tinggiLabel;
    private final JButton hitungButton;
    private final JButton cencelButton;
    private final JTextField hasilLabel;
    private final JLabel judul;
    
    HitungSiku(){
        super("Hitung Siku");
        
        //judul
        judul = new JLabel("Menu Menghitung Siku");
        judul.setBounds(140, 1, 150, 30);
        add(judul);
        //username
        alasLabel = new JLabel("ALAS");
        alasLabel.setBounds(50, 30, 70, 30);
        add(alasLabel);
        alasField = new JTextField(10);
        alasField.setBounds(130, 30, 150, 30);
        add(alasField);
        //password
        tinggiLabel = new JLabel("TINGGI");        
        tinggiLabel.setBounds(50, 70, 70, 30);
        add(tinggiLabel);
        tinggiField = new JTextField(10);
        tinggiField.setBounds(130, 70, 150, 30);
        add(tinggiField);
        //notif
        hasilLabel = new JTextField();
        hasilLabel.setBounds(110, 170, 200, 30);
        hasilLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(hasilLabel);
        //buat button'
        hitungButton = new JButton("Hitung");
        hitungButton.setBounds(120, 120, 80, 30);
        add(hitungButton);
        cencelButton = new JButton("Back");
        cencelButton.setBounds(220, 120, 80, 30);
        add(cencelButton);
        //add action button
        hitungButton.addActionListener(this);
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
        if(e.getSource() == hitungButton){
            Double alas = Double.parseDouble(alasField.getText());
            Double tinggi = Double.parseDouble(tinggiField.getText());
            
            Double hasil = Math.sqrt((alas*alas)+(tinggi*tinggi));
            String hasilS = Double.toString(hasil);
            hasilLabel.setText(hasilS);
            
        }else if(e.getSource() == cencelButton){
            dispose();
        }
    }
}