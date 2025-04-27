package org.banking.app;

import javax.swing.*;
import java.awt.*;

public class Signup extends JFrame {

    Signup() {
        super("APPLICATION FORM");

        //-----Logo----------//
        ImageIcon formLogoIcon = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image imageLogo = formLogoIcon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon formLogo = new ImageIcon(imageLogo);
        JLabel appFormLogo = new JLabel(formLogo);
        appFormLogo.setBounds(20,20,100,100);
        add(appFormLogo);




        setSize(850, 800);
        setLayout(null);
        setLocation(360, 40);
        setVisible(true);
    }

    public static  void main(String[] args) {
        new Signup();
    }
}
