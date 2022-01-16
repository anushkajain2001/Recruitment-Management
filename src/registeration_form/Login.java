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
public class Login implements ActionListener{
    
    JFrame frame;
    JLabel USNLabel= new JLabel("USER ID");
    JLabel Title= new JLabel("LOGIN FORM");
    JTextField USNTextField= new JTextField();
    JLabel passwordLabel= new JLabel("PASSWORD");
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton= new JButton("Login");
    JLabel image= new JLabel();
    Icon p;
    
    String[] choice= {"Student", "Faculty"};
    JComboBox choiceComboBox= new JComboBox(choice);
    
    Login(){
         createWindow();
       setLocationAndSize();
       addComponentsToFrame();
       actionEvent();
    }
    
    public void createWindow(){
       frame= new JFrame();
       frame.setTitle("LOGIN FORM");
       frame.setBounds(300,300,800,900);
       frame.getContentPane().setBackground(Color.white);
       frame.getContentPane().setLayout(null);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
        
    }
    
    public void setLocationAndSize(){
        
        Title.setBounds(300,50,400,40);
        Title.setBackground(Color.white);
        Title.setForeground(Color.red);
        Title.setFont(new Font("Cambria", Font.CENTER_BASELINE,25));
        
        choiceComboBox.setBounds(300,150,200,40);
        choiceComboBox.setBackground(Color.white);
        choiceComboBox.setFont(new Font("Cambria", Font.CENTER_BASELINE,20));
        
        USNLabel.setBounds(200,200,400,40);
        USNLabel.setBackground(Color.white);
        USNLabel.setForeground(Color.red);
        USNLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,25));
        
        USNTextField.setBounds(200,250,400,40);
        USNTextField.setBackground(Color.white);
        USNTextField.setFont(new Font("Cambria", Font.CENTER_BASELINE,20));
        
        passwordLabel.setBounds(200,300,400,40);
        passwordLabel.setBackground(Color.white);
        passwordLabel.setForeground(Color.red);
        passwordLabel.setFont(new Font("Cambria", Font.CENTER_BASELINE,25));
        
        passwordField.setBounds(200,350,400,40);
        passwordField.setBackground(Color.white);
        passwordField.setFont(new Font("Cambria", Font.CENTER_BASELINE,20));
        
       // p= new ImageIcon("C:\\Users\\Anushka\\Downloads\\social_media_recruitment.jpg");
        
        image.setBounds(10,130,800,420);
        image.setIcon(p);
        loginButton.setBounds(200,450,400,40);
        
        
        
        
         
    }
    
    public void addComponentsToFrame(){
        frame.add(Title);
        frame.add(choiceComboBox);
        frame.add(USNLabel);
        frame.add(USNTextField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(image);
        
    }
    
    public void actionEvent(){
        loginButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==loginButton){
            try{
                Connection conni= DriverManager.getConnection("jdbc:mysql://localhost:3306/reg", "root","");
                
                Statement stmt= conni.createStatement();
                Statement stmti= conni.createStatement();
                String usn= USNTextField.getText();
                String pass= passwordField.getText();
                
                if(choiceComboBox.getSelectedItem().toString().equals("Student"))
                {
                    String query = "SELECT * FROM student_details";
                    ResultSet rs= stmt.executeQuery(query);
                    
                    while(rs.next())
                    {
                        String UserId= rs.getString("USN");
                        String Password= rs.getString("Password");
                        
                        if(UserId.equals(usn) && Password.equals(pass))
                        {
                            JOptionPane.showMessageDialog(null,"Log In Successful");
                            Search s= new Search();
                            frame.setVisible(false);
                        }
                    }
                }
                
                if(choiceComboBox.getSelectedItem().toString().equals("Faculty"))
                {
                    String query1= "SELECT * FROM tpo_details";
                    ResultSet rs1= stmti.executeQuery(query1);
                    
                    while(rs1.next())
                    {
                        String UserId1= rs1.getString("UserId");
                        String Password1= rs1.getString("Password");
                        
                        if(UserId1.equals(usn) && Password1.equals(pass))
                        {
                            JOptionPane.showMessageDialog(null,"Log In Successful");
                            Search s= new Search();
                            frame.setVisible(false);
                        }
                    }
                }
                else
                    JOptionPane.showMessageDialog(null,"Invalid Credentials");
                    
            }
            catch(SQLException ei)
            {
                ei.printStackTrace();
            }
        }
        
    }
}

class Main5 {
    public static void main(String[] args)
    {
        Login l= new Login();
    }
}
