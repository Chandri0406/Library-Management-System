/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        // Database connection setup
        String jdbcURL = "jdbc:postgresql://localhost:5432/LibraryDB";
        String dbUser = "your_db_username";
        String dbPassword = "your_db_password";

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            String sql = "INSERT INTO Registration (username, name, surname, password, phone, email) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, name);
            statement.setString(3, surname);
            statement.setString(4, password);
            statement.setString(5, phone);
            statement.setString(6, email);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                response.sendRedirect("login.jsp");
            }

            statement.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            response.sendRedirect("register.jsp?error=Registration failed");
        }
    }
}
