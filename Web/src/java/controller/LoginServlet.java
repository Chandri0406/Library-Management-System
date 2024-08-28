package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginServlet extends HttpServlet {
 @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
    
    String username = request.getParameter("Username");
    String password = request.getParameter("Password");

    try {
        String result = fetchData(username, password);
        if (result.equals("Login successful")) {
            // Store the username in the session
            request.getSession().setAttribute("username", username);
            // Redirect to welcome.jsp
            response.sendRedirect("welcome.jsp");
        } else if (result.equals("No user found")) {
            // Redirect to register.jsp
            response.sendRedirect("register.jsp");
        } else {
            // Handle any other cases, e.g., errors
            request.setAttribute("errorMessage", result);
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    } catch (SQLException ex) {
        Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        request.setAttribute("errorMessage", "An error occurred: " + ex.getMessage());
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}

public String fetchData(String username, String password) throws SQLException {
    Connection conn = ConnectionProvider.getConnection();
    // Adjusted the SQL query to use the correct column names
    String sql = "SELECT * FROM \"Login\" WHERE \"Username\" = ? AND \"Password\" = ?";
    PreparedStatement stmt = conn.prepareStatement(sql);
    stmt.setString(1, username);
    stmt.setString(2, password);
    
    ResultSet rs = stmt.executeQuery();
    
    if (rs.next()) {
        // User exists and credentials are correct
        return "Login successful";
    } else {
        // User does not exist or invalid credentials
        return "No user found";
    }
}
}


