<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<link rel="stylesheet" href="style.css">

<hr>
<center ><h1 >INVENTORY MANAGEMENT</h1></center>
      <hr>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body > 
<jsp:useBean id="beanDao" class="com.infinite.inventorymanagement.StockDAO"/>
<form method="get"  action="Addstock.jsp">
<center>
   <div  class="form-group">
   <label>Item Name:</label>
   <input class="form-control" type="text" name="itemName"  required/>
   </div>
   
    <div  class="form-group">
    <label> Price:</label>
    <input class="form-control" type="text" name="price" required>
    </div>
  <div  class="form-group">
 <label>Item Quantity:</label> 
    <input class="form-control" type="text" name="quantityAvail" required>
  </div><br>
   <div  class="form-group">
   <input class="btn btn-primary" type= "submit" value ="ADD">
    <a class="btn btn-primary" href="ShowStock.jsp">Show</a>
   </div>
    
   
    </center>
 </form>
    <c:if test="${param.quantityAvail !=null }">
   	<jsp:useBean id="beanStock" class="com.infinite.inventorymanagement.StockDetails" />
	<jsp:setProperty property="*" name="beanStock"/>
	<c:out value="${beanDao.addstockDetails(beanStock)}"/>
</c:if>
</body>
</html>