/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeration_form;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;




/**
 *
 * @author Anushka
 */
public class Search implements ActionListener{
    JFrame frame1;
    JLabel nameLabel;
    JTextField nameTextField;
    JButton fetchButton;
    JButton resetButton;
    JButton logoutButton;
    
    JFrame frame2;
    DefaultTableModel defaultTableModel;
    JTable table;
    Connection connection;
    Statement statement;
    static int flag=0;
    
    Search(){
        frame1= new JFrame();
        frame1.setTitle("Recruitment Details");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout bagLayout = new GridBagLayout();
        GridBagConstraints bagConstraints= new GridBagConstraints();
        frame1.setSize(1000,1000);
        frame1.setLayout(bagLayout);
        
        bagConstraints.insets= new Insets(15,40,0,0);
        
        nameLabel = new JLabel("Enter UserId / CompanyName");
        bagConstraints.gridx= 0;
        bagConstraints.gridy= 0;
        
        frame1.add(nameLabel, bagConstraints);
        
        nameTextField= new JTextField(15);
        bagConstraints.gridx= 1;
        bagConstraints.gridy=0 ;
        bagConstraints.ipady= 10;
           frame1.add(nameTextField, bagConstraints);
           
        fetchButton= new JButton("Search Data");
        bagConstraints.gridx= 0;
        bagConstraints.gridy= 1;
        bagConstraints.ipadx= 60;
        frame1.add(fetchButton, bagConstraints);
           
        resetButton = new JButton("Reset Data");
        bagConstraints.gridx= 1;
        bagConstraints.gridy= 1;
        
        frame1.add(resetButton, bagConstraints);
        
        logoutButton = new JButton("Logout");
        bagConstraints.gridx= 2;
        bagConstraints.gridy= 1;
        
        frame1.add(logoutButton, bagConstraints);
        
        fetchButton.addActionListener(this);
        resetButton.addActionListener(this);
        logoutButton.addActionListener(this);
        
        frame1.setVisible(true);
        frame1.validate();
        
    }
    
    public static void main(String[] args){
        new Search();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==fetchButton){
            String UserName= nameTextField.getText();
            frameSecond(UserName);
            
        }
        
        if(e.getSource()==resetButton){
            nameTextField.setText("");
            
            
        }
        
        if(e.getSource()==logoutButton){
            frame1.dispose();
            JOptionPane.showMessageDialog(null,"Logout Successful");
        }
    }
    
    public void frameSecond(String userName){
        
        frame2= new JFrame("Recruitment Details");
        frame2.setLayout(new FlowLayout());
        frame2.setSize(1500,1500);
        
        defaultTableModel= new DefaultTableModel();
        table= new JTable(defaultTableModel);
        table.setPreferredScrollableViewportSize(new Dimension(1000,1000));
        table.setRowHeight(50);
        table.setFillsViewportHeight(true);
        frame2.add(new JScrollPane(table));
        defaultTableModel.addColumn("Username");
        defaultTableModel.addColumn("USN");
        defaultTableModel.addColumn("Branch");
        defaultTableModel.addColumn("CollegeName");
        defaultTableModel.addColumn("CompanyName");
        defaultTableModel.addColumn("Placed");
        defaultTableModel.addColumn("Year");
        defaultTableModel.addColumn("Average");
        defaultTableModel.addColumn("Type");
        JTableHeader tableHeader = table.getTableHeader();
        Font headerFont = new Font("Tahoma",Font.PLAIN,16);
        tableHeader.setFont(headerFont);
        table.setFont(headerFont);
        
        try{
            connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/reg", "root","");
            statement = connection.createStatement();
            
            String query= "select s.Name, s.USN, s.Branch, s.CollegeName, c.companyname, s.Placed, s.Year, r.Average, s.Type from student_details s inner join result r on s.USN= r.USN inner join company_details c where s.CGPA1> c.Cutoff AND s.CGPA2> c.Cutoff AND s.CGPA3> c.Cutoff AND s.CGPA4> c.Cutoff AND s.Type= c.Type";
            ResultSet resultSet= statement.executeQuery(query);
            
            while (resultSet.next()){
                String name= resultSet.getString("Name");
                  String usn= resultSet.getString("USN");
                    String dept= resultSet.getString("Branch");
                      String CollegeName= resultSet.getString("CollegeName");
                        String CompanyName= resultSet.getString("companyname");
                          String placed= resultSet.getString("Placed");
                            String year= resultSet.getString("Year");
                              String avg= resultSet.getString("Average");
                                String type= resultSet.getString("Type");
                                
                                while(userName.equalsIgnoreCase(usn)|| userName.equalsIgnoreCase(CompanyName)){
                                    flag=1;
                                    defaultTableModel.addRow(new Object[]{name,usn,dept,CollegeName,CompanyName,placed,year,avg,type});
                                    frame2.setVisible(true);
                                    frame2.validate();
                                    break;
                        
            
    }
    }
            if(flag==0){
                JOptionPane.showMessageDialog(null,"No Such Username Found");
            }
    }
        catch(SQLException ee){
            ee.printStackTrace();
        }
    }
    }
    
    
    
    

