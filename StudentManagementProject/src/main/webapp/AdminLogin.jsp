
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<hr>
<center><h1>Student Management Project</h1></center>
<hr>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>  Login Form</title>

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
    
    .signup-button {
     float: left;
      text-align: left;
      display: block;
      background-color: white;
      color:blue;
        font-size: 14px;
        border: none;
      border-radius: 4px;
    }
    
    .forgot-password-button {
      text-align: right;
      float: right;
      background-color: white;
      color:red;
       font-size: 14px;
       border: none;
      border-radius: 4px;
    }
     .bgimage{
   
		background-image: url("img/ab30.jpg");
		background-repeat: no-repeat;
		background-size:cover;
    } 
    
    
</style>
</head>
<body class="bgimage">
<center>
<center><h2>Admin Login Form</h2></center>
  <form >
    <label for="username">Username:</label>
    <input type="text" id="username" name="userName" required>
    
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>
    
    <div class="button-group">
     <a href="Signup.jsp">Signup</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <button type="submit">Login</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="ForgotPassword.jsp" class="forgot-password-button">Forgot Password</a>
    </div>
    
  </form>
		

   <c:if test="${param.userName != null && param.password != null}">
   <jsp:useBean id="admin" class="com.infinite.StudentManagementProject.Admin"></jsp:useBean>
   <jsp:useBean id="dao" class="com.infinite.StudentManagementProject.AdminDAO"></jsp:useBean>
   <jsp:setProperty property="*" name="admin"/>
   <c:set var="flag" value="${dao.validate(admin)}" />
   <c:if test="${flag==true}">
   	<c:set var="usernameSession" value="${param.userName }" scope="session" />
     <c:redirect url="admin-dashboard.jsp"></c:redirect>
   </c:if>
   <c:if test="${flag == false }">
   	<c:out value="Invalid Username/Password" />
   </c:if>
  </c:if>
  </center>
  
</body>
</html>