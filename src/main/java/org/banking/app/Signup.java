package org.banking.app;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame {

    JTextField nameField, fNameField, emailField;
    JDateChooser dateChooser;
    JRadioButton male, female;
    // generate random application form number
    Random random = new Random();
    long first4 = (random.nextLong() % 9000L)  + 1000L;
    String formNumber = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");

        //-----Logo----------//
        ImageIcon formLogoIcon = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image imageLogo = formLogoIcon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon formLogo = new ImageIcon(imageLogo);
        JLabel appFormLogo = new JLabel(formLogo);
        appFormLogo.setBounds(20,20,100,100);
        add(appFormLogo);

        //------page headings---//
        JLabel label1 = new JLabel("APPLICATION FORM NO: " + formNumber);
        label1.setBounds(180,20,600,35);
        label1.setFont(new Font("Raleway", Font.BOLD,30));
        add(label1);

        JLabel label2 = new JLabel("PAGE 1");
        label2.setBounds(330,60,600,30);
        label2.setFont(new Font("Raleway", Font.BOLD,22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(295,100,600,30);
        label3.setFont(new Font("Raleway", Font.BOLD,20));
        add(label3);

        //-----------body------------//

        JLabel labelName = new JLabel("Name");
        labelName.setBounds(100,190,100,30);
        labelName.setFont(new Font("Raleway", Font.BOLD,20));
        add(labelName);

        nameField = new JTextField(20);
        nameField.setFont(new Font("Raleway", Font.BOLD,15));
        nameField.setBounds(300,190,400,30);
        add(nameField);

        JLabel labelFName = new JLabel("Father's Name");
        labelFName.setBounds(100,240,100,30);
        labelFName.setFont(new Font("Raleway", Font.BOLD,20));
        add(labelFName);

        fNameField = new JTextField(20);
        fNameField.setFont(new Font("Raleway", Font.BOLD,15));
        fNameField.setBounds(300,240,400,30);
        add(fNameField);

        //--------------Date of birth
        JLabel DOB = new JLabel("DOB");
        DOB.setBounds(100,290,100,30);
        DOB.setFont(new Font("Raleway", Font.BOLD,20));
        add(DOB);


        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);;
        add(dateChooser);

        //--------Gender ----------//
        JLabel labelGender = new JLabel("Gender");
        labelGender.setBounds(100,340,100,30);
        labelGender.setFont(new Font("Raleway", Font.BOLD,20));
        add(labelGender);

        //-----------Male Button------//
        male = new JRadioButton("Male");
        male.setFont(new Font("Raleway", Font.BOLD,15));
        male.setBackground(new Color(222,255,228));
        male.setBounds(300,340,90,30);
        add(male);

        //-------Female Button------//
        female = new JRadioButton("Female");
        female.setFont(new Font("Raleway", Font.BOLD,15));
        female.setBackground(new Color(222,255,228));
        female.setBounds(450,340,90,30);
        add(female);
        //---------For swing between buttons-------//
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);


        //----------Email----------//

        JLabel labelEmail = new JLabel("Email");
        labelEmail.setBounds(100,390,100,30);
        labelEmail.setFont(new Font("Raleway", Font.BOLD,20));
        add(labelEmail);

        emailField = new JTextField(20);
        emailField.setFont(new Font("Raleway", Font.BOLD,15));
        emailField.setBounds(300,390,400,30);
        add(emailField);




        getContentPane().setBackground(new Color(222,255,228));
        setSize(850, 800);
        setLayout(null);
        setLocation(360, 40);
        setVisible(true);
    }

    public static  void main(String[] args) {
        new Signup();
    }
}
