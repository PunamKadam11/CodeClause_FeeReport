/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeeReportManagement;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class AddAccountant extends JFrame implements ActionListener 
{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JButton bt1,bt2;
    JPanel p1,p2,p3;
    JPasswordField pf;
    JTextField tf1,tf2,tf3,tf4;
    Font f,f1;
    AddAccountant(){
        
        super("AddAccountant");
        setLocation(100,100);
        setSize(800,400);
        
        l1=new JLabel("Add Accountant"); 
          l2=new JLabel("Name");
        
         l3=new JLabel("Password");
          l4=new JLabel("Email");
           l5=new JLabel("Contact");
            l6=new JLabel("Address");
            l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.blue);
            
            tf1=new JTextField();
            tf2=new JTextField();
            tf3=new JTextField();
            tf4=new JTextField();
            
            pf=new JPasswordField();
            
        bt1=new JButton("Add Accountant");
        bt2=new JButton("Back");
        
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("FeeReportManagement/icons/Account.png"));
        Image img2=img.getImage().getScaledInstance(100, 120, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        l7=new JLabel(img3);
            
        f=new Font("Arrial",Font.BOLD,26);
        f1=new Font("Arrial",Font.BOLD,15);
        
        
        l1.setFont(f);
         l2.setFont(f1);
         l3.setFont(f1);
         l4.setFont(f1);
         l5.setFont(f1);
         l6.setFont(f1);
         
         bt1.setFont(f1);
         bt2.setFont(f1);
         
         
         tf1.setFont(f1);
         tf2.setFont(f1);
         tf3.setFont(f1);
         tf4.setFont(f1);
         pf.setFont(f1);
         
         
        p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(6,2,10,10));
        p2.add(l2);
        p2.add(tf1);
        p2.add(l3);
        p2.add(pf);
        p2.add(l4);
        p2.add(tf2);
        p2.add(l5);
        p2.add(tf3);
        p2.add(l6);
        p2.add(tf4);
        
        p2.add(bt1);
        p2.add(bt2);
        
        p3=new JPanel();
        p3.setLayout(new GridLayout(1,1,10,10));
        p3.add(l7);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        
        
        setLayout(new BorderLayout(10,10));
        add(p1,"North");
        add(p2,"Center");
        add(p3,"East");
        
         
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==bt1)
        {
            String name=tf1.getText();
            String pass=pf.getText();
            String email=tf2.getText();
            String mob=tf3.getText();
            String add=tf4.getText();
            try{
                ConnectionClass obj=new ConnectionClass();
                String q="insert into accountant(name,password,email,contact,address) values('"+name+"','"+pass+"','"+email+"','"+mob+"','"+add+"')";
               int a=obj.stm.executeUpdate(q);
               
               
               if(a==1){
                   JOptionPane.showMessageDialog(null,"Your data Successfully Inserted");
                   this.setVisible(false);
                   
               }
               else{
                   JOptionPane.showMessageDialog(null,"Your data Not Successfully Inserted");
                   this.setVisible(true);
                   
               }
               
            }
            
            catch(Exception ee){
                ee.printStackTrace();
            }
            
            
            
            
            
        }
        if(e.getSource()==bt2){
            new AdminSection().setVisible(true);
            this.setVisible(false);
        }
        
    
    
    
    }
    
    


 public static void main(String[] args)
{



        new AddAccountant().setVisible(true);
        
      
}
}

