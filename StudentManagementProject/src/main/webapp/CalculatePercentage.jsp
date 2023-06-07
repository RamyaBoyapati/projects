<%@page import="java.util.Map"%>
<%@page import="com.infinite.StudentManagementProject.Student" %>
<%@page import="com.infinite.StudentManagementProject.StudentDAO" %>
<%@page import="com.infinite.StudentManagementProject.Result"%>
<%@page import="com.infinite.StudentManagementProject.ResultDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculate Percentages</title>
</head>
<body>
<b>Calculate Percentage</b>
<%//Result res=new Result();
// Get the student ID, subjects, and marks from the request parameters
String studentIdParam = request.getParameter("studentID");

String condition= request.getParameter("isMpc");
out.println("isMpc : "+condition);
int TotalMarks=0;


%>
<%
if(condition.equalsIgnoreCase("true")){
	
}



%>
</body>
</html>