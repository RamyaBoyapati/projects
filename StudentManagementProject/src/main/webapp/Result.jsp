<%@page import="com.infinite.StudentManagementProject.Result" %>
<%@page import="com.infinite.StudentManagementProject.ResultDAO"%>
<%@page import="com.infinite.StudentManagementProject.Student"%>
<%@page import="com.infinite.StudentManagementProject.StudentDAO"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exam Results</title>
<style>
.bgimage{
   
		background-image: url("img/ab45.jpg");
		background-repeat: no-repeat;
		background-size:cover;
    }
</style>

</head>
<body class="bgimage">
<center>
    <h1>Exam Results</h1>
</center>
<form action="Result.jsp" method="get">
    <label>Student ID:</label>
    <input type="number" name="studentID" value="<%= request.getParameter("studentID") %>"><br><br>
    <input type="submit" value="Search">
</form>
<%
    
    String studentIDParam = request.getParameter("studentID");
    if (studentIDParam != null) {
        int studentID = Integer.parseInt(studentIDParam);
        StudentDAO studentDAO = new StudentDAO();
        Student student = studentDAO.getStudentById(studentID);
        if (student != null) {
            String department = student.getDepartment();
            String[] subjects;
            if (department.equals("Maths")) {
                subjects = new String[]{"Sanskrit", "English", "Mathematics1", "Mathematics2", "Physics", "Chemistry"};
            } else if (department.equals("Science")) {
                subjects = new String[]{"Sanskrit", "English", "Biology", "Zoology", "Physics", "Chemistry"};
            } else {
                // Handle other departments or error case
                subjects = new String[0];
            }
%>
<form action="PercentageCal.jsp" method="post">
    <input type="hidden" name="studentID" value="<%= studentID %>">
    <input type="hidden" name="department" value="<%= department %>">
    <% for (String subject : subjects) { %>
    <label><%= subject %>:</label>
    <input type="number" name="<%= subject %>" required><br><br>
    <% } %>
    <input type="submit" value="Submit">
    <input type="submit" value="Back" onclick="backtoLogin()">
</form>

<c:if test="${param.studentID != null && param.department != null}">
		<jsp:useBean id="result"
			class="com.infinite.StudentManagementProject.Result"></jsp:useBean>
		<jsp:useBean id="resultDAO"
			class="com.infinite.StudentManagementProject.ResultDAO"></jsp:useBean>
			
		 <jsp:setProperty name="result" property="*"/>
		 <jsp:setProperty name="result" property="studentID"
			value="${param.studentID}" />
		<jsp:setProperty name="result" property="department"
			value="${param.department}" />
		<jsp:setProperty name="result" property="sanskrit"
			value="${param.sanskrit}" />
		<jsp:setProperty name="result" property="english"
			value="${param.english}" />
		<jsp:setProperty name="result" property="mathematics1"
			value="${param.mathematics1}" />
		<jsp:setProperty name="result" property="mathematics2"
			value="${param.mathematics2}" />
		<jsp:setProperty name="result" property="biology"
			value="${param.biology}" />
		<jsp:setProperty name="result" property="zoology"
			value="${param.zoology}" />
		<jsp:setProperty name="result" property="physics"
			value="${param.physics}" />
		<jsp:setProperty name="result" property="chemistry"
			value="${param.chemistry}" />
		<jsp:setProperty name="result" property="totalMarks"
			value="${param.totalMarks}" />	
		<jsp:setProperty name="result" property="percentage"
			value="${param.percentage}" /> 
			
        <c:out value="${resultDAO.saveResult(result)}"/>
	</c:if>
	<script>

    function backtoLogin(){
     window.location.href="admin-dashboard.jsp";
        }
    </script>
	
<%
        } else {
%>
<p>Student not found</p>
<%
        }
    }
%>


</body>
</html>
