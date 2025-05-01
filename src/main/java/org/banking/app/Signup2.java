package org.banking.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame  implements ActionListener {

    String formNo;
    JRadioButton citizenButtonYes,citizenButtonNo, existingAccountButtonYes, existingAccountButtonNo;
    JTextField panField;
    JComboBox religionComboBox, categoryComboBox, incomeComboBox, educationComboBox, occupationComboBox;
    public Signup2(String formNo) {
        super("APPLICATION FORM");

       ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
       Image image = imageIcon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
       ImageIcon form2Logo = new ImageIcon(image);
       JLabel appForm2Logo = new JLabel(form2Logo);
       appForm2Logo.setBounds(20,20,100,100);
       add(appForm2Logo);
       this.formNo = formNo;



        //------page headings---//

        JLabel label2 = new JLabel("PAGE 2:- ");
        label2.setBounds(330,60,600,30);
        label2.setFont(new Font("Raleway", Font.BOLD,22));
        add(label2);

        JLabel label3 = new JLabel("Additional Information");
        label3.setBounds(295,100,600,30);
        label3.setFont(new Font("Raleway", Font.BOLD,20));
        add(label3);

        // ----------RELIGION--------//
        JLabel religionlabel = new JLabel("Religion :");
        religionlabel.setFont(new Font("Raleway", Font.BOLD,18));
        religionlabel.setBounds(100,190,100,30);
        add(religionlabel);

        String[] religions = {"Hindu","Muslim","Jew", "Christian", "Other"};
        religionComboBox = new JComboBox(religions);
        religionComboBox.setBackground(new Color(252,208,76));
        religionComboBox.setFont(new Font("Raleway",Font.BOLD,14));
        religionComboBox.setBounds(350,190,320,30);
        add(religionComboBox);

        // ----------CATEGORY--------//
        JLabel categoryLabel = new JLabel("Category : ");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD,18));
        categoryLabel.setBounds(100,240,100,30);
        add(categoryLabel);

        String[] categories = {"General", "AGS", "SC", "Others"};
        categoryComboBox = new JComboBox(categories);
        categoryComboBox.setBackground(new Color(252,208,76));
        categoryComboBox.setFont(new Font("Raleway",Font.BOLD,14));
        categoryComboBox.setBounds(350,240,320,30);
        add(categoryComboBox);

        // ----------INCOME--------//
        JLabel incomeLabel = new JLabel("Income : ");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD,18));
        incomeLabel.setBounds(100,290,100,30);
        add(incomeLabel);

        String[] income = {"Null","<1,50,000","<2,50,000", "5,00,000", "Uptp 10,00,000","Above 10,00,000"};
        incomeComboBox = new JComboBox(income);
        incomeComboBox.setBackground(new Color(252,208,76));
        incomeComboBox.setFont(new Font("Raleway",Font.BOLD,14));
        incomeComboBox.setBounds(350,290,320,30);
        add(incomeComboBox);


        // ----------EDUCATION--------//
        JLabel educationLabel = new JLabel("Educational : ");
        educationLabel.setFont(new Font("Raleway", Font.BOLD,18));
        educationLabel.setBounds(100,340,150,30);
        add(educationLabel);

        String[] educational = {"Non-Graduate","Graduate","Post-Graduate", "Doctrate", "Others"};
        educationComboBox = new JComboBox(educational);
        educationComboBox.setBackground(new Color(252,208,76));
        educationComboBox.setFont(new Font("Raleway",Font.BOLD,14));
        educationComboBox.setBounds(350,340,320,30);
        add(educationComboBox);

        // ----------OCCUPATION--------//
        JLabel occupationLabel = new JLabel("Occupation : ");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD,18));
        occupationLabel.setBounds(100,390,150,30);
        add(occupationLabel);

        String[] Occupation = {"Salary","Self-Employed","Business", "Student", "Retired", "Other"};
        occupationComboBox = new JComboBox(Occupation);
        occupationComboBox.setBackground(new Color(252,208,76));
        occupationComboBox.setFont(new Font("Raleway",Font.BOLD,14));
        occupationComboBox.setBounds(350,390,320,30);
        add(occupationComboBox);

        // ----------PAN NUMBER--------//
        JLabel panLabel = new JLabel("PAN Number : ");
        panLabel.setFont(new Font("Raleway", Font.BOLD,18));
        panLabel.setBounds(100,440,150,30);
        add(panLabel);

        panField = new JTextField();
        panField.setFont(new Font("Raleway", Font.BOLD,18));
        panField.setBounds(350,440,320,30);
        add(panField);

        // ----------CITIZEN--------//

        JLabel citizenLabel = new JLabel("Senior Citizen : ");
        citizenLabel.setFont(new Font("Raleway", Font.BOLD,18));
        citizenLabel.setBounds(100,490,180,30);
        add(citizenLabel);

        citizenButtonYes = new JRadioButton("Yes");
        citizenButtonYes.setFont(new Font("Raleway", Font.BOLD,14));
        citizenButtonYes.setBackground(new Color(252,208,76));
        citizenButtonYes.setBounds(350,490,100,30);
        add(citizenButtonYes);

        citizenButtonNo = new JRadioButton("No");
        citizenButtonNo.setFont(new Font("Raleway", Font.BOLD,14));
        citizenButtonNo.setBackground(new Color(252,208,76));
        citizenButtonNo.setBounds(460,490,100,30);
        add(citizenButtonNo);

        //---------For swing between buttons-------//
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(citizenButtonYes);
        buttonGroup1.add(citizenButtonNo);

        // ----------EXISTING ACC--------//

        JLabel existingLabel = new JLabel("Existing Account : ");
        existingLabel.setFont(new Font("Raleway", Font.BOLD,18));
        existingLabel.setBounds(100,540,180,30);
        add(existingLabel);

        existingAccountButtonYes = new JRadioButton("Yes");
        existingAccountButtonYes.setFont(new Font("Raleway", Font.BOLD,14));
        existingAccountButtonYes.setBackground(new Color(252,208,76));
        existingAccountButtonYes.setBounds(350,540,100,30);
        add(existingAccountButtonYes);

        existingAccountButtonNo = new JRadioButton("No");
        existingAccountButtonNo.setFont(new Font("Raleway", Font.BOLD,14));
        existingAccountButtonNo.setBackground(new Color(252,208,76));
        existingAccountButtonNo.setBounds(460,540,100,30);
        add(existingAccountButtonNo);

        //---------For swing between buttons-------//
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(existingAccountButtonYes);
        buttonGroup2.add(existingAccountButtonNo);

        // ----------FORM NUMBER--------//

        JLabel formNoLabel = new JLabel("Form No : ");
        formNoLabel.setFont(new Font("Raleway", Font.BOLD,14));
        formNoLabel.setBounds(700,10,100,30);
        add(formNoLabel);

        JLabel l13 = new JLabel(formNo);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        JButton next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        //----------FRAME-----------//
        getContentPane().setBackground(new Color(222,255,228));
        setSize(850, 800);
        setLayout(null);
        setLocation(360, 40);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void  main(String[] args) {
        new Signup2("");
    }


}
