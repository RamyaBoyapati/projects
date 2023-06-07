<%@page import="java.util.Comparator"%>
<%@ page import="java.util.List" %>
<%@ page import="com.infinite.StudentManagementProject.Student" %>
<%@ page import="com.infinite.StudentManagementProject.StudentDAO" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Student Information</title>
<style>
.bgimage{
   
		background-image: url("img/ab42.jpg");
		background-repeat: no-repeat;
		background-size:cover;
    }
</style>
</head>
<body class="bgimage">
<center><h1>View Student Information</h1>
<form method="post" action="StudentViewData.jsp">
    <label for="studentId">Student ID:</label>
    <input type="text" id="studentId" name="studentId"> <br><br>
    <label for="firstName">First Name:</label>
    <input type="text" id="firstName" name="firstName"> <br><br>

    <input type="reset" value="Reset" style="margin-left: 10px;" class="btn btn-secondary">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" value="Search">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

    <a href="admin-dashboard.jsp">
        <input type="button" value="Exit" class="btn btn-danger" onclick="window.location.href='exit.jsp'"
               style="margin-right: 10px;">
    </a>
</form>


<script>
    var resetButton = document.querySelector('input[type="reset"]');
    resetButton.addEventListener('click', function (event) {
        event.preventDefault(); 
        var inputFields = document.querySelectorAll('input[type="text"]');
        for (var i = 0; i < inputFields.length; i++) {
            inputFields[i].value = '';
        }
    });
</script>
</center>
</body>
 </html>