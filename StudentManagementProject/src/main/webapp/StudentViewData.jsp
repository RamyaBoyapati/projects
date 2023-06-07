<%@page import="com.infinite.StudentManagementProject.ResultDAO"%>
<%@page import="java.util.Comparator"%>
<%@ page import="java.util.List" %>
<%@ page import="com.infinite.StudentManagementProject.Student" %>
<%@ page import="com.infinite.StudentManagementProject.StudentDAO" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
<link rel="stylesheet" href="style.css">
<script src="http://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
<script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js" ></script>
<style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }
        .bgimage{
   
		background-image: url("img/ab43.jpg");
		background-repeat: no-repeat;
		background-size:cover;
    }
    .center {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 25vh;
        }
        
    </style>
<script>
   $(document).ready(function() {
      $('#student-table').DataTable({paging: false, info: false});
   });
   function goToSearch() {
       window.location.href = "Search.jsp";
   }
</script>
</head>
<body class="bgimage">
<%
    // Retrieve the search criteria from the request parameters
    int studentIDParam = 0;
    String studentIdStr = request.getParameter("studentId");
    if (studentIdStr != null && !studentIdStr.isEmpty()) {
        try {
            studentIDParam = Integer.parseInt(studentIdStr);
        } catch (NumberFormatException e) {
            e.printStackTrace(); // Print the exception for debugging purposes
          
        }
    }

    String firstNameParam = request.getParameter("firstName");

    // Check if search criteria provided
    boolean isSearchCriteriaProvided = studentIDParam != 0 || firstNameParam != null;

    // Perform the search and retrieve the student details
    StudentDAO studentDAO = new StudentDAO();
    List<Student> students = null;

    // Perform the search based on the provided criteria
    if (studentIDParam != 0 && firstNameParam != null && !firstNameParam.isEmpty()) {
        // Scenario 1: Exact match based on both Student ID and First Name
        students = studentDAO.searchStudentsByBoth(studentIDParam, firstNameParam);
    } else if (studentIDParam != 0) {
        // Scenario 2: Exact match based on Student ID
        students = studentDAO.searchStudentsByStudentID(studentIDParam);
    } else if (firstNameParam != null && !firstNameParam.isEmpty()) {
        // Scenario 3: Matching results based on First Name
        students = studentDAO.searchStudentsByFirstName(firstNameParam);
    } else {
        // Scenario 4: No search criteria provided, display all student details
        students = studentDAO.getAllStudents();
    }
    String sortColumn = request.getParameter("sortColumn");
    String sortOrder = request.getParameter("sortOrder");
    if (sortColumn != null && sortOrder != null) {
        students = studentDAO.sortStudents(students, sortColumn, sortOrder);
    }
    
    // Pagination
    int currentPage = 1;
    int pageSize = 10;
    int totalStudents = students.size();
    int totalPages = (int) Math.ceil((double) totalStudents / pageSize);

    String pageParam = request.getParameter("page");
    if (pageParam != null) {
        currentPage = Integer.parseInt(pageParam);
    }

    int startIndex = (currentPage - 1) * pageSize;
    int endIndex = Math.min(startIndex + pageSize, totalStudents);

    List<Student> studentsPage = students.subList(startIndex, endIndex);

    // Display the student details in a data table
    if (studentsPage.isEmpty()) {
        out.println("<p>No records found.</p>");
    } else {
%>
<table id="student-table">
<thead>
  <tr>
            <th>Student ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Department</th>
            <th>Academic Year</th>
            <th>Percentage</th>
</tr>
</thead>
<tbody>
<%
    ResultDAO resultDAO = new ResultDAO();
    for (Student student : studentsPage){
    	float percentage = resultDAO.getPercentage(student.getStudentID());
%>
<tr>
    <td><%= student.getStudentID() %></td>
    <td><%= student.getFirstName() %></td>
    <td><%= student.getLastName() %></td>
    <td><%= student.getDepartment() %></td>
    <td><%= student.getAcademicYear() %></td>
    <td><%= percentage %></td>
</tr>
<%
    }
%>
</tbody>
</table>

<% if (totalPages > 1) { %>
<div style="margin-top: 10px;">
<% if (currentPage > 1) { %>
<a href="StudentViewData.jsp?page=<%=currentPage - 1 %>">Previous</a>
<% } %>

<% if (currentPage < totalPages) { %>
    <a href="StudentViewData.jsp?page=<%=currentPage + 1 %>">Next</a>
    <% } %>
</div>
<% } %>
<%
    }
%>
<div class="center">
        <button onclick="goToSearch()">Back</button>
    </div>
		<script>
            $(document).ready(function() {
                $('#student-table').DataTable({
                    paging : false,
                });
            });
            $('.dataTables_length').addClass('bs-select');
		</script>
</body>
</html>