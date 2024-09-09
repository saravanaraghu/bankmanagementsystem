/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author sarav
 */
public class Login extends JFrame implements ActionListener{
    
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        setTitle("AUTOMATED TELLER MACHINE");
        setVisible(true);
        setSize(800,480);
        setLocation(350,200);
        
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,32));
        text.setBounds(200, 40, 400,40);
        add(text);
        
        
        JLabel cardno = new JLabel("Card Number:");
        cardno.setFont(new Font("Osward",Font.BOLD,20));
        cardno.setBounds(120, 150, 150,40);
        add(cardno);
        
        
        JLabel pin = new JLabel("Pin Number:");
        pin.setFont(new Font("Osward",Font.BOLD,20));
        pin.setBounds(120, 220, 150,40);
        add(pin);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 40);
        cardTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(cardTextField);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 40);
        pinTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.white);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(e.getSource() == login){
            
        }else if(e.getSource() == signup){
            
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }

    
}
