/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management;

import java.sql.*;
/**
 *
 * @author tanis
 */
public class DBConnection {
    
    Connection con;

    public static Connection DBConnect()
    {
        String url = "jdbc:mysql://localhost:3306/library_management";
        
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(url,"root","");
            
            return con;
            
            
        }
        
        catch(Exception e)
        {
            System.out.println("Error:" + e);
            return null;
        }
        
        
    }
    
}
