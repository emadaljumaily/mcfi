package proj;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author emada
 */
public class Connections {
   
   private static String url="jdbc:mysql://localhost:3306/mcfi?useUnicode=true&characterEncoding=UTF-8";
 
   public static Connection con;
   public static String user="root";
   public static String password="";

    public static Connection getConnection(){
        try{
            
            con=DriverManager.getConnection(url,user,password);
           
            
            
        }
        catch(Exception ex){
            
           ex.printStackTrace();
            
        }
       return con;
        
    }
}
