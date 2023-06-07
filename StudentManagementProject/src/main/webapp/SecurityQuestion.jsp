<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
     .bgimage{
   
		background-image: url("img/ab39.jpg");
		background-repeat: no-repeat;
		background-size:cover;
    }
    </style>

</head>
<body class="bgimage">
<center><h1>Checking Questions</h1>

<jsp:useBean id="dao" class="com.infinite.StudentManagementProject.AdminDAO" />
<c:set var="admin" value="${dao.getAdminByUsername(param.username)}" />

<form action="Forgot.jsp" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required value="${param.username }" readonly><br><br>
    <label>Security Questions :</label>
    <span>${admin.securityqns}</span><br><br>
    <label for="answers">Answers:</label>
    <input type="text" id="answers" name="answers" required><br><br>
    <!-- <label for="newpassword">New Password:</label>
    <input type="text" id="newpassword" name="password" required><br><br> -->
    <input type="submit" value="OK">    
</form>

<c:if test="${param.answers != null }">
	<c:if test="${param.answers eq admin.answers }">
	    
		${dao.changePassword(param.username, param.password) } 
	</c:if>
	<c:if test="${param.answers ne admin.answers }">
		<c:out value="Answer is not correct." />
	</c:if>
</c:if>
</center>
</body>
</html>