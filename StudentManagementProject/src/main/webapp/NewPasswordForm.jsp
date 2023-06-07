<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.infinite.StudentManagementProject.Admin" %>
<%@ page import="com.infinite.StudentManagementProject.AdminDAO" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	.error { color: red; }
</style>
<script>
function validateForm() {
    var password = document.forms["changePasswordForm"]["password"].value;
    var confirmPassword = document.forms["changePasswordForm"]["confirmPassword"].value;

    if (password === confirmPassword) {
        document.getElementById("confirmPasswordError").innerHTML = "New password and confirm password cannot be the same.";
        return false;
    }

    var passwordPattern = /^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}$/;
    if (!passwordPattern.test(password)) {
        document.getElementById("passwordError").innerHTML = "Password should be 8 characters long and include at least 1 uppercase letter, 1 lowercase letter, 1 digit, and 1 special character.";
        return false;
    }

    return true;
}
</script>
</head>
<body>
<h1>Change Password</h1>
	<form name="changePasswordForm" action="NewPasswordForm.jsp" method="get" onsubmit="return validateForm()" >
		

		<label> New Password:</label>
		<input type="password" name="confirmPassword" required><br>
		<span id="passwordError" class="error"></span><br>

		<label>Confirm Password:</label>
		<input type="password" name="password" required><br>
		<span id="confirmPasswordError" class="error"></span><br>

		<input type="submit" value="Save">
	</form>
	<c:if test="${param.username !=null && param.password!=null}">
   <jsp:useBean id="dao" class="com.infinite.StudentManagementProject.AdminDAO"></jsp:useBean>
   <c:out value="${dao.changePassword(param.username, param.password)}" />
   </c:if>
	
</body>
</html>