<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creating account</title>
</head>
<body>





<h1>Create Account</h1>
    <form action="createAccount" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required><br>
        
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>
        
        <input type="submit" value="Create Account">
    </form>


</body>
</html>