<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 7/25/2025
  Time: 1:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String msg = request.getParameter("msg");
    if("expired".equals(msg)){
%>
<script>alert("Session Expired! Please login again")</script>
<%
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<form method="post" action="session_login"> <!-- Must match @WebServlet("/login") -->
    Username: <input type="text" name="username" required><br><br>
    Password: <input type="password" name="password" required><br><br>
    <input type="submit" value="Login">
</form>

</body>
</html>
