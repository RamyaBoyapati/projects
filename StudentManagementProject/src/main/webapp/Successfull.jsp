<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<hr>
<center><h1>Student Management Project</h1></center>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
form {
      display: flex;
      
      flex-direction: column;
      text-align:left;
      justify-content: center;
      width: 500px;
      height: 100%;
    }
    
    label {
      display: block;
      margin-bottom: 10px;
    }
    
    input[type="text"],
    input[type="password"] {
      width: 50%;
      padding: 10px;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }
    input[type="text"],
    input[type="confirm password"] {
      width: 50%;
      padding: 10px;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }
    button[type="submit"] {
      width: 100%;
      padding: 10px;
      background-color: #4CAF50;
      color: white;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }
    
    .button-group {
      display: flex;
      justify-content: space-between;
      width: 50%;
     
    }
    
    .reset-button {
     float: left;
      text-align: left;
      display: block;
      background-color: blue;
      color:pink;
        font-size: 14px;
        border: none;
      border-radius: 4px;
    }
    
    .ok-button {
      text-align: right;
      float: right;
      background-color: white;
      color:red;
       font-size: 14px;
       border: none;
      border-radius: 4px;
    }
    
    .success-message {
      color: green;
      font-weight: bold;
      margin-top: 10px;
    }
</style>
<title>Insert title Here</title>
</head>
<body>
<c:if test="${not empty success}">
  <div class="success-message">${success}</div>
  <c:redirect url="Login.jsp"/>
</c:if>
<center>
<center><h2>Signup Form</h2></center>
  <form action="signup" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required>
    
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>
    
    <label for="confirmPassword">Confirm Password:</label>
<input type="password" id="confirmPassword" name="confirmPassword" required>

<div class="button-group">
  <button type="submit" class="ok-button">Sign Up</button>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <button type="reset" class="reset-button">Reset</button>
</div>
</form>
  <p>Already have an account? <a href="login.jsp">Login here</a></p>
</center>
</body>
</html>