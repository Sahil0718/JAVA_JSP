<%@ page import="jakarta.servlet.http.HttpSession" %>
<%@ page import="jakarta.servlet.http.HttpServletRequest" %>
<%
    if (session == null || session.getAttribute("username") == null) {
        // No valid session → redirect to log in
        response.sendRedirect("session_example_login.jsp?msg=expired");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h2>Welcome, <%= session.getAttribute("username") %>!</h2>
<form method="post" action="logoutServlet">
    <input type="submit" value="Logout">
</form>
</body>
</html>
