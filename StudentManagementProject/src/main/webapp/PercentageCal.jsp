<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.infinite.StudentManagementProject.Result"%>
<%@ page import="com.infinite.StudentManagementProject.ResultDAO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Percentage Calculation</title>
<style>
.bgimage{
   
		background-image: url("img/ab49.jpg");
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
</head>
<body class="bgimage">
 <center>
        <h1>Percentage Calculation</h1>
    </center>
    <%
    	Result result = new Result();
        String studentIDParam = request.getParameter("studentID");
        String department = request.getParameter("department");
        String m1=request.getParameter("Mathematics1");
        String m2=request.getParameter("Mathematics2");
        //out.println("m1  : "+m1);
       // out.println("m2  : "+m2);
       // result.setMathematics1(Integer.parseInt(m1));
        //result.setMathematics2(Integer.parseInt(m2));
        if (studentIDParam != null && department != null) {
            int studentID = Integer.parseInt(studentIDParam);
           
            result.setStudentID(studentID);
            result.setDepartment(department);

            List<String> subjects = new ArrayList<>();
            if (department.equals("Maths")) {
            	///out.print("Maths");
                subjects.add("Sanskrit");
                subjects.add("English");
                subjects.add("Mathematics1");
                subjects.add("Mathematics2");
                subjects.add("Physics");
                subjects.add("Chemistry");
            
            } else if (department.equals("Science")) {
            	//out.print("Science");
                subjects.add("Sanskrit");
                subjects.add("English");
                subjects.add("Biology");
                subjects.add("Zoology");
                subjects.add("Physics");
                subjects.add("Chemistry");
            } else {
                // Handle other departments or error case
                out.println("<p>Invalid department</p>");
            }

            int totalMarks = 0;
            for (String subject : subjects) {
            	//out.println("subject : "+subject);
                String subjectMarksParam = request.getParameter(subject);
                if (subjectMarksParam != null && !subjectMarksParam.isEmpty()) {
                    int subjectMarks = Integer.parseInt(subjectMarksParam);
                    totalMarks += subjectMarks;
                    result.getClass().getMethod("set" + subject, int.class).invoke(result, subjectMarks);
                } else {
                    out.println("<p>Invalid marks for " + subject + "</p>");
					%>
                    <jsp:forward page="ErrorSubMarks.jsp"></jsp:forward>
                    <%
                    break;
                    
                }
            }

            result.setTotalMarks(totalMarks);
            double percentage = (totalMarks / (subjects.size() * 100.0)) * 100;
            result.setPercentage((float)percentage);

            ResultDAO resultDAO = new ResultDAO();
            resultDAO.saveResult(result);

    %>
    <center>
        <h2>Result Summary</h2>
        <table border="1">
            <tr>
                <th>Subject</th>
                <th>Marks</th>
            </tr>
            <% for (String subject : subjects) { %>
            <tr>
                <td><%= subject %></td>
                <td><%= result.getClass().getMethod("get" + subject).invoke(result) %></td>
            </tr>
            <% } %>
            <tr>
                <th>Total Marks</th>
                <td><%= result.getTotalMarks() %></td>
            </tr>
            <tr>
                <th>Percentage</th>
                <td><%= result.getPercentage() %></td>
            </tr>
        </table>
    </center>
    <div class="center">
        <button onclick="goToResult()">Back</button>
    </div>
    
    <script>
        function goToResult() {
            window.location.href = "Result.jsp";
        }
    </script>
    <%
        }
    %>
</body>
</html>