package proj;


 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
import static proj.Connections.con;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emad mohamed
 */
public class query1 {
    public Connection getConnection(){
        Connection con = null;
        con = Connections.getConnection();
        return con;
    }
   public ArrayList<product1> www(){
      ArrayList<product1> list=new ArrayList<product1>();
        
        int i=1;
        i++;
        Statement st;
        ResultSet rs;
        String sql="SELECT CONCAT(name,'\\n',address,'/ ', regin) As dd,phone FROM person WHERE mod (PERSONID,2) = 1 ";

        try {
            con=Connections.getConnection();   
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            product1 p;
            while (rs.next()){
                p=new product1(rs.getString("DD"),rs.getString("PHONE"));
                
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(query1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
   }
}
