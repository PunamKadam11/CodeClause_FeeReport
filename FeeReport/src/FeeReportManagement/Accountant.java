/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeeReportManagement;

/**
 *
 * @author hp
 */
import java.awt.event.*;

import java.awt.*;
import javax.swing.*;
import java.sql.*;


/**
 *
 * @author hp
 */
public class Accountant extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JButton bt1,bt2;
    JPanel p1,p2;
    Font f,f1;
    JTextField tf;
    JPasswordField pf; 
    
    Accountant(){
        super("Accountant login Page");
        setLocation(100,100);
        setSize(500,200);
         l1=new JLabel("Accountant");
        l2=new JLabel("Name");
        l3=new JLabel("Password");
        
        
         l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.blue);
        
        bt1=new JButton("Login");
        
       
        bt2=new JButton("cancel");
         bt1.addActionListener(this);
        bt2.addActionListener(this);
        tf=new JTextField();
        pf=new JPasswordField();
        tf.setFont(f1);
        pf.setFont(f1);
        
        
        
        f=new Font("Arrial",Font.BOLD,26);
        f1=new Font("Arrial",Font.BOLD,15);
        
        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
         bt1.setFont(f1);
          bt2.setFont(f1);
          
           p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);
        
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(3,2,10,10));
        p2.add(l2);
        p2.add(tf);
       
        p2.add(l3);
        p2.add(pf);
        
        p2.add(l3);
        p2.add(pf);
        bt1.setPreferredSize(new Dimension(100,400));
        p2.add(bt1);
        
        p2.add(bt2);
     
       
        
         this.setVisible(true);
        
        setLayout(new BorderLayout(0,0));
        
        
        add(p1,"North");
        add(p2,"Center");
        
    }
    public void actionPerformed(ActionEvent e){
        String name=tf.getText();
        String pass=pf.getText();
        if(e.getSource()==bt1)
        {
            try
            {
                ConnectionClass obj=new ConnectionClass();
              String q="Select * from accountant where name='"+name+"'and password='"+pass+"'";
                ResultSet rest=obj.stm.executeQuery(q);
                if(rest.next()){
                    new AccountantSection().setVisible(true);
                    this.setVisible(false);
                }
                else{
                    
                    JOptionPane.showMessageDialog(null,"Your Name And Password Wrong");
                     this.setVisible(true);
                }
            }
                
            catch(Exception ee){
                ee.printStackTrace();
                
            }
            
        }
        if(e.getSource()==bt2){
            this.setVisible(false);
            
        }
        
    }
    public static void main(String[] args){
        new Accountant().setVisible(true);
    }
}
