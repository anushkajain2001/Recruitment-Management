/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeration_form;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;


/**
 *
 * @author Anushka
 */
public class Company_Details implements ActionListener {
    
    JFrame frame;
    JLabel emailLabel= new JLabel("EMAIL");
    JLabel CompanyIdLabel= new JLabel("COMPANY ID");
    JLabel companynameLabel= new JLabel("COMPANY NAME");
    JLabel branchLabel= new JLabel("BRANCH");
    JLabel contactNoLabel= new JLabel("CONTACT NO");
    JLabel cutoffLabel= new JLabel("CUTOFF");
    JLabel AddressLabel = new JLabel("ADDRESS");
    JLabel skillLabel= new JLabel("REQUIRED SKILLS");
    JLabel HRnameLabel = new JLabel("HR NAME");
    JLabel Type = new JLabel("BRANCH TYPE");
    JLabel Title= new JLabel("ENTER COMPANY DETAILS") ;
    
    
   String[] type= {"Soft", "Hard"};
    String[] branch= {"CSE", "ISE", "ECE","CIVIL", "ELECTRICAL", "MECHANICAL", "NANOTECH"};
   
   JCheckBox b1= new JCheckBox("CSE");
   JCheckBox b2= new JCheckBox("ISE");
   JCheckBox b3= new JCheckBox("ECE");
   JCheckBox b4= new JCheckBox("CIVIL");
   JCheckBox b5= new JCheckBox("ELECTRICAL");
   JCheckBox b6= new JCheckBox("MECHANICAL");
   JCheckBox b7= new JCheckBox("NANOTECH");
   JComboBox type1= new JComboBox(type);
   
   
   JTextField emailTextField = new JTextField();
   JTextField companyIdTextField= new JTextField();
   JTextField companyNameTextField= new JTextField();
   JTextField contactNoTextField= new JTextField();
   JTextField cutoffTextField = new JTextField();
   JTextField addressTextField= new JTextField ();
   JTextField HRnameTextField= new JTextField();
   JTextField skillTextField= new JTextField();
   JTextArea Skills = new JTextArea();
   
   
   JButton saveButton= new JButton("Save");
   JButton loginButton= new JButton("Login");
   JButton updateButton= new JButton("Update");
   
   Company_Details(){
       createWindow();
       setLocationAndSize();
       addComponentsToFrame();
       actionEvent();
   }
   
    public void createWindow()
   {
       frame= new JFrame();
       frame.setTitle("COMPANY DETAILS FORM");
       frame.setBounds(300,300,1500,1000);
       frame.getContentPane().setBackground(Color.white);
          frame.getContentPane().setLayout(null);
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setResizable(false);
          
   }
    
    public void setLocationAndSize()
   {
       Title.setBounds(350,2,400,40);
       Title.setBackground(Color.white);
       Title.setFont(new Font("Cambria", Font.CENTER_BASELINE,25));
       
       CompanyIdLabel.setBounds(100,40,400,40);
       CompanyIdLabel.setBackground(Color.white);
       CompanyIdLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
        companyIdTextField.setBounds(100,90,400,40);
        companyIdTextField.setBackground(Color.white);
        companyIdTextField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       companynameLabel.setBounds(100,140,400,40);
       companynameLabel.setBackground(Color.white);
       companynameLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       companyNameTextField.setBounds(100,190,400,40);
       companyNameTextField.setBackground(Color.white);
       companyNameTextField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       emailLabel.setBounds(100,240,400,40);
       emailLabel.setBackground(Color.white);
       emailLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       emailTextField.setBounds(100,290,400,40);
       emailTextField.setBackground(Color.white);
       emailTextField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       contactNoLabel.setBounds(100,340,400,40);
       contactNoLabel.setBackground(Color.white);
       contactNoLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       contactNoTextField.setBounds(100,390,400,40);
       contactNoTextField.setBackground(Color.white);
       contactNoTextField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       AddressLabel.setBounds(100,440,400,40);
       AddressLabel.setBackground(Color.white);
       AddressLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       addressTextField.setBounds(100,490,400,40);
       addressTextField.setBackground(Color.white);
       addressTextField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       HRnameLabel.setBounds(100,540,400,40);
       HRnameLabel.setBackground(Color.white);
       HRnameLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       
       HRnameTextField.setBounds(100,590,400,40);
       HRnameTextField.setBackground(Color.white);
       HRnameTextField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       cutoffLabel.setBounds(100,640,400,40);
       cutoffLabel.setBackground(Color.white);
       cutoffLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       
       cutoffTextField.setBounds(100,690,400,40);
       cutoffTextField.setBackground(Color.white);
       cutoffTextField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       branchLabel.setBounds(550,40,400,40);
       branchLabel.setBackground(Color.white);
       branchLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       b1.setBounds(550,90,400,40);
       b1.setBackground(Color.white);
       b1.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       b2.setBounds(550,140,400,40);
       b2.setBackground(Color.white);
       b2.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       b3.setBounds(550,190,400,40);
       b3.setBackground(Color.white);
       b3.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       b4.setBounds(550,240,400,40);
       b4.setBackground(Color.white);
       b4.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       b5.setBounds(550,290,400,40);
       b5.setBackground(Color.white);
       b5.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       b6.setBounds(550,340,400,40);
       b6.setBackground(Color.white);
       b6.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       b7.setBounds(550,390,400,40);
       b7.setBackground(Color.white);
       b7.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       skillLabel.setBounds(550,440,400,40);
       skillLabel.setBackground(Color.white);
       skillLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       skillTextField.setBounds(550,490,400,40);
       skillTextField.setBackground(Color.white);
       skillTextField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       Type.setBounds(550,540,400,40);
       Type.setBackground(Color.white);
       Type.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       type1.setBounds(680,540,200,40);
       type1.setBackground(Color.white);
       type1.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       
       
       
       saveButton.setBounds(550,610,100,40);
       
       saveButton.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       loginButton.setBounds(660,610,100,40);
       
       loginButton.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
       updateButton.setBounds(770,610,100,40);
       
       updateButton.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
       
   }
    
     public void addComponentsToFrame(){
       frame.add(Title);
       frame.add(CompanyIdLabel);
       frame.add(companyIdTextField);
       frame.add(companynameLabel);
       frame.add(companyNameTextField);
       frame.add(emailLabel);
       frame.add(emailTextField);
       frame.add(contactNoLabel);
       frame.add(contactNoTextField);
       frame.add(AddressLabel);
       frame.add(addressTextField);
       frame.add(HRnameLabel);
       frame.add(HRnameTextField);
       frame.add(cutoffLabel);
       frame.add(cutoffTextField);
       frame.add(branchLabel);
       frame.add(b1);
       frame.add(b2);
       frame.add(b3);
       frame.add(b4); 
       frame.add(b5);
       frame.add(b6); 
       frame.add(b7);
       frame.add(skillLabel); 
       frame.add(skillTextField);
       frame.add(saveButton);
       frame.add(loginButton);
       frame.add(Type);
       frame.add(type1);
       frame.add(updateButton);
       
   }
      public void actionEvent()
   {
      
       saveButton.addActionListener(this);
       loginButton.addActionListener(this);
       updateButton.addActionListener(this);
       
   }
   
      @Override
      public void actionPerformed(ActionEvent e){
          if(e.getSource()==saveButton){
              try{
                  Connection conni= DriverManager.getConnection("jdbc:mysql://localhost:3306/reg", "root","");
                PreparedStatement Pstatement=conni.prepareStatement("INSERT INTO company_details VALUES (?,?,?,?,?,?,?,?,?,?)");
                
                String branch=null;
                if(b1.isSelected()== true)
                {
                    branch= "CSE";
                }
                if(b2.isSelected()== true)
                {
                    branch+= "ISE";
                }
                if(b3.isSelected()== true)
                {
                    branch+= "ECE";
                }
                if(b4.isSelected()== true)
                {
                    branch+= "CIVIL";
                }
                if(b5.isSelected()== true)
                {
                    branch+= "ELECTRICAL";
                }
                if(b6.isSelected()== true)
                {
                    branch= "MECHANICAL";
                }
                if(b7.isSelected()== true)
                {
                    branch= "NANOTECH";
                }
                Pstatement.setString(1,companyIdTextField.getText());
                Pstatement.setString(2,companyNameTextField.getText());
                Pstatement.setString(3,emailTextField.getText());
                Pstatement.setString(4,contactNoTextField.getText());
                Pstatement.setString(5,addressTextField.getText());
                Pstatement.setString(6,HRnameTextField.getText());
                Pstatement.setString(7,cutoffTextField.getText());
                Pstatement.setString(8,branch);
                Pstatement.setString(9,skillTextField.getText());
                Pstatement.setString(10,type1.getSelectedItem().toString());
                
                String usn= companyIdTextField.getText();
                String name= companyNameTextField.getText();
               
                String email= emailTextField.getText();
                
                 if(usn.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Company ID Is Missing");
                    
                }
                
                else if(name.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Company Name Is Missing");
                }
                
                else if(email.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Email Is Missing");
                }
                
              
                
                Statement stmt= conni.createStatement();
                
                String query= "SELECT * FROM company_details";
                ResultSet rs= stmt.executeQuery(query);
                
                while(rs.next())
                {
                    String CompanyId = rs.getString("CompanyId");
                    String Name= rs.getString("CompanyName");
                    
                    if(CompanyId.equals(usn) && Name.equals(name))
                    {
                        JOptionPane.showMessageDialog(null, "Company ID Already Exists");
                        
                    }
                    else
                    {
                        Pstatement.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Company Details Registered Successully");
                }
                
                
           }
                
                if(!rs.next())
                {
                    Pstatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Company Details Registered Successully");
                }
       }
              catch(SQLException ei){
                  ei.printStackTrace();
              }
          }
          
          if(e.getSource()== updateButton){
              try{
                  Connection conni= DriverManager.getConnection("jdbc:mysql://localhost:3306/reg", "root",""); 
               String usn= companyIdTextField.getText();
               String name= companyNameTextField.getText();
               String email= emailTextField.getText();
                
                Statement stmt = conni.createStatement();
                String query= "SELECT * FROM company_details";
                ResultSet rs= stmt.executeQuery(query);
                
                while(rs.next()){
                    
                   String CompanyId = rs.getString("CompanyId");
                   String Name= rs.getString("CompanyName");
                   
                   if(CompanyId.equals(usn) && Name.equals(name)){
                       JOptionPane.showMessageDialog(null, "Company ID Already Exists");
                       JOptionPane.showMessageDialog(null, "You Can Update The Data Or Login");
                       
                       
                       PreparedStatement Pstatement=conni.prepareStatement("update company_details set Companyname=?, Email=?,ContactNo=?,Address= ?, HRName=?, Cutoff=?, Branch=?, Skills=?, Type=? where CompanyId=?");
                        String branch=null;
                if(b1.isSelected()== true)
                {
                    branch= "CSE";
                }
                if(b2.isSelected()== true)
                {
                    branch+= "ISE";
                }
                if(b3.isSelected()== true)
                {
                    branch+= "ECE";
                }
                if(b4.isSelected()== true)
                {
                    branch+= "CIVIL";
                }
                if(b5.isSelected()== true)
                {
                    branch+= "ELECTRICAL";
                }
                if(b6.isSelected()== true)
                {
                    branch= "MECHANICAL";
                }
                if(b7.isSelected()== true)
                {
                    branch= "NANOTECH";
                }
                
                Pstatement.setString(1,companyNameTextField.getText());
                Pstatement.setString(2,emailTextField.getText());
                Pstatement.setString(3,contactNoTextField.getText());
                Pstatement.setString(4,addressTextField.getText());
                Pstatement.setString(5,HRnameTextField.getText());
                Pstatement.setString(6,cutoffTextField.getText());
                Pstatement.setString(7,branch);
                Pstatement.setString(8,skillTextField.getText());
                Pstatement.setString(9,type1.getSelectedItem().toString());
                Pstatement.setString(10,companyIdTextField.getText());
                
                Pstatement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Updated Successfully");
              }
          }
                JOptionPane.showMessageDialog(null,"Enter Details Fields are Empty");
                
                 if(usn.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Company ID Is Missing");
                    
                }
                
                else if(name.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Company Name Is Missing");
                }
                
                else if(email.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Email Is Missing");
                }
                 
      }
              catch(Exception ex){
                  ex.printStackTrace();
              }
          }
          
          if(e.getSource()== loginButton){
              Login l= new Login();
              frame.setVisible(false);
          }
      }
      
      

    
}

class Main4{
    public static void main(String[] args){
        Company_Details tl= new Company_Details();
    }
}
