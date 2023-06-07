<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.infinite.StudentManagementProject.AdminDAO"%>
<%@page import="com.infinite.StudentManagementProject.Admin" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Forgot Password</title>
    <script>

    function backtoLogin(){
     window.location.href="AdminChangePassword.jsp";
        }
</script>
</head>
<body>
    <form action="Forgot.jsp" method="post">
        <label for="username">Username:</label>
    <input type="text" id="username" name="username" required value="${param.username }" readonly><br><br>
        <label for="password">New Password:</label>
        <input type="password" name="password" id="password" pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{6,}$" 
       title="Password must contain at least one uppercase letter, one lowercase letter, one number, and one special symbol (min. 6 characters)" required> <br><br>

        <label for="confirmPassword">Confirm Password:</label>
        <input type="password" name="confirmPassword" pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{6,}$" 
       title="Password must contain at least one uppercase letter, one lowercase letter, one number, and one special symbol (min. 6 characters)" required><br><br>

        <input type="submit" value="Save">
        <input type="submit" value="Back" onclick="backtoLogin()">
    </form>

    <c:if test="${not empty param.username and not empty param.password}">
        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String confirmPassword = request.getParameter("confirmPassword");

            try {
                AdminDAO adminDAO = new AdminDAO();
                adminDAO.validatePassword1(password, confirmPassword);
                adminDAO.forgotPassword(username, password);
                out.println("Password updated successfully!");
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            }
        %>
    </c:if>
</body>
</html>
