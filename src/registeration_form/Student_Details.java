/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeration_form;

/**
 *
 * @author Anushka
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class Student_Details implements ActionListener{
    
    JFrame frame;
    JLabel emailLabel= new JLabel("EMAIL");
    JLabel USNLabel= new JLabel("USN");
    JLabel nameLabel= new JLabel("NAME");
    JLabel branchLabel= new JLabel("BRANCH");
    JLabel yearLabel= new JLabel("YEAR");
    JLabel CGPA1Label= new JLabel("CGPA1"); 
    JLabel CGPA2Label= new JLabel("CGPA2");
    JLabel CGPA3Label= new JLabel("CGPA3");
    JLabel CGPA4Label= new JLabel("CGPA4");
    JLabel collegenameLabel= new JLabel("COLLEGE NAME");
    JLabel nationalityLabel= new JLabel("NATIONALITY"); 
    JLabel disabledLabel= new JLabel("DISABLED");
    JLabel genderLabel= new JLabel("GENDER");
    JLabel skillLabel= new JLabel("SKILLS");
    JLabel phoneNoLabel= new JLabel("PHONE NO");
    JLabel dobLabel= new JLabel("DATE OF BIRTH");
    JLabel addressLabel= new JLabel("ADDRESS");
    JLabel passwordLabel= new JLabel("PASSWORD");
    JLabel confirmpassLabel= new JLabel("CONFIRM PASSWORD");
    JLabel Title= new JLabel("ENTER STUDENT DETAILS");
    JLabel PlacedLabel= new JLabel("PLACED");
    JLabel type= new JLabel("BRANCH TYPE");
    
    
    String[] branch= { "CSE", "ISE", "ECE","CIVIL", "ELECTRICAL", "MECHANICAL", "NANOTECH"};
    String[] Year= {"FY", "SY", "TY","FINAL"};
    String[] Disabled={"Yes", "No"};
    String[] Placed={"Yes","No"};
    String[] Gender={"Male","Female","Other"};
    String[] Type= {"Soft", "Hard"};
    JTextField emailTextField= new JTextField();
    JTextField USNTextField= new JTextField();
    JTextField nameTextField= new JTextField();
    JComboBox branchname= new JComboBox(branch);
    JComboBox yearname= new JComboBox(Year);
    JComboBox disabled= new JComboBox(Disabled);
    JComboBox gender= new JComboBox(Gender);
    JComboBox placed= new JComboBox(Placed);
    JComboBox type1= new JComboBox(Type);
    JTextField CGPA1TextField = new JTextField();
    JTextField CGPA2TextField = new JTextField();
    JTextField CGPA3TextField = new JTextField();
    JTextField CGPA4TextField = new JTextField();
    JTextField collegeTextField= new JTextField();
    JTextField NationalityTextField= new JTextField();
    JTextField disabledTextField= new JTextField();
    JTextField genderTextField= new JTextField();
    JTextField skillTextField= new JTextField();
    JTextField phoneNoTextField= new JTextField();
    JTextField dobTextField= new JTextField();
    JTextField addressTextField= new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JPasswordField confirmpassField = new JPasswordField();
    
    
    JButton HomeButton= new JButton("Home");
    JButton saveButton= new JButton("Save");
    JButton updateButton= new JButton("Update"); 
    
    Student_Details()
    {
        createWindow();
        setLocationAndSize();
        addComponentToFrame();
        actionEvent();
    }
    
    public void createWindow(){
         frame=new JFrame();
          frame.setTitle("Student Details Form");
          frame.setBounds(300, 300, 1500, 1000);
          frame.getContentPane().setBackground(Color.white);
          frame.getContentPane().setLayout(null);
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setResizable(false);
          
    }
    
    public void setLocationAndSize(){
          
        Title.setBounds(550,2,400,40);
        Title.setBackground(Color.white);
        Title.setFont(new Font("Cambria",Font.CENTER_BASELINE,25));
        
        USNLabel.setBounds(100,10,400,40);
        USNLabel.setBackground(Color.white);
        USNLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        USNTextField.setBounds(100,50,400,40);
        USNTextField.setBackground(Color.white);
        USNTextField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        nameLabel.setBounds(100,90,400,40);
        nameLabel.setBackground(Color.white);
        nameLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        nameTextField.setBounds(100,130,400,40);
        nameTextField.setBackground(Color.white);
        nameTextField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10)); 
        
        emailLabel.setBounds(100,170,400,40);
        emailLabel.setBackground(Color.white);
        emailLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        emailTextField.setBounds(100,210,400,40);
        emailTextField.setBackground(Color.white);
        emailTextField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10)); 
        
        passwordLabel.setBounds(100,250,400,40);
        passwordLabel.setBackground(Color.white);
        passwordLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        passwordField.setBounds(100,290,400,40);
        passwordField.setBackground(Color.white);
        passwordField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10)); 
        
        confirmpassLabel.setBounds(100,330,400,40);
        confirmpassLabel.setBackground(Color.white);
        confirmpassLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        confirmpassField.setBounds(100,370,400,40);
        confirmpassField.setBackground(Color.white);
        confirmpassField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10)); 
        
        branchLabel.setBounds(100,410,400,40);
        branchLabel.setBackground(Color.white);
        branchLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        branchname.setBounds(100,450,400,40);
        branchname.setBackground(Color.white);
        branchname.setFont(new Font("Cambria",Font.CENTER_BASELINE,10)); 

        yearLabel.setBounds(100,490,400,40);
        yearLabel.setBackground(Color.white);
        yearLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        yearname.setBounds(100,530,400,40);
        yearname.setBackground(Color.white);
        yearname.setFont(new Font("Cambria",Font.CENTER_BASELINE,10)); 
        
        CGPA1Label.setBounds(100,570,400,40);
        CGPA1Label.setBackground(Color.white);
        CGPA1Label.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        CGPA1TextField.setBounds(100,610,400,40);
        CGPA1TextField.setBackground(Color.white);
        CGPA1TextField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10)); 
        
        CGPA2Label.setBounds(100,650,400,40);
        CGPA2Label.setBackground(Color.white);
        CGPA2Label.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        CGPA2TextField.setBounds(100,680,400,40);
        CGPA2TextField.setBackground(Color.white);
        CGPA2TextField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        CGPA3Label.setBounds(100,720,400,40);
        CGPA3Label.setBackground(Color.white);
        CGPA3Label.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        CGPA3TextField.setBounds(100,750,400,40);
        CGPA3TextField.setBackground(Color.white);
        CGPA3TextField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        CGPA4Label.setBounds(800,20,400,40);
        CGPA4Label.setBackground(Color.white);
        CGPA4Label.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        CGPA4TextField.setBounds(800,50,400,40);
        CGPA4TextField.setBackground(Color.white);
        CGPA4TextField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        collegenameLabel.setBounds(800,90,400,40);
        collegenameLabel.setBackground(Color.white);
        collegenameLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        collegeTextField.setBounds(800,130,400,40);
        collegeTextField.setBackground(Color.white);
        collegeTextField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        nationalityLabel.setBounds(800,170,400,40);
        nationalityLabel.setBackground(Color.white);
        nationalityLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        
        NationalityTextField.setBounds(800,210,400,40);
        NationalityTextField.setBackground(Color.white);
        NationalityTextField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        disabledLabel.setBounds(800,250,400,40);
        disabledLabel.setBackground(Color.white);
        disabledLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));

        disabled.setBounds(800,290,400,40);
        disabled.setBackground(Color.white);
        disabled.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        genderLabel.setBounds(800,330,400,40);
        genderLabel.setBackground(Color.white);
        genderLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        gender.setBounds(800,370,400,40);
        gender.setBackground(Color.white);
        gender.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        phoneNoLabel.setBounds(800,410,400,40);
        phoneNoLabel.setBackground(Color.white);
        phoneNoLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        phoneNoTextField.setBounds(800,440,400,40);
        phoneNoTextField.setBackground(Color.white);
        phoneNoTextField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        dobLabel.setBounds(800,490,400,40);
        dobLabel.setBackground(Color.white);
        dobLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        dobTextField.setBounds(800,530,400,40);
        dobTextField.setBackground(Color.white);
        dobTextField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        addressLabel.setBounds(800,570,400,40);
        addressLabel.setBackground(Color.white);
        addressLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        addressTextField.setBounds(800,610,400,40);
        addressTextField.setBackground(Color.white);
        addressTextField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        skillLabel.setBounds(800,650,400,40);
        skillLabel.setBackground(Color.white);
        skillLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        skillTextField.setBounds(800,690,400,40);
        skillTextField.setBackground(Color.white);
        skillTextField.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        PlacedLabel.setBounds(850,740,400,40);
        PlacedLabel.setBackground(Color.white);
        PlacedLabel.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        placed.setBounds(900,740,200,40);
        placed.setBackground(Color.white);
        placed.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        type.setBounds(1250,20,200,40);
        type.setBackground(Color.white);
        type.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        type1.setBounds(1250,50,200,40);
        type1.setBackground(Color.white);
        type1.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        HomeButton.setBounds(1110,740,100,40);
        HomeButton.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        saveButton.setBounds(1230,740,100,40);
        saveButton.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        updateButton.setBounds(1350,740,100,40);
        updateButton.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
        
        
        
        

        
      }
    
    public void addComponentToFrame()
    {
        frame.add(Title);
        frame.add(USNLabel);
        frame.add(USNTextField);
        frame.add(nameLabel);
        frame.add(nameTextField);
        frame.add(emailLabel);
        frame.add(emailTextField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(confirmpassLabel);
        frame.add(confirmpassField);
        frame.add(branchLabel);
        frame.add(branchname);
        frame.add(yearLabel);
        frame.add(yearname);
        frame.add(CGPA1Label);
        frame.add(CGPA1TextField);
        frame.add(CGPA2Label);
        frame.add(CGPA2TextField);
        frame.add(CGPA3Label);
        frame.add(CGPA3TextField);
        frame.add(CGPA4Label);
        frame.add(CGPA4TextField);
        frame.add(collegenameLabel);
        frame.add(collegeTextField);
        frame.add(nationalityLabel);
        frame.add(NationalityTextField);
        frame.add(disabledLabel);
        frame.add(disabled);
        frame.add(genderLabel);
        frame.add(gender);
        frame.add(phoneNoLabel);
        frame.add(phoneNoTextField);
        frame.add(dobLabel);
        frame.add(dobTextField);
        frame.add(addressLabel);
        frame.add(addressTextField);
        frame.add(skillLabel);
        frame.add(skillTextField);
        frame.add(PlacedLabel);
        frame.add(placed);
        frame.add(type1);
        frame.add(type);
        frame.add(HomeButton);
        frame.add(saveButton);
        frame.add(updateButton);
        
    }
    
    public void actionEvent()
    {
        HomeButton.addActionListener(this);
        saveButton.addActionListener(this);
        updateButton.addActionListener(this);
        USNTextField.addActionListener(this);
        nameTextField.addActionListener(this);
        emailTextField.addActionListener(this);
        passwordField.addActionListener(this);
        confirmpassField.addActionListener(this);
        branchname.addActionListener(this);
        yearname.addActionListener(this);
        CGPA1TextField.addActionListener(this);
        CGPA2TextField.addActionListener(this);
        CGPA3TextField.addActionListener(this);
        CGPA4TextField.addActionListener(this);
        collegeTextField.addActionListener(this);
        NationalityTextField.addActionListener(this);
        disabled.addActionListener(this);
        gender.addActionListener(this);
        phoneNoTextField.addActionListener(this);
        dobTextField.addActionListener(this);
        addressTextField.addActionListener(this);
        skillTextField.addActionListener(this);
        placed.addActionListener(this);
        type1.addActionListener(this);
        
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()== saveButton)
        {
            try{
                Connection conni= DriverManager.getConnection("jdbc:mysql://localhost:3306/reg", "root","");
                PreparedStatement Pstatement=conni.prepareStatement("INSERT INTO student_details VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                
                Pstatement.setString(1,USNTextField.getText());
                Pstatement.setString(2,nameTextField.getText());
                Pstatement.setString(3,emailTextField.getText());
                Pstatement.setString(4,passwordField.getText());
                Pstatement.setString(5,confirmpassField.getText());
                Pstatement.setString(6,branchname.getSelectedItem().toString());
                Pstatement.setString(7,yearname.getSelectedItem().toString());
                Pstatement.setString(8,CGPA1TextField.getText());
                Pstatement.setString(9,CGPA2TextField.getText());
                Pstatement.setString(10,CGPA3TextField.getText());
                Pstatement.setString(11,CGPA4TextField.getText());
                Pstatement.setString(12,collegeTextField.getText());
                Pstatement.setString(13,NationalityTextField.getText());
                Pstatement.setString(14,disabled.getSelectedItem().toString());
                Pstatement.setString(15,gender.getSelectedItem().toString());
                Pstatement.setString(16,phoneNoTextField.getText());
                Pstatement.setString(17,dobTextField.getText());
                Pstatement.setString(18,addressTextField.getText());
                Pstatement.setString(19,skillTextField.getText());
                Pstatement.setString(20,placed.getSelectedItem().toString());
                Pstatement.setString(21,type1.getSelectedItem().toString());
                
                
                String usn= USNTextField.getText();
                String pass= passwordField.getText();
                String re_pass= confirmpassField.getText();
                String email= emailTextField.getText();
                String type2= type1.getSelectedItem().toString();
                
                if(usn.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"UserID Is Missing");
                    
                }
                
                else if(pass.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Password Is Missing");
                }
                
                else if(email.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Email Is Missing");
                }
                
                else if(!pass.equals(re_pass)){
                    JOptionPane.showMessageDialog(null, "Password Doesn't Match");
                }
                
                Statement stmt= conni.createStatement();
                
                String query= "SELECT * FROM student_details";
                ResultSet rs= stmt.executeQuery(query);
                
                while(rs.next())
                {
                    String UserID = rs.getString("USN");
                    String Password= rs.getString("Password");
                    
                    if(UserID.equals(usn) && Password.equals(pass))
                    {
                        JOptionPane.showMessageDialog(null, "UserID Already Exists");
                        
                    }
                    else
                    {
                        Pstatement.executeUpdate();
                        JOptionPane.showMessageDialog(null, "User Registered Successully");
                    }
                }
            }
            catch(SQLException ei){
                ei.printStackTrace();
            }
        }
        
        if(e.getSource()== updateButton)
        {
            try{
               Connection conni= DriverManager.getConnection("jdbc:mysql://localhost:3306/reg", "root",""); 
               String usn= USNTextField.getText();
                String pass= passwordField.getText();
                String re_pass= confirmpassField.getText();
                String email= emailTextField.getText();
                
                Statement stmt = conni.createStatement();
                String query= "SELECT * FROM student_details";
                ResultSet rs= stmt.executeQuery(query);
                
                if(usn.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"UserID Is Missing");
                    
                }
                
                else if(pass.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Password Is Missing");
                }
                
                else if(email.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Email Is Missing");
                }
                
                else if(!pass.equals(re_pass)){
                    JOptionPane.showMessageDialog(null, "Password Doesn't Match");
                }
                
                while(rs.next()){
                    
                   String UserID = rs.getString("USN");
                   String Password= rs.getString("Password");
                   
                   if(UserID.equals(usn)){
                       JOptionPane.showMessageDialog(null, "UserID Already Exists");
                       JOptionPane.showMessageDialog(null,"Update Details Else Login");
                       
                       PreparedStatement Pst=conni.prepareStatement("update student_details set Name=?, Email=?, Password=?, ConfirmPassword=?, Branch=?, Year=?, CGPA1=?, CGPA2=?, CGPA3=?, CGPA4=?, CollegeName= ?, Nationality=?, Disabled=?, Gender=?, PhoneNo= ?, DOB= ?, Address= ?,Skill=?, Placed= ?, Type=? where USN=?");
                
                
                Pst.setString(1,nameTextField.getText());
                Pst.setString(2,emailTextField.getText());
                Pst.setString(3,passwordField.getText());
                Pst.setString(4,confirmpassField.getText());
                Pst.setString(5,branchname.getSelectedItem().toString());
                Pst.setString(6,yearname.getSelectedItem().toString());
                Pst.setString(7,CGPA1TextField.getText());
                Pst.setString(8,CGPA2TextField.getText());
                Pst.setString(9,CGPA3TextField.getText());
                Pst.setString(10,CGPA4TextField.getText());
                Pst.setString(11,collegeTextField.getText());
                Pst.setString(12,NationalityTextField.getText());
                Pst.setString(13,disabled.getSelectedItem().toString());
                Pst.setString(14,gender.getSelectedItem().toString());
                Pst.setString(15,phoneNoTextField.getText());
                Pst.setString(16,dobTextField.getText());
                Pst.setString(17,addressTextField.getText());
                Pst.setString(18,skillTextField.getText());
                Pst.setString(19,placed.getSelectedItem().toString());
                Pst.setString(20,type1.getSelectedItem().toString());
                Pst.setString(21,USNTextField.getText());
                
                Pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Updated Successfully");
                
                   }
                }
                JOptionPane.showMessageDialog(null,"Enter Details Field Are Empty");
            }
            catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        if(e.getSource()== HomeButton){
            Home h= new Home();
            frame.setVisible(false);
        }
    }
    
      
    
    
    
}

class Main2{
    public static void main(String[] args){
        Student_Details sd= new Student_Details();
        
    }
}
