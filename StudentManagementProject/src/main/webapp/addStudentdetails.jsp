<%@ page import="com.infinite.StudentManagementProject.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<hr>
<center>
	<h1>Student Management Project</h1>
</center>
<hr>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student Details</title>


<style>
.div-one {
	display: flex;
	flex-direction: row;
	align-items: flex-start;
}

.div-one-one {
	margin-right: 20px;
}

.div-one-two {
	display: flex;
	justify-content: space-between;
	flex-wrap: wrap;
	flex-direction: column;
}

.div-one-two-one, .div-one-two-two, .div-one-two-three {
	display: flex;
	justify-content: space-between;
	margin-bottom: 5px;
}
.card{
text-align:center;
width:95%;
height:30ex;
background-color: grey;
}

.card1{
text-align:center;
width:95%;
height:20ex;
background-color: grey;
}

.card2{
text-align:center;
width:95%;
height:20ex;
background-color: grey;
}
.row{

}
.error{
color: red;
margin-top:-58ex;
}
</style>
</head>
<body>
<%
	StudentDAO dao=new StudentDAO();
    int nextStudentID =dao.getstudentid();
%> 

	<form>
	<div class="card">
	<center>
		<h2>Personal Details</h2>
	</center>
		<div class="row">
			<div class="col-sm-4">
    Student ID: <input type="text" name="studentID" value="<%= nextStudentID %>" required>
            </div>
			<div class="col-sm-4">
				<div>
					First Name: <input type="text" name="firstName" required pattern="[A-Za-z]{1,}" title="First Name Must be Capital and Small letters" ><br/><br/>
				</div>
				<div>
					Gender: <input type="radio" name="gender" value="MALE" required>
					Male <input type="radio" name="gender" value="FEMALE" required>
					Female
				</div><br/>
				<div>
					Mobile No: <input type="text" name="mobileNo" required pattern="[0-9]{10}"><br/><br/>
				</div>

				<div>
					Email ID: <input type="email" name="emailID" required><br/><br/>
				</div>
			</div>
			<div class="col-sm-4">
			<div>
				Last Name: <input type="text" name="lastName" required pattern="[A-Za-z]{1,}"><br/><br/>
			</div>
			<div>
                Blood Group:
                <select name="bloodGrp" required>
                <option value="">Select blood group</option>
                <option value="A+">A+</option>
                <option value="A-">A-</option>
                <option value="B+">B+</option>
                <option value="B-">B-</option>
                <option value="AB+">AB+</option>
                <option value="AB-">AB-</option>
                <option value="O+">O+</option>
                <option value="O-">O-</option>
                </select>
           </div><br>
			<div>
				Address: <textarea name="address"></textarea>

			</div>
			</div>
		</div>
		</div> <br/><br/>
		<div class="card1">
		<center><h3>Parent Details</h3></center>
		<div class="row">
		  <div class="col-sm-4">
		  <div>
			Father's Name: <input type="text" name="fatherName" required pattern="[A-Za-z]{1,}"><br/><br/>
		</div>
		<div>
			Mother's Name: <input type="text" name="motherName" required pattern="[A-Za-z]{1,}"><br/><br/>
		</div>
		
		  </div>
		  <div class="col-sm-4">
		   Mobile No: <input type="text" name="fatherMobileNo" required pattern="[0-9]{10}"><br/><br/>
		
		   Mobile No: <input type="text" name="motherMobileNo" required pattern="[0-9]{10}">
		  </div>
		</div>
		</div>
		<br> 
		
		<br>
		<div class="card2">
		<center><h4>Acadamic Details</h4></center>
		<div class="row">
		  <div class="col-sm-4">
		  	<div>
				Class: 
				<select name="studentClass" required>
				<option value="">--Select Classes--</option>
				<option value="First Year">First Year</option>
                <option value="Second Year">Second Year</option>
                
				</select>
		  	</div><br>
		  	<div>
                Department:
                <select name="department" required>
                <option value="">--Select Departments--</option>
                <option value="Maths">Maths</option>
                <option value="Science">Science</option>
                </select>
           </div><br>
		  </div>
		  <div class="col-sm-4">
		  	<div>
				AcadamicYear : 
				<select name="academicYear" required>
				<option value="">--Select Years--</option>
				<option value="22-23">2022-2023</option>
                <option value="23-24">2023-2024</option>
				
				</select>
		  	</div><br>
		  	<div>
				FeePaid : <input type="number" name="feePaid" required> <br> <br>
		  	</div>
		  	
		  	<!-- <div>
				percentageScored : <input type="number" name="percentageScored" required> <br> <br>
		  	</div> -->
		  </div>
		</div>
		</div>
		<br><br>
		<div style="display: flex; justify-content: center;">
			<input type="reset" value="Reset" style="margin-left: 10px;" class="btn btn-secondary">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="submit" value="Register" style="margin-right: 10px;" class="btn btn-primary" >
			<a href="admin-dashboard.jsp"><input type="button" value="Exit" class="btn btn-danger"
				onclick="window.location.href='exit.jsp'"
				style="margin-right: 10px;"></a>
		</div>
	</form>
	<c:if test="${param.studentID != null && param.department != null}">
		<jsp:useBean id="student"
			class="com.infinite.StudentManagementProject.Student"></jsp:useBean>
		<jsp:useBean id="studentDAO"
			class="com.infinite.StudentManagementProject.StudentDAO"></jsp:useBean>
		<jsp:setProperty name="student" property="studentID"
			value="${param.studentID}" />
		<jsp:setProperty name="student" property="department"
			value="${param.department}" />
		<jsp:setProperty name="student" property="firstName"
			value="${param.firstName}" />
		<jsp:setProperty name="student" property="lastName"
			value="${param.lastName}" />
		<jsp:setProperty name="student" property="gender"
			value="${param.gender}" />
		<jsp:setProperty name="student" property="mobileNo"
			value="${param.mobileNo}" />
		
		<jsp:setProperty name="student" property="bloodGrp"
			value="${param.bloodGrp}" />
		<jsp:setProperty name="student" property="emailID"
			value="${param.emailID}" />
		<jsp:setProperty name="student" property="fatherName"
			value="${param.fatherName}" />
		<jsp:setProperty name="student" property="fatherMobileNo"
			value="${param.fatherMobileNo}" />	
		<jsp:setProperty name="student" property="motherName"
			value="${param.motherName}" />
			<jsp:setProperty name="student" property="motherMobileNo"
			value="${param.motherMobileNo}" />
		<jsp:setProperty name="student" property="studentClass"
			value="${param.studentClass}" />
		
		<jsp:setProperty property="academicYear" name="student"
		    value="${param.academicYear}"/>
		<jsp:setProperty property="feePaid" name="student"
		    value="${param.feePaid}"/>
		
	<h3 class="error"><c:out value="${studentDAO.addStudent(student)}"/></h3>
	</c:if>
	<script>
  var resetButton = document.querySelector('input[type="reset"]');
  resetButton.addEventListener('click', function(event) {
    event.preventDefault(); // Prevent the default form reset behavior
    var inputFields = document.querySelectorAll('input[type="text"]');
    for (var i = 0; i < inputFields.length; i++) {
      inputFields[i].value = '';
    }
  });
</script>
</body>
</html>
