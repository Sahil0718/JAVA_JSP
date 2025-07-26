import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/session_login")
public class session_login_servlet extends HttpServlet {

    //Dummmy credentials for demonstration
    private final String USERNAME = "admin";
    private final String PASSWORD = "admin";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //Simple validation
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            //Create Session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            //Set session timeout to 60 seconds
            session.setMaxInactiveInterval(60);

            //Redirect to welcome page
            response.sendRedirect("welcome.jsp");

        } else {
            //Invalid login, redirect back with error(could enhance)
            response.sendRedirect("session_example_login.jsp?msg=invalid");
        }
    }
}
