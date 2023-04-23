/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeeReportManagement;
import java.sql.*;
/**
 * 
 * 
 *
 * @author hp
 */
public class ConnectionClass {
  public Connection con;
    public Statement stm;
    
    
    ConnectionClass(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Fee?zeroDateTimeBehavior=CONVERT_TO_NULL  ","root","");
            stm=con.createStatement();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args){
        new ConnectionClass();
    } 
}
