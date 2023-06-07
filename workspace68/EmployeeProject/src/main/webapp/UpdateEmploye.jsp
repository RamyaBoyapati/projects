<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateEmploye.jsp" method="get">
Id: <input type="number" name="empID" /><br /> <br /> 
		Name:<input name="name" type="text" /><br /> <br />
		Designation: <input type="text" name="designation" /><br /> <br />
		Salary: <input type="number" name="salary" /><br /> <br />
		Age: <input type="number" name="age" /><br /> <br />
		Experience: <input type="number" name="experience" /><br /> <br />
		DateOfJoining: <input type="date" name="dateofjoining" /><br /> <br />
		<input type="submit" value="Updated Employee" />
</form>
<c:if test="${param.empID!=null}">
<jsp:useBean id="dao" class="com.infinite.EmployeeProject.EmpDAO"></jsp:useBean>
<fmt:parseDate value="${param.dateofjoining}" pattern="yyyy-MM-dd"
			var="joinDate" />
					<c:set var="sqlDate" value="${dao.convertDate(joinDate)}"></c:set>
			
<jsp:useBean id="emp" class="com.infinite.EmployeeProject.Employe"></jsp:useBean>
<jsp:setProperty property="empID" name="emp" />
		<jsp:setProperty property="name" name="emp" />
		<jsp:setProperty property="designation" name="emp" />
		<jsp:setProperty property="salary" name="emp" />
		<jsp:setProperty property="age" name="emp" />
		<jsp:setProperty property="experience" name="emp" />
		<jsp:setProperty property="dateOfJoining" name="emp" value="${sqlDate}" />
		<c:out value="${dao.UpdateEmploy(emp)}"></c:out>
</c:if>

</body>
</html>