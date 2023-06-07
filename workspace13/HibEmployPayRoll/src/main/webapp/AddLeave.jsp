<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddLeave.jsp" method="get">
Leave Id:
<input type="number" name="leaveId" /><br/><br/>
Employ Number:
<input type="number" name="empno" /><br/><br/>
Leave Start Date:
<input type="date" name="leaveStartDate" /><br/><br/>
Leave End Date:
<input type="date" name="leaveEndDate" /><br/><br/>
Reason:
<input type="text" name="leaveReason"/><br/><br/>
<input type="submit" value="Add" />

</form>
<c:if test="${param.leaveReason!=null}">
      <jsp:useBean id="beanDao" class="com.infinite.hib.LeaveDAO"/>
      <jsp:useBean id="beanLeave" class="com.infinite.hib.Leave"/>
      <c:set var="sdate" value="${beanDao.convertDate(param.leaveStartDate)}"/>
      <c:set var="edate" value="${beanDao.convertDate(param.leaveEndDate)}" />
      <jsp:setProperty property="empNo" name="beanLeave" value="${param.empNo}"/>
      <jsp:setProperty property="leaveStartDate" name="beanLeave" value="${sdate}"/>
      <jsp:setProperty property="leaveEndDate" name="beanLeave" value="${edate}"/>
      <jsp:setProperty property="leaveReason" name="beanLeave" value="${param.leaveReason}"/>
      <c:out value="${beanDao.addLeave(beanLeave)}"/>
     </c:if>
</body>
</html>