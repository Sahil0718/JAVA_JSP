import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private registerDao dao;

    @Override
    public void init() {
        dao = new registerDao();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Get form values
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");

        //Create a model object
        Member member = new Member();
        member.setUsername(username);
        member.setEmail(email);
        member.setPassword(password);
        member.setPhone(phone);

        //Insert into DB, Call DAD to insert into DB
        boolean success = dao.insert(member);

        //Redirect or forward based on a DAD result
        if (success) {
            response.sendRedirect("success.jsp");
        } else {
            request.setAttribute("error", "Registration Failed! Please try again ");
            request.getRequestDispatcher("member_register.jsp").forward(request, response);
        }
    }
}