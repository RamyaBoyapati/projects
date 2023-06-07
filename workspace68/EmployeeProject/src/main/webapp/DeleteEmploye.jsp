<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DeleteEmploye.jsp" method="get">
Enter EmployID :
 <input type="number" name="empID">
 <input type="submit" value="Continue">
</form>
<c:if test="${param.empID!=null}">
<jsp:useBean id="employe" class="com.infinite.EmployeeProject.Employe" />
<jsp:useBean id="dao" class="com.infinite.EmployeeProject.EmpDAO" />
<jsp:setProperty property="*" name="employe"/>
<c:out value="${dao.DeleteEmploy(employe)}"/>
</c:if>
</body>
</html>