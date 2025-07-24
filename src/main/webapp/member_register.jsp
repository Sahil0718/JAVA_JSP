<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 7/24/2025
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Form</title>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/css/style.css">
</head>
<body>
<div class="form-container">
    <h2>Registration Form</h2>
    <%String error = (String) request.getAttribute("error"); %>
    <% if (error != null) {%>
    <p style="color:red;"><%=error%></p>
    <% } %>
    <form action="register" method="POST">
        <label for="username">Username:</label><br>
        <input type="text" id="username" name="username" required><br><br>

        <label for="email">Email:</label><br>
        <input type="email" id="email" name="email" required><br><br>

        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br><br>

        <label for="phone">Phone:</label><br>
        <input type="tel" id="phone" name="phone" required><br><br>
        <small>Format: 10 digits only</small><br><br>

        <input type="submit" value="Register">
    </form>

</div>

</body>
</html>
