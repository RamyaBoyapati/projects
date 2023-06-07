<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="beanDao" class="com.infinite.EmployeeProject.EmpDAO"/>
	<form method="get" action="Search.jsp">
		<center>
			 Id : 
			<input type="number" name="empID" /> <br/><br/> 
			<input type="submit" value="Search" />
		</center>
	</form>
	<c:if test="${param.empID!=null}">
	<c:set var="empID" value="${param.empID}"/>
		<c:set var="employe" value="${beanDao.searchEmploye(empID)}"/>
		<c:if test="${employe!=null}">
	  name :  <b>
			<c:out value="${employe.name}"/></b> <br/>
	  designation :     <b>
		<c:out value="${employe.designation}"/></b> <br/>
      salary :    <b>
        <c:out value="${employe.salary}"/></b> <br/>
      age : <b>
        <c:out value="${employe.age}"/></b> <br/>
      experience : <b>
        <c:out value="${employe.experience}"/></b> <br/>
       dateOfJoining : <b>
        <c:out value="${employe.dateOfJoining}"/></b> <br/>
        
		</c:if>
		<c:if test="${employe==null}">
		<c:out value="no empoloye results found"/> <br/>
		</c:if>
	</c:if>


</body>
</html>