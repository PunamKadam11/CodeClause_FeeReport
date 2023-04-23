/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeeReportManagement;
import java.awt.event.*;

import java.awt.*;
import javax.swing.*;
import java.sql.*;



/**
 *
 * @author hp
 */
public class index extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JButton bt1,bt2;
    JPanel p1,p2,p3;
    Font f,f1;
    index(){
        super("Home Page");
        setLocation(100,100);
        setSize(400,250);
        
        
        l1=new JLabel("Fee Report");
        l2=new JLabel("Admin Login");
        l3=new JLabel("Accountant Login");
        
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.red);
        
        bt1=new JButton("Login");
       bt1.setSize(30,40);
         bt1.setPreferredSize(new Dimension(40, 40));
       bt1.setVisible(true);
       
        bt2=new JButton("Login");
        
        
        
        
       bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        f=new Font("Arrial",Font.BOLD,26);
        f1=new Font("Arrial",Font.BOLD,15);
        
        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
         bt1.setFont(f1);
          bt2.setFont(f1);
          
          ImageIcon I=new ImageIcon(ClassLoader.getSystemResource("FeeReportManagement/icons/login.jpg"));
        Image img=I.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
 
        
        ImageIcon ii=new ImageIcon(img);
        l4=new JLabel(ii);
        
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);
        
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(2,2,10,10));
        p2.add(l2);
        bt1.setPreferredSize(new Dimension(40, 40));
        p2.add(bt1);
        this.setVisible(true);
       
        p2.add(l3);
        p2.add(bt2);
        
        p3=new JPanel();
        p3.setLayout(new GridLayout(1,1,10,10));
        p3.add(l4);
        
        setLayout(new BorderLayout(0,0));
        
        
        add(p1,"North");
        add(p2,"Center");
        add(p3,"West");
        
       
        
        
        
        
        
        
        
    }
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==bt1){
            new Admin().setVisible(true);
           
        }
        if(e.getSource()==bt2){
            new Accountant().setVisible(true);
            this.setVisible(false);
        }
    
    }
    public static void main(String[] args){
        
        new index().setVisible(true);
        
    }
}
