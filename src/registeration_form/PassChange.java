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
public class PassChange implements ActionListener{
    
    JFrame frame;
    JLabel USNLabel = new JLabel("UserId");
    JLabel passwordLabel = new JLabel("Password");
    JLabel changePassLabel= new JLabel("New Password");
    JLabel Title= new JLabel("Forget Password");
    JLabel repassLabel= new JLabel("Re-Type New Password");
    
    JPasswordField passwordField = new JPasswordField();
    JPasswordField changePassField = new JPasswordField();
    JPasswordField rePasswordField = new JPasswordField();
    JTextField USNTextField= new JTextField();
    String[] choice={"Student","Faculty"};
    JComboBox choiceComboBox= new JComboBox(choice);
    
    JButton ChangeButton = new JButton("Change");
    
    PassChange()
    {
        createWindow();
       setLocationAndSize();
       addComponentsToFrame();
       actionEvent();
    }
    
     public void createWindow()
   {
       frame= new JFrame();
       frame.setTitle("PASSWORD RESET");
       frame.setBounds(300,300,900,800);
       frame.getContentPane().setBackground(Color.white);
          frame.getContentPane().setLayout(null);
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setResizable(false);
          
   }
     
     public void setLocationAndSize(){
        Title.setBounds(200,5,600,40);
        Title.setBackground(Color.white);
        
        Title.setFont(new Font("Cambria", Font.CENTER_BASELINE,25));
        
        choiceComboBox.setBounds(200,60,200,40);
        choiceComboBox.setBackground(Color.white);
        choiceComboBox.setFont(new Font("Cambria", Font.CENTER_BASELINE,25));
        
        USNLabel.setBounds(200,110,400,40);
        USNLabel.setBackground(Color.white);
       
        USNLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
        
        USNTextField.setBounds(200,160,400,40);
        USNTextField.setBackground(Color.white);
        USNTextField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
        
        passwordLabel.setBounds(200,210,400,40);
        passwordLabel.setBackground(Color.white);
      
        passwordLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
        
        passwordField.setBounds(200,260,400,40);
        passwordField.setBackground(Color.white);
        passwordField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
        
        changePassLabel.setBounds(200,310,400,40);
        changePassLabel.setBackground(Color.white);
      
        changePassLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
        
        changePassField.setBounds(200,360,400,40);
        changePassField.setBackground(Color.white);
        changePassField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
        
        repassLabel.setBounds(200,410,400,40);
        repassLabel.setBackground(Color.white);
      
        repassLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
        
        rePasswordField.setBounds(200,460,400,40);
        rePasswordField.setBackground(Color.white);
         rePasswordField.setFont(new Font("Cambria", Font.CENTER_BASELINE,10));
         
         ChangeButton.setBounds(300,530,200,40);
         ChangeButton.setFont(new Font("Cambria", Font.CENTER_BASELINE,15));
     }
     
     public void addComponentsToFrame(){
         
         frame.add(USNLabel);
         frame.add(USNTextField);
         frame.add(Title);
         frame.add(passwordLabel);
         frame.add(passwordField);
         frame.add(changePassLabel);
         frame.add(changePassField);
         frame.add(repassLabel);
         frame.add(rePasswordField);
         frame.add(ChangeButton);
         frame.add(choiceComboBox);
         
         
     }
     
     
     public void actionEvent(){
         ChangeButton.addActionListener(this);
     }
     
     public void actionPerformed(ActionEvent e)
     {
         if(e.getSource()==ChangeButton){
             try{
                 Connection conni= DriverManager.getConnection("jdbc:mysql://localhost:3306/reg", "root","");
                 
                 String usn= USNTextField.getText();
                 String pass= passwordField.getText();
                 String changePass= changePassField.getText();
                 String re_pass= rePasswordField.getText();
                 
                 if(usn.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"UserID Is Missing");
                    
                }
                
                else if(pass.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Password Is Missing");
                }
                
                else if(changePass.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "New Password Is Missing");
                }
                
                else if(!changePass.equals(re_pass)){
                    JOptionPane.showMessageDialog(null, "Password Doesn't Match");
                }
                 
                 if(choiceComboBox.getSelectedItem().toString()== "Student"){
                     Statement stmt= conni.createStatement();
                     
                     String query= "SELECT * FROM student_details";
                     ResultSet rs= stmt.executeQuery(query);
                     
                     while (rs.next()){
                         String UserId = rs.getString("USN");
                         String Password= rs.getString("Password");
                         
                         if(UserId.equals(usn))
                         {
                             JOptionPane.showMessageDialog(null,"User Already Exists");
                             
                             PreparedStatement Pstatement = conni.prepareStatement("update student_details set Password=? where USN=?");
                             
                             Pstatement.setString(1, changePassField.getText());
                             Pstatement.setString(2, USNTextField.getText());
                             
                             Pstatement.executeUpdate();
                             JOptionPane.showMessageDialog(null,"Password Updated Successfully");
                             
                         }
                     }
                 }
                 
                  if(choiceComboBox.getSelectedItem().toString()== "Faculty"){
                     Statement stmt= conni.createStatement();
                     
                     String query= "SELECT * FROM tpo_details";
                     ResultSet rs= stmt.executeQuery(query);
                     
                     while (rs.next()){
                         String UserId = rs.getString("UserId");
                         String Password= rs.getString("Password");
                         
                         if(UserId.equals(usn))
                         {
                             JOptionPane.showMessageDialog(null,"User Already Exists");
                             
                             PreparedStatement Pstatement = conni.prepareStatement("update tpo_details set Password=? where UserId=?");
                             
                             Pstatement.setString(1, changePassField.getText());
                             Pstatement.setString(2, USNTextField.getText());
                             
                             Pstatement.executeUpdate();
                             JOptionPane.showMessageDialog(null,"Password Updated Successfully");
                             
                         }
                     }
                 }
                  
                  frame.setVisible(false);
             }
             catch(Exception ex)
             {
                 ex.printStackTrace();
                 
                 
                 
             }
         }
     }
}
     
     class Main6{
         public static void main(String args[])
         {
             PassChange pc= new PassChange();
         }
     }
    
    

