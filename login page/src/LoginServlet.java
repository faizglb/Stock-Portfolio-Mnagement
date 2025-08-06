import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the email and password from the request
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Basic validation (In a real application, you'd verify against a database)
        if ("user@example.com".equals(email) && "password123".equals(password)) {
            // Successful login
            response.sendRedirect("dashboard.html"); // Redirect to the dashboard or another page
        } else {
            // Invalid credentials
            response.sendRedirect("index.html?error=true"); // Redirect back to login page with error
        }
    }
}
