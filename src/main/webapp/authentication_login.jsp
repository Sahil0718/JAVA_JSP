<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Login Page</title>
</head>
<body>
<h2>Login</h2>
<form method="post" action="login"> <!-- Must match @WebServlet("/login") -->
  Username: <input type="text" name="username" required><br><br>
  Password: <input type="password" name="password" required><br><br>
  <input type="submit" value="Login">
</form>

<% String error = (String) request.getAttribute("errorMessage");
  if (error != null) { %>
<p style="color: red;"><%= error %></p>
<% } %>
</body>
</html>