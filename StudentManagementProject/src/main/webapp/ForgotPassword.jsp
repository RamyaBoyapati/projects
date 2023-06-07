<%@page import="com.infinite.StudentManagementProject.Admin"%>
<%@page import="com.infinite.StudentManagementProject.AdminDAO"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.bgimage{
   
		background-image: url("img/ab37.jpg");
		background-repeat: no-repeat;
		background-size:cover;
    }
</style>
</head>
<body class="bgimage">
<center> <h1>Forgot Password </h1>
<form action="ForgotPassword.jsp" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="userName" required><br><br>
    <input type="submit" value="OK">
</form>
<%

if(request.getParameter("userName")!=null){
	//out.println("userName : "+request.getParameter("userName"));
	 String username = request.getParameter("username");
     Admin admin = new Admin();
     AdminDAO adminDAO= new AdminDAO();
     if(adminDAO.validateUserName(request.getParameter("userName"))){
     	admin.setUserName(request.getParameter("userName"));
    // 	request.setAttribute(arg0, arg1)
     	%>
     	
     	<c:redirect url="SecurityQuestion.jsp?username=${param.userName }" />
     <%} else{
     	
     	%>
     	<b style="color:red">Invalid user name</b>
    <% }
	
	
}%>


<c:if test="${param.username !=null}">
<%
            String username = request.getParameter("username");
            Admin admin = new Admin();
            AdminDAO adminDAO= new AdminDAO();
            if(adminDAO.validateUserName(username)){
            	admin.setUserName(username);
            	%>
            	<c:redirect url="SecurityQuestion.jsp" />
            <%} else{
            	
            	%>
            	<b style="color:red">Invalid user name</b>
           <% }%>
            
</c:if>
</center>

</body>
</html>