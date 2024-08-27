package controller;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.*;

//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Database connection parameters
        String jdbcURL = "jdbc:postgresql://localhost:5432/Library%20DB";
        String dbUser = "postgres";
        String dbPassword = "2003Ferarri";

        try {
            // Load the JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Prepare SQL query
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);

            // Execute query
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // User found, create session
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                response.sendRedirect("welcome.jsp");
            } else {
                // User not found, redirect to login page with error
                response.sendRedirect("login.jsp?error=Invalid username or password");
            }

            // Close connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("login.jsp?error=Login failed");
        }
    }
}


  
 
