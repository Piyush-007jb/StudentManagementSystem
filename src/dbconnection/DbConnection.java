/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author acer
 */
public class DbConnection {
    
    static Connection con;
    static public Connection getConnect()
    {
       
        try 
        {
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql:///student_management_system","root","toor");
        }
        catch (Exception e) 
        {
           // System.out.println(e);
            e.printStackTrace();
        }
        return con;
    }
    
}
