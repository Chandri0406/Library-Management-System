/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author peter
 */
public class ConnectionProvider {
    private static final String URL = "urlstring";
    private static final String USER = "postgreS";
    private static final String PASS = "admin";
    
    static  {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
        }
}
