/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JudiciaryServlet1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class LogInCheck {
    
    public static boolean LoginChecking(String uid,String pwd,String type){
        
        boolean status=false;
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User-Information","root","jayasree");
            String query="select * from LogInDetails where UserId=? and Password=? and Category=?";
            ps=con.prepareStatement(query);
            ps.setString(1, uid);
            ps.setString(2, pwd);
            ps.setString(3,type);
            rs=ps.executeQuery();
           
           
            status=rs.next();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogInCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LogInCheck.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return status;
    }
    
    public static boolean CreateAccount(String uname,String pswd,String type,String security,String answer,String uid){
        int i=0;
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/User-Information","root","jayasree");
            String s="insert into LogInDetails(UserName,Password,Category,Security,answer,UserId) values(?,?,?,?,?,?);";
            ps=con.prepareStatement(s);
            ps.setString(1,uname);
            ps.setString(2,pswd);
            ps.setString(3,type);
            ps.setString(4,security);
            ps.setString(5,answer);
            ps.setString(6,uid);
    
            i=ps.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogInCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LogInCheck.class.getName()).log(Level.SEVERE, null, ex);
        }
       if(i>0)
           return true;
       else
           return false;
        
    }
    
    public static void PasswordValidation(String pswd)
    {
        if(pswd == "")
        {
           JOptionPane.showMessageDialog(null, "Passwrod do not be empty");
        }
       
    }
   
        
}
    

