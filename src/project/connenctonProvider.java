/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

// import com.sun.jdi.connect.spi.Connection;
import java.sql.*;

/**
 *
 * @author indra
 */
public class connenctonProvider {
    public static Connection getCon()
    {
        try
        {Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/libma","root","asdfghjkl123");
        return con;
        }
        catch(Exception e){
                    System.out.println(e);
                    return null;
                }

    }
       
        
    
}
