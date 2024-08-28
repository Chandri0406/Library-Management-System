package controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RegisterServlet extends HttpServlet{
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse res) {
        String username = req.getParameter("username");
        String n = req.getParameter("name");
        String s = req.getParameter("surname");
        String pass = req.getParameter("password");
        String phone = req.getParameter("phone");
        String em = req.getParameter("email");
        
        try {
            addUser (username, n, s, pass, phone, em);
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void addUser(String username, String n, String s, String pass, String phone, String em) throws SQLException {
        String query = "INSERT INTO User_tb (Username, Name, Surname, Password, Phone, Email) VALUES (?, ?, ?, ?, ?, ?)";
        
        Connection con  = ConnectionProvider.getConnection();
        
        try {
            PreparedStatement us = con.prepareStatement(query);
            
            us.setString(1, username);
            us.setString(2, n);
            us.setString(3, s);
            us.setString(4, pass);
            us.setString(5, phone);
            us.setString(6, em);
            us.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
