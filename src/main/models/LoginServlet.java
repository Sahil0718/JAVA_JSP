
import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")  // Maps to form action
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "nccs".equals(password)) {
            // Successful login → forward to dashboard.jsp
            RequestDispatcher dispatcher = request.getRequestDispatcher("dashboard.jsp");
            dispatcher.forward(request, response);
        } else {
            // Failed login → include login.jsp with error
            request.setAttribute("errorMessage", "Invalid username or password!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("authentication_login.jsp");
            dispatcher.include(request, response); // This opens dashboard.jsp
        }
    }
}