/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author romul
 */
public class ConnectionFactory {
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
            
        
            Class.forName("com.mysql.jdbc.Driver");
            
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/academico","root","Romulo9436;");
        
    }        
    
}
