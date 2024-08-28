package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegisterServlet extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
    throws ServletException, IOException {
        String username = req.getParameter("username");
        String n = req.getParameter("name");
        String s = req.getParameter("surname");
        String pass = req.getParameter("password");
        String phone = req.getParameter("phone");
        String em = req.getParameter("email");

        try {
            if (usernameExists(username)) {
                // Username already exists, set error message and redirect back to register.jsp
                req.setAttribute("errorMessage", "Username already exists. Please choose a different username.");
                req.getRequestDispatcher("register.jsp").forward(req, res);
            } else {
                addUser(username, n, s, pass, phone, em);
                System.out.println("User: " + username + " " + n + " " + s + " " + pass + " " + phone + " " + em + " has been added");
                res.sendRedirect("login.jsp");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Method to check if the username already exists in the database
    protected boolean usernameExists(String username) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM \"User_tb\" WHERE \"Username\" = ?";
        Connection con;
        DBConnection dbcon = new DBConnection();
        con = dbcon.getConnection();
        boolean exists = false;

        try {
            PreparedStatement checkStmt = con.prepareStatement(query);
            checkStmt.setString(1, username);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                exists = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return exists;
    }

    // Method to add a new user to the database
    protected void addUser(String username, String n, String s, String pass, String phone, String em) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO \"User_tb\"(\"Username\", \"Name\", \"Surname\", \"Password\", \"Phone\", \"Email\") VALUES (?, ?, ?, ?, ?, ?);";

        Connection con;
        DBConnection dbcon = new DBConnection();
        con = dbcon.getConnection();

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
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}
