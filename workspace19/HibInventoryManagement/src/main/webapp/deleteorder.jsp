<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="deleteorder.jsp" method="get">
    Enter Order Id:
    <input type="text" name="orderId"/>
    <input type="submit" value="continue"/>
</form>
<c:if test="${param.orderId!=null}">
<jsp:useBean id="dao" class="com.infinite.hib.OrderDAO"/>
<jsp:useBean id="order" class="com.infinite.hib.Order"/>
<jsp:setProperty property="*" name="order"/>
<c:out value="${dao.deleteOrder(order)}"/>
</c:if>

</body>
</html>