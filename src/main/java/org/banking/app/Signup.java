package org.banking.app;

import com.toedter.calendar.JDateChooser;

import javax.management.remote.JMXConnectionNotification;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Signup extends JFrame  implements ActionListener {

    JTextField nameField, fNameField, emailField ,addressField, cityField, pinCodeField, stateField;
    JDateChooser dateChooser;
    JRadioButton male, female, married, single, other;
    JButton next;
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
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(male);
        buttonGroup1.add(female);


        //----------Email----------//

        JLabel labelEmail = new JLabel("Email");
        labelEmail.setBounds(100,390,100,30);
        labelEmail.setFont(new Font("Raleway", Font.BOLD,20));
        add(labelEmail);

        emailField = new JTextField(20);
        emailField.setFont(new Font("Raleway", Font.BOLD,15));
        emailField.setBounds(300,390,400,30);
        add(emailField);

        //------Marital status---------//

        JLabel labelMarried = new JLabel("Marital Status");
        labelMarried.setBounds(100,440,100,30);
        labelMarried.setFont(new Font("Raleway", Font.BOLD,20));
        add(labelMarried);

        //-----------Single Button------//
        single = new JRadioButton("Single");
        single.setFont(new Font("Raleway", Font.BOLD,15));
        single.setBackground(new Color(222,255,228));
        single.setBounds(300,440,90,30);
        add(single);

        //-------Married Button------//
        married = new JRadioButton("Married");
        married.setFont(new Font("Raleway", Font.BOLD,15));
        married.setBackground(new Color(222,255,228));
        married.setBounds(450,440,90,30);
        add(married);

        //-------other button---//
        other = new JRadioButton("Other");
        other.setBackground(new Color(222,255,228));
        other.setFont(new Font("Raleway", Font.BOLD,15));
        other.setBounds(550,440,90,30);
        add(other);
        //---------For swing between buttons-------//
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(single);
        buttonGroup2.add(married);
        buttonGroup2.add(other);


        //-------Address-----//
        JLabel labelAddress = new JLabel("Address :");
        labelAddress.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAddress.setBounds(100,490,200,30);
        add(labelAddress);

        addressField = new JTextField();
        addressField.setFont(new Font("Raleway",Font.BOLD, 14));
        addressField.setBounds(300,490,400,30);
        add(addressField);

        //-------CITY-----//
        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        cityField = new JTextField();
        cityField.setFont(new Font("Raleway",Font.BOLD, 14));
        cityField.setBounds(300,540,400,30);
        add(cityField);


        //-------PIN CODE-----//
        JLabel labelPincode = new JLabel("Pin Code :");
        labelPincode.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPincode.setBounds(100,590,200,30);
        add(labelPincode);

        pinCodeField = new JTextField();
        pinCodeField.setFont(new Font("Raleway",Font.BOLD, 14));
        pinCodeField.setBounds(300,590,400,30);
        add(pinCodeField);



        //-------State-----//
        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        stateField = new JTextField();
        stateField.setFont(new Font("Raleway",Font.BOLD, 14));
        stateField.setBounds(300,640,400,30);
        add(stateField);


        //-----------NExt Button----------//

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);




        getContentPane().setBackground(new Color(222,255,228));
        setSize(850, 800);
        setLayout(null);
        setLocation(360, 40);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        // Getting text fields value-------//
        String formNo = formNumber;
        String name = nameField.getText();
        String fatherName = fNameField.getText();
        String email = emailField.getText();
        String address = addressField.getText();
        String city = cityField.getText();
        String pinCode = pinCodeField.getText();
        String state = stateField.getText();
        //DOB field for dateChooser UI
        String dob = ( (JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        // Getting radio buttons values
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";

        }

        String marital = null;
        if(single.isSelected()) {
            marital = "Single";
        } else if (married.isSelected()) {
            marital = "Married";
        } else if (other.isSelected()) {
            marital = "Other";
        }

        try{
            if(nameField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill all fields");
            }else {
                ConnectionDb connectionDb = new ConnectionDb();
                String query = "INSERT INTO signup (formno, name, father_name, dob, gender, email, marital_status, address, city, pin_code, state) " +
                        "VALUES ('"+formNo+"', '"+name+"','"+fatherName+"','"+dob+"','"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+city+"','"+pinCode+"','"+state+"')";

                //connectionDb.statement.executeUpdate(query);
                new Signup2(formNo);
                setVisible(false);


            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static  void main(String[] args) {
        new Signup();
    }

}
