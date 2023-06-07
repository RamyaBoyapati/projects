<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Order</title>
</head>
<body>
<form method="get" action="addOrder.jsp">
 
  Customer Id :
           <input type="number" name="customerid"/> <br/><br/> 
  StocKId :
           <input type="text" name="stockID"/> <br/><br/> 
  Vendor Id :
           <input type="text" name="vendorid"/> <br/><br/> 
  OrderStatus :
  <select name="orderStatus">
                        <option value="ACCEPTED">ACCEPTED</option>
                        <option value="REJECTED">REJECTED</option>
                        <option value="DELAYED">DELAYED</option>
                        <option value="CANCELLED">CANCELLED</option>
                        <option value="OUT_OF_DELIVERY">OUT_OF_DELIVERY</option>
              </select> <br/><br/>
  QtyOrd :
         <input type="number" name="qtyOrd"/> <br/><br/> 
  OrderedDate :
          <input type="Date" name="orderedDate"/> <br/><br/> 
  Price :
          <input type="number" name="price"/> <br/><br/>
  shippingAddress1 :
          <input type="text" name="shippingAddress1"/> <br/><br/>
  shippingAddress2 :
          <input type="text" name="shippingAddress2"/> <br/><br/>
  city   :
          <input type="text" name="city"/> <br/><br/>
  zipcode :
          <input type="text" name="zipcode"/> <br/><br/>
  shipping :
          <input type="Date" name="shippingDate"/> <br/><br/>
   delivery :
          <input type="Date" name="deliveryDate"/> <br/><br/>
   expected_delivery :
          <input type="Date" name="expectedDeliveryDate"/> <br/><br/>
   Gbill :
         <input type="number" name="gbill"/> <br/><br/>
         <input type="submit" value="Add Order"/>           
 </form>
	<c:if test="${param.customerid!=null}">
     <jsp:useBean id="beanDao" class="com.infinite.hib.InventoryDAO"/>
     	<jsp:useBean id="beanOrder" class="com.infinite.hib.Order"/>
     	<c:set var="od" value="${beanDao.convertDate(param.orderedDate)}"/>
         <c:set var="sd" value="${beanDao.convertDate(param.shippingDate)}"/>
         <c:set var="dd" value="${beanDao.convertDate(param.deliveryDate)}"/>
         <c:set var="ed" value="${beanDao.convertDate(param.expectedDeliveryDate)}"/>
     	<jsp:setProperty property="orderId" name="beanOrder" value="${param.orderId}"/>
     	<jsp:setProperty property="customerid" name="beanOrder" value="${param.customerid}"/>
     	<jsp:setProperty property="stockID" name="beanOrder" value="${param.stockID}"/>
        <jsp:setProperty property="vendorid" name="beanOrder" value="${param.vendorid}"/>
        <jsp:setProperty property="orderStatus" name="beanOrder" value="${param.orderStatus}"/>
        <jsp:setProperty property="qtyOrd" name="beanOrder" value="${param.qtyOrd}"/>
     	<jsp:setProperty property="orderedDate" name="beanOrder" value="${od}"/>
     	<jsp:setProperty property="city" name="beanOrder" value="${param.city}"/>
     	<jsp:setProperty property="zipcode" name="beanOrder" value="${param.zipcode}"/>
     	<jsp:setProperty property="shippingDate" name="beanOrder" value="${sd}"/>
     	<jsp:setProperty property="deliveryDate" name="beanOrder" value="${dd}"/>
     	<jsp:setProperty property="expectedDeliveryDate" name="beanOrder" value="${ed}"/>
     	<jsp:setProperty property="gbill" name="beanOrder" value="${param.gbill}"/>
     	
     	<c:out value="${beanDao.addOrder(beanOrder)}"/>
     </c:if>

</body>
</html>