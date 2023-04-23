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
public class ViewStudent extends JFrame{
    
    
    String x[] = {"Name", "Email", "Mobile", "Course","Year","Fees","Paid","Due","Address","City"};
    String y[][] = new String[20][10];
    int i=0,j=0;
    JTable t;
    Font f;
    ViewStudent(){
        super("View Stydent Section");
        setSize(800, 400);
        setLocation(1, 1);
        
        f=new Font("MS UI Gothic",Font.BOLD,15);
        try{
            ConnectionClass obj=new ConnectionClass();
            String q="Select * From student";
            ResultSet rest=obj.stm.executeQuery(q);
            while(rest.next()){
            y[i][j++]=rest.getString("name");
            y[i][j++]=rest.getString("email");
            y[i][j++]=rest.getString("mobile");
            y[i][j++]=rest.getString("course");
            y[i][j++]=rest.getString("year");
            y[i][j++]=rest.getString("fee");
            y[i][j++]=rest.getString("paid");
            y[i][j++]=rest.getString("due");
            y[i][j++]=rest.getString("address");
            y[i][j++]=rest.getString("city");
            i++;
            j=0;
            
            
           }
           t=new JTable(y,x);
           t.setFont(f);
        }
        catch(Exception ex){
            ex.printStackTrace();
            
        }
        
        JScrollPane sp=new JScrollPane(t);
        add(sp);
    
    }
    public static void main(String[] args) {
        new ViewStudent
        ().setVisible(true);
    }
    
    }

