<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	    background-color: blue;
	    color: pink;
	    font-size: 14px;
	    border: none;
	    border-radius: 4px;
	    text-decoration: none;
	    padding-top: 10px;
	    padding-bottom: 10px;
	    padding-left: 20px;
	    padding-right: 20px;
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
    .bgimage{
   
		background-image: url("img/ab35.jpg");
		background-repeat: no-repeat;
		background-size:cover;
    } 
</style>
<title>Insert title Here</title>
</head>
<body class="bgimage">
<center>
<center><h2>Signup Form</h2></center>
  <form>
    <label for="username">Username:</label>
    <input type="text" id="username" name="userName" pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*\d).{6,}$" 
     title="Username must contain at least one uppercase letter, one lowercase letter, and one number (min. 6 characters)" required>
    
    <lable for="password">password:</lable>
    <input type="password" id="password" name="password" pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{6,}$" 
       title="Password must contain at least one uppercase letter, one lowercase letter, one number, and one special symbol (min. 6 characters)" required>
    
    
    <label for="confirm password">confirm password</label>
    <input type="confirm password" id="confirm password" name="confirm password" pattern="^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{6,}$" 
       title="Password must contain at least one uppercase letter, one lowercase letter, one number, and one special symbol (min. 6 characters)" required>
       
  <label for="securityqns">securityqns:</label>
<select id="securityqns" name="securityqns" required>
  <option value="">Select a security question</option>
  <option value="In What is City or Town Was Your first job?">In What is City or Town Was Your first job?</option>
  <option value="What Is the given name of your Mother's Mother?">What Is the given name of your Mother's Mother?</option>
  <option value="What Is the given name of your Father's Father?">What Is the given name of your Father's Father?</option>
  <option value="What is the Last Name of Your Favorite Teacher?">What is the Last Name of Your Favorite Teacher?</option>
  <!-- Add more options as needed -->
</select>

      <label for="answers">Answers:</label>
      <input type="answers" id="answers" name="answers" required><br><br>
    
    
    
    <div class="button-group">
     <a class="reset-button" href="AdminLogin.jsp">Reset</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <button type="submit">Ok</button>
     
     
    </div>
  </form>
  </center>
  <c:if test="${param.userName != null && param.password != null}">
        <jsp:useBean id="admin" class="com.infinite.StudentManagementProject.Admin" />
        <jsp:setProperty property="userName" name="admin"/>
        <jsp:setProperty property="password" name="admin"/>
        <jsp:setProperty property="*" name="admin"/>

        <jsp:useBean id="dao" class="com.infinite.StudentManagementProject.AdminDAO" />
        <c:set var="addAdminResult" value="${dao.addAdmin(admin)}" />

        <c:choose>
            <c:when test="${addAdminResult eq 'Username already exists. Please choose a different username.'}">
                <div class="error-message">${addAdminResult}</div>
            </c:when>
            <c:otherwise>
                <c:out value="${addAdminResult}" />
                
            </c:otherwise>
        </c:choose>
    </c:if>
</body>
</html>
