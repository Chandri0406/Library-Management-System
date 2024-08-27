package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final int MAX_LOGIN_ATTEMPTS = 3;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Get or create a session
        HttpSession session = request.getSession();
        Integer loginAttempts = (Integer) session.getAttribute("loginAttempts");
        
        if (loginAttempts == null) {
            loginAttempts = 0; // Initialize login attempts
        }

        // Database connection parameters
        String jdbcURL = "jdbc:postgresql://localhost:5432/LibraryDB";
        String dbUser = "postgres";
        String dbPassword = "2003Ferarri";

        try {
            // Load the JDBC driver
            Class.forName("org.postgresql.Driver");

            // Prepare SQL query
            try (Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword)) {
                String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, password);
                
                // Execute query
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    // User found, reset login attempts and create session
                    session.setAttribute("loginAttempts", 0);
                    session.setAttribute("username", username);
                    response.sendRedirect("welcome.jsp");
                } else {
                    // Increment login attempts
                    loginAttempts++;
                    session.setAttribute("loginAttempts", loginAttempts);

                    if (loginAttempts >= MAX_LOGIN_ATTEMPTS) {
                        // Invalidate session after max attempts and redirect to register page
                        session.invalidate();
                        response.sendRedirect("register.jsp?error=Account locked due to too many failed attempts. Please register again.");
                    } else {
                        // Redirect to login page with error message
                        response.sendRedirect("login.jsp?error=Invalid username or password. Attempt " + loginAttempts + " of " + MAX_LOGIN_ATTEMPTS);
                    }
                }
            }
        } catch (IOException | ClassNotFoundException | SQLException e) {
            response.sendRedirect("login.jsp?error=Login failed");
        }
    }
}
