/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeration_form;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;




/**
 *
 * @author Anushka
 */
public class Home implements ActionListener
{
   static String prn=null;
   JFrame frame;
   JLabel welcome= new JLabel("Welcome To Recruitment Management");
   JMenuBar menuBar= new JMenuBar();
   JMenu menu1 = new JMenu("New");
   JMenu menu2 = new JMenu("Help");
   
   
   JMenuItem menuItem1= new JMenuItem("Student Registeration");
   JMenuItem menuItem2 = new JMenuItem("TPO Registeration");
    JMenuItem menuItem3 = new JMenuItem("Login");
     JMenuItem menuItem4 = new JMenuItem("Exit");
     
      JMenuItem menuItem5 = new JMenuItem("Change Password");
      Icon p;
      JLabel image = new JLabel();
      
      Home(){
          createWindow();
          setLocationAndSize();
          addComponentToFrame();
          actionEvent();
          
      }
      
      public void createWindow()
      {
          frame=new JFrame();
          frame.setTitle("Home");
          frame.setBounds(300, 300, 800, 800);
          frame.getContentPane().setBackground(Color.white);
          frame.getContentPane().setLayout(null);
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setResizable(false);
          
      }
      
      public void setLocationAndSize(){
          menuBar.setBounds(2,2,1280, 30);
          
          
          menu1.setBounds(2,2,100,30);
          menu1.setFont(new Font("Cambria",Font.CENTER_BASELINE,15));
          
           menuItem1.setBounds(2,2,100,40);
          menuItem1.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
          
           menuItem2.setBounds(2,8,100,40);
          menuItem2.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
          
           menuItem3.setBounds(2,14,100,40);
          menuItem3.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
          
           menuItem4.setBounds(2,20,100,40);
          menuItem4.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
          
          menu2.setBounds(40,2,100,30);
          menu2.setFont(new Font("Cambria", Font.CENTER_BASELINE,15));
          menuItem5.setBounds(30,2,100,40);
          menuItem5.setFont(new Font("Cambria",Font.CENTER_BASELINE,10));
          
          menu1.add(menuItem1);
          menu1.add(menuItem2);
          menu1.add(menuItem3);
          menu1.add(menuItem4);
             
             
              menu2.add(menuItem5);
              
              menuBar.add(menu1);
              menuBar.add(menu2);
              
              welcome.setBounds(100, 100, 800, 50);
              welcome.setBackground(Color.white);
              welcome.setForeground(Color.red);
              welcome.setFont(new Font("Cambria", Font.CENTER_BASELINE,30));
              
              //p = new ImageIcon("C:\\Users\\Anushka\\Downloads\\social_media_recruitment.jpg");
              
              image.setBounds(0,0,1200,800);
              image.setIcon(p);
              
             
             
      }
      
      public void addComponentToFrame(){
          frame.add(menuBar);
          frame.add(welcome);
          frame.add(image);
      }
      
      public void actionEvent(){
          
          menuItem1.addActionListener(this);
          menuItem2.addActionListener(this);

          menuItem3.addActionListener(this);

          menuItem4.addActionListener(this);

          menuItem5.addActionListener(this);

          
      }
      
      public void actionPerformed(ActionEvent e){
          
          if(e.getSource()== menuItem1)
          {
              Student_Details sd = new Student_Details();
              frame.setVisible(false);
          }
          
           if(e.getSource()== menuItem2)
          {
              TPO_Details sd = new TPO_Details();
              frame.setVisible(false);
          }
            if(e.getSource()== menuItem3)
          {
              Login l = new Login();
              frame.setVisible(false);
          }
            
             if(e.getSource()== menuItem4)
          {
              
              frame.setVisible(false);
          }
              
             if(e.getSource()== menuItem5)
          {
              PassChange ps= new PassChange();
          }
      }
      
      
}

class Main{
    public static void main(String agrs[]){
        Home s = new Home();
    }
}
