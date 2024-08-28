package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/OpenDesktopApp")
public class openDesktopApp extends HttpServlet {

   protected void doGet(HttpServletRequest request, HttpServletResponse response) 
           throws ServletException, IOException {
      // Path to the .jar file or the compiled Java class
        String command = "java -jar ./dist/Desktop.jar";
        
        try {
            Process process = Runtime.getRuntime().exec(command);
            
            // Optionally, wait for the process to complete and capture the output
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                response.getWriter().write("Desktop application started successfully!");
            } else {
                response.getWriter().write("Failed to start the desktop application.");
            }
            
        } catch (IOException | InterruptedException e) {
            response.getWriter().write("Failed to start the desktop application.");
            e.printStackTrace();
        }
    }
}
