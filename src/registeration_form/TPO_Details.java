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

public class TPO_Details implements ActionListener {
    
    JFrame frame;
    JLabel emailLabel= new JLabel("EMAIL");
    JLabel UserIdLabel= new JLabel("USERID");
    JLabel nameLabel= new JLabel("NAME");
    JLabel branchLabel= new JLabel("BRANCH");
    JLabel collegenameLabel= new JLabel("COLLEGE NAME");
    JLabel passwordLabel= new JLabel("PASSWORD");
    JLabel confirmpassLabel = new JLabel("CONFIRM PASSWORD");
    JLabel Title= new JLabel("ENTER TPO DETAILS") ;
    
    
   String[] branch= {"CSE", "ISE", "ECE","CIVIL", "ELECTRICAL", "MECHANICAL", "NANOTECH"};
   
   JTextField emailTextField = new JTextField();
   JTextField UserIdTextField= new JTextField();
   JTextField nameTextField= new JTextField();
   JComboBox branchname= new JComboBox(branch);
   JTextField collegeTextField = new JTextField();
   JPasswordField passwordField= new JPasswordField();
   JPasswordField confirmpassField= new JPasswordField();
   
   JButton homeButton= new JButton("Home");
   JButton saveButton= new JButton("Save");
   JButton compButton= new JButton("Company Details");
   JButton updateButton= new JButton("Update");
   
   TPO_Details()
   {
       createWindow();
       setLocationAndSize();
       addComponentsToFrame();
       actionEvent();
       
   }
   
   public void createWindow()
   {
       frame= new JFrame();
       frame.setTitle("TPO DETAILS FORM");
       frame.setBounds(300,300,1500,1000);
       frame.getContentPane().setBackground(Color.white);
          frame.getContentPane().setLayout(null);
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setResizable(false);
          
   }
   
   public void setLocationAndSize()
   {
       Title.setBounds(550,2,400,40);
       Title.setBackground(Color.white);
       Title.setFont(new Font("Cambria", Font.CENTER_BASELINE,25));
       
       UserIdLabel.setBounds(500,40,400,40);
       UserIdLabel.setBackground(Color.white);
       UserIdLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
        UserIdTextField.setBounds(500,90,400,40);
       UserIdTextField.setBackground(Color.white);
       UserIdTextField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       nameLabel.setBounds(500,140,400,40);
       nameLabel.setBackground(Color.white);
       nameLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       nameTextField.setBounds(500,190,400,40);
       nameTextField.setBackground(Color.white);
       nameTextField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       emailLabel.setBounds(500,240,400,40);
       emailLabel.setBackground(Color.white);
       emailLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       emailTextField.setBounds(500,290,400,40);
       emailTextField.setBackground(Color.white);
       emailTextField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       
       branchLabel.setBounds(500,340,400,40);
       branchLabel.setBackground(Color.white);
       branchLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       branchname.setBounds(500,390,400,40);
       branchname.setBackground(Color.white);
       branchname.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       collegenameLabel.setBounds(500,440,400,40);
       collegenameLabel.setBackground(Color.white);
       collegenameLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       collegeTextField.setBounds(500,490,400,40);
       collegeTextField.setBackground(Color.white);
       collegeTextField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       passwordLabel.setBounds(500,540,400,40);
       passwordLabel.setBackground(Color.white);
       passwordLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       passwordField.setBounds(500,590,400,40);
       passwordField.setBackground(Color.white);
       passwordField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       confirmpassLabel.setBounds(500,640,400,40);
       confirmpassLabel.setBackground(Color.white);
       confirmpassLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       
       confirmpassField.setBounds(500,690,400,40);
       confirmpassField.setBackground(Color.white);
       confirmpassField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       homeButton.setBounds(370,740,150,40);
       
       homeButton.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       saveButton.setBounds(560,740,150,40);
       
       saveButton.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       compButton.setBounds(770,740,150,40);
       
       compButton.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       updateButton.setBounds(960,740,150,40);
       
       updateButton.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
   }
   
   public void addComponentsToFrame(){
       frame.add(Title);
       frame.add(UserIdLabel);
       frame.add(UserIdTextField);
       frame.add(nameLabel);
       frame.add(nameTextField);
       frame.add(emailLabel);
       frame.add(emailTextField);
       frame.add(branchLabel);
       frame.add(branchname);
       frame.add(collegenameLabel);
       frame.add(collegeTextField);
       frame.add(passwordLabel);
       frame.add(passwordField);
       frame.add(confirmpassLabel);
       frame.add(confirmpassField);
       frame.add(homeButton);
       frame.add(saveButton);
        frame.add(compButton);
       frame.add(updateButton);
       
   }
   
   public void actionEvent()
   {
       homeButton.addActionListener(this);
       saveButton.addActionListener(this);
       compButton.addActionListener(this);
       updateButton.addActionListener(this);
       
   }
   
   public void actionPerformed(ActionEvent e){
       
       if(e.getSource()==saveButton)
       {
           try{
               Connection conni= DriverManager.getConnection("jdbc:mysql://localhost:3306/reg", "root","");
                PreparedStatement Pstatement=conni.prepareStatement("INSERT INTO tpo_details VALUES (?,?,?,?,?,?,?)");
                
                
                Pstatement.setString(1,UserIdTextField.getText());
                Pstatement.setString(2,nameTextField.getText());
                Pstatement.setString(3,emailTextField.getText());
                Pstatement.setString(4,branchname.getSelectedItem().toString());
                Pstatement.setString(5,collegeTextField.getText());
                Pstatement.setString(6,passwordField.getText());
                Pstatement.setString(7,confirmpassField.getText());
                
                String usn= UserIdTextField.getText();
                String pass= passwordField.getText();
                String re_pass = confirmpassField.getText();
                String email= emailTextField.getText();
                
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
                
                String query= "SELECT * FROM tpo_details";
                ResultSet rs= stmt.executeQuery(query);
                
                while(rs.next())
                {
                    String UserID = rs.getString("UserId");
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
                
                if(!rs.next())
                {
                    Pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "User Registered Successully");
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
               String usn= UserIdTextField.getText();
                String pass= passwordField.getText();
                String re_pass= confirmpassField.getText();
                String email= emailTextField.getText();
                
                Statement stmt = conni.createStatement();
                String query= "SELECT * FROM tpo_details";
                ResultSet rs= stmt.executeQuery(query);
                
                while(rs.next()){
                    
                   String UserID = rs.getString("UserId");
                   String Password= rs.getString("Password");
                   
                   if(UserID.equals(usn)){
                       JOptionPane.showMessageDialog(null, "UserID Already Exists");
                       
                       
                       PreparedStatement Pst=conni.prepareStatement("update tpo_details set Name=?, Email=?,Branch=?,CollegeName= ?, Password=?, ConfirmPassword=? where UserId=?");
                
                
                Pst.setString(1,nameTextField.getText());
                Pst.setString(2,emailTextField.getText());
                Pst.setString(3,branchname.getSelectedItem().toString());
                
                Pst.setString(4,collegeTextField.getText());
                Pst.setString(5,passwordField.getText());
                Pst.setString(6,confirmpassField.getText());
                
                
                Pst.setString(7,UserIdTextField.getText());
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
       
       if(e.getSource()== homeButton){
            Home h= new Home();
            frame.setVisible(false);
        }
       if(e.getSource()== compButton){
           Company_Details c= new Company_Details();
           frame.setVisible(false);
       }
   }
   
}

class Main3{
    public static void main(String[] args)
    {
        TPO_Details t= new TPO_Details();
    }
}
