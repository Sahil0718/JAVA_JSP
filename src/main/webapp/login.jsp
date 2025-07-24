<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 7/21/2025
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="<%= request.getContextPath()%> /css/style.css">
<body>
<h2>User Registration</h2>
<form action="loginmsg" method="post">
    <label>Full Name:</label><br>
    <input type="text" name="fullname" required><br><br>

    <label>Email:</label><br>
    <input type="text" name="email" required><br><br>

    <label>Username:</label><br>
    <input type="text" name="username" required><br><br>

    <input type="submit" value="Register">
</form>
<% String error = (String) request.getAttribute("errorMessage");
    if (error != null) { %>
<p style="color : red;"><%= error%>
</p>
<%}%>
</body>
</html>
