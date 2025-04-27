package org.banking.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField jTextField1;
    JPasswordField jPasswordField1;
    JButton signUpButton , signInButton, clearButton;
    // Login frame
    public Login() {

        super("Bank Management System"); // title header

        // FirstImage  icon
        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image image1 = imageIcon1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(image1);
        JLabel image11 = new JLabel(imageIcon11);
        image11.setBounds(350,10,100,100);
        add(image11);

        //------welcome label------//

        label1 = new JLabel("WELCOME TO BANK OF AMERICA");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 18));
        label1.setBounds(260,120,450,40);
        add(label1);


        //--------CARD NUMBER LABEL----//
        label2 = new JLabel("Card No: ");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Railway", Font.BOLD, 18));
        label2.setBounds(150,190,375,30);
        add(label2);

        //--------CARD NUMBER TEXT FIELD  L----//
        jTextField1 = new JTextField(15);
        jTextField1.setBounds(250, 190, 230 ,30);
        jTextField1.setFont(new Font("Arial", Font.BOLD, 18));
        add(jTextField1);


        //--------CARD PIN LABEL----//
        label3 = new JLabel("PIN:  ");
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Railway", Font.BOLD, 18));
        label3.setBounds(150,240,375,30);
        add(label3);


        //--------CARD PIN TEXT FIELD  L----//

        jPasswordField1 = new JPasswordField(15);
        jPasswordField1.setBounds(250, 240, 230 ,30);
        jPasswordField1.setFont(new Font("Arial", Font.BOLD, 18));
        add(jPasswordField1);

        //--------SIGN IN BUTTON-----//
        signInButton = new JButton("SIGN IN");
        signInButton.setFont(new Font("Arial", Font.BOLD, 14));
        signInButton.setForeground(Color.BLACK);
        signInButton.setBackground(Color.WHITE);
        signInButton.setBounds(250,310,100,20);
        signInButton.addActionListener(this);
        add(signInButton);

        //--------CLEAR BUTTON-----//
        clearButton = new JButton("CLEAR");
        clearButton.setFont(new Font("Arial", Font.BOLD, 14));
        clearButton.setForeground(Color.BLACK);
        clearButton.setBackground(Color.WHITE);
        clearButton.setBounds(400,310,100,20);
        clearButton.addActionListener(this);
        add(clearButton);


        //--------SIGN UP BUTTON-----//
        signUpButton = new JButton("SIGN UP");
        signUpButton.setFont(new Font("Arial", Font.BOLD, 14));
        signUpButton.setForeground(Color.BLACK);
        signUpButton.setBackground(Color.WHITE);
        signUpButton.setBounds(265,375,230,30);
        signUpButton.addActionListener(this);     //ACTION LISTENER
        add(signUpButton);



        // Second Image  icon
        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image image2 = imageIcon2.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon imageIcon22 = new ImageIcon(image2);
        JLabel image22 = new JLabel(imageIcon22);
        image22.setBounds(630,350,100,100);
        add(image22);


        //-----------------Frame layout------------//
        setLayout(null);
        setSize(850, 480);
        setLocation(420, 200);
        setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent event ) {

        try {

            if (event.getSource() == signInButton) {

            }else if (event.getSource() == signUpButton) {

            } else if (event.getSource() == clearButton){
                jTextField1.setText("");
                jPasswordField1.setText("");

            }

        } catch (Exception ex) {
           ex.printStackTrace();
        }

    }

    public static  void main(String[] args) {
        new Login();
    }
}
