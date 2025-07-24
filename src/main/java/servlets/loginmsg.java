package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class loginmsg extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Set the content type so the browser treats it as HTML
        //res.setContentType("text/html")

        //Get the PrintWriter to write the response
        PrintWriter out = resp.getWriter();

        //Fetch form data from request
        String fullname = req.getParameter("fullname");
        String email = req.getParameter("email");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //Generate HTML response
        out.println("<html><body>");
        out.println("<h2>Registration Successful!</h2>");
        out.println("<p><strong>Full Name:</strong>" + fullname + "</p>");
        out.println("<p><strong>Email:</strong>" + email + "</p>");
        out.println("<p><strong>Username:</strong>" + username + "</p>");
        //Don't display password in the real applications
        out.println("</body></html>");
    }
}

