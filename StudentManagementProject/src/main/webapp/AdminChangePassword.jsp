<%@page import="com.infinite.StudentManagementProject.Admin"%>
<%@page import="com.infinite.StudentManagementProject.AdminDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Change Password</title>

    <style>
        .error { color: red; }
        .bgimage{
   
		background-image: url("img/ab41.jpg");
		background-repeat: no-repeat;
		background-size:cover;
    }
    </style>
    <script>

    function backtoLogin(){
     window.location.href="AdminLogin.jsp";
        }
        function validateForm() {
            var password = document.forms["changePasswordForm"]["password"].value;
            var confirmPassword = document.forms["changePasswordForm"]["confirmPassword"].value;

            if (password !== confirmPassword) {
                document.getElementById("confirmPasswordError").innerHTML = "";
            }

            var passwordPattern = /^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}$/;

           if (passwordPattern.test(password)) {
                document.getElementById("passwordError").innerHTML = "";
            }
           
            if (passwordPattern.test(confirmPassword)) {
                document.getElementById("passwordError").innerHTML = "";
            } 

            if (!passwordPattern.test(confirmPassword)) {
                document.getElementById("passwordError").innerHTML = "Password should be 8 digits alphanumeric, at least 1 uppercase, 1 special character, and 1 number should exist in the password.";
                return false;
            }
            
            if (!passwordPattern.test(password)) {
                document.getElementById("passwordError").innerHTML = "Password should be 8 digits alphanumeric, at least 1 uppercase, 1 special character, and 1 number should exist in the password.";
                return false;
            }
            
            if (password === confirmPassword) {
                document.getElementById("confirmPasswordError").innerHTML = "Old password and new password cannot be the same.";
                return false;
            }
            return true;
        }
    </script>
</head>
<body class="bgimage">

 <center><h1>Change Password</h1>
    <form name="changePasswordForm" action="AdminChangePassword.jsp" method="post" onsubmit="return validateForm()">
        <label for="username">Username:</label>
        <input type="text" name="username" id="username" value="${usernameSession}" readonly="true"><br><br>

        <label> Old Password:</label>
        <input type="password" name="confirmPassword" required><br>
        <span id="passwordError" class="error"></span><br>

        <label>New Password:</label>
       <input type="password" name="password" required><br>
        <span id="confirmPasswordError" class="error"></span><br>

        <input type="submit" value="Save">
         <input type="submit" value="Back" onclick="backtoLogin()">
        
        </form>

    <c:if test="${not empty param.username and not empty param.password}">
        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String oldPassword = request.getParameter("confirmPassword");
            
			Admin admin = new Admin();
			admin.setUserName(username);
			admin.setPassword(oldPassword);
            boolean flag = new AdminDAO().validate(admin);
            
            if(flag == true){
            	AdminDAO.changePassword(username, password);
       		 	out.print("Password changed successfully.");
            }else{
            	out.print("Old password is not correct.");
            }
        %>
    </c:if>
 </center>   
</body>
</html>
