<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>ADMIN Dashboard</title>
    <style type="text/css">
        .button-container {
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .button-container a {
            display: inline-block;
            margin: 10px;
            padding: 20px;
            text-align: center;
            text-decoration: none;
            background-color: #F0F0F0;
            width: 200px;
        }

        #corner {
            position: absolute;
            bottom: 0;
            right: 0;
            background-color: #555;
            color: white;
            padding: 10px;
        }

        .nav-div {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        body {
            background-image: url("img/1.jpg");
            background-repeat: no-repeat;
            background-size: cover;
        }
    </style>
</head>
<body>
    <center>
        <h2>ADMIN Module</h2>
    </center>
    <div class="nav-div">
        <p>Welcome <c:out value="${usernameSession }" /></p>
        <a href="AdminLogin.jsp">
            <button id="bu4">Logout</button>
        </a>
    </div>
    <h2></h2>
    <br>
    <div class="button-container">
        <a href="addStudentdetails.jsp">Register Student</a>
        <a href="Search.jsp">View Info By ID</a>
        <a href="Result.jsp">Examination Result</a>
        <a href="AdminChangePassword.jsp">Change Password</a>
    </div>
</body>
</html>
