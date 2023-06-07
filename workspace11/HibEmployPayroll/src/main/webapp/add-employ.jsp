<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get">
		Employ Name:
		<input type="text" name="ename"><br><br>

		Employ Gender:
		<select name="gender">
			<option disabled selected>Select your gender</option>
			<option value="MALE">Male</option>
			<option value="FEMALE">Female</option>
		</select><br><br>

		Employ Salary:
		<input type="text" name="salary"><br><br>

		<input type="submit" name="SUBMIT">
	</form>
	
	<c:if test="${param.ename!= null }">
		<jsp:useBean id="dao" class="com.infinite.hib.EmployDAO"/>
		<jsp:useBean id="employ" class="com.infinite.hib.Employ"/>
		<jsp:setProperty property="*" name="employ"/>
		<c:out value="${dao.addEmploy(employ) }"/>
	</c:if>

</body>
</html>