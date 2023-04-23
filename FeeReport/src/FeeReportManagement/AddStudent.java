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
public class AddStudent extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
    JButton bt1, bt2;
    JPanel p1, p2, p3;

    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10;
    Font f, f1;

    AddStudent() {
        super("AddStudent");
        setLocation(100, 100);
        setSize(400, 600);

        f = new Font("Arrial", Font.BOLD, 26);
        f1 = new Font("Arrial", Font.BOLD, 15);

        l1 = new JLabel("Add Student");
       
        l2 = new JLabel("Name");
        l3 = new JLabel("Email");
        l4 = new JLabel("Mobile No.");
        l5 = new JLabel("Course");
        l6 = new JLabel("Year");
        l7 = new JLabel("Fees");
        l8 = new JLabel("Paid");
        l9 = new JLabel("Due");
        l10 = new JLabel("Address");
        l11 = new JLabel("City");

        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.blue);

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        tf8 = new JTextField();
        tf9 = new JTextField();
        tf10 = new JTextField();

        bt1 = new JButton("Add Student");
        bt2 = new JButton("Back <<");

        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
        l4.setFont(f1);
        l5.setFont(f1);
        l6.setFont(f1);

        l7.setFont(f1);
        l8.setFont(f1);
        l9.setFont(f1);
        l10.setFont(f1);
        l11.setFont(f1);

        bt1.setFont(f1);
        bt2.setFont(f1);

        tf1.setFont(f1);
        tf2.setFont(f1);
        tf3.setFont(f1);
        tf4.setFont(f1);
        tf5.setFont(f1);
        tf6.setFont(f1);
        tf7.setFont(f1);
        tf8.setFont(f1);
        tf9.setFont(f1);
        tf10.setFont(f1);

        bt1.addActionListener(this);
        bt2.addActionListener(this);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 1, 10, 10));
        p1.add(l1);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(12, 2, 10, 10));
        
        p2.add(l2);
        p2.add(tf1);
        p2.add(l3);
        p2.add(tf2);
        p2.add(l4);
        p2.add(tf3);
        p2.add(l5);
        p2.add(tf4);
        p2.add(l6);
        p2.add(tf5);
        p2.add(l7);
        p2.add(tf6);
        p2.add(l8);
        p2.add(tf7);

        p2.add(l9);
        p2.add(tf8);

        p2.add(l10);
        p2.add(tf9);
        p2.add(l11);
        p2.add(tf10);

        p2.add(bt1);
        p2.add(bt2);

        setLayout(new BorderLayout(10, 10));
        add(p1, "North");
        add(p2, "Center");

    }

    public void actionPerformed(ActionEvent e) {

        String name = tf1.getText();
        String email = tf2.getText();
        String mobile = tf3.getText();
        String course = tf4.getText();
        String year = tf5.getText();

        float fee = Float.parseFloat(tf6.getText());
        float paid = Float.parseFloat(tf7.getText());
        float due = Float.parseFloat(tf8.getText());

        String address = tf9.getText();
        String city = tf10.getText();

        if (e.getSource() == bt1) {

            try {
                ConnectionClass obj = new ConnectionClass();

                String q = "insert into student(name,email,mobile,course,year,fee,paid,due,address,city) values( '" + name + "','" + email + "','" + mobile + "','" + course + "','" + year + "','" + fee + "','" + paid + "','" + due + "','" + address + "','" + city + "')";
                int aa = obj.stm.executeUpdate(q);

                if (aa == 1) {
                    JOptionPane.showMessageDialog(null, "Your data Successfully Inserted");
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "Your data Not Successfully Inserted");
                    

                }
                
                

            } 
            catch(Exception ee) {
                ee.printStackTrace();
            }

        }
        
        if(e.getSource()==bt2){
            new AdminSection().setVisible(true);
            this.setVisible(false);
        }
        
        
        
        
    }

    public static void main(String[] args) {

        new AddStudent().setVisible(true);

    }
}
