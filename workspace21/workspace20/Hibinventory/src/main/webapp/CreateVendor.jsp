<%@page import="com.infinite.hib.VendorDAO"%>
<%@page import="com.infinite.hib.Vendor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="CreateEmploy.jsp">
<center>
Vendor Name :
<input type="text" name="vendorname" /><br/><br/>
Vendor PhoneNo :
<input type="text" name="vendorPhoneNo" /><br/><br/>
Address1 :
<input type="text" name="address1" /><br/><br/>
Address2 :
<input type="text" name="address2" /><br/><br/>
City :
<input type="text" name="city" /><br/><br/>
Zipcode :
<input type="text" name="zipCode" /><br/><br/>
username :
<input type="text" name="username" /><br/><br/>
password :
<input type="text" name="password" /><br/><br/>

<input type="submit" value="Insert" />
</center>
</form>
<%
if(request.getParameter("vendorname")!=null){
Vendor vendor = new Vendor();
vendor.setVendorname(request.getParameter("vendorname"));
vendor.setVendorPhoneNo(request.getParameter("vendorPhoneNo"));
vendor.setAddress1(request.getParameter("address1"));
vendor.setAddress2(request.getParameter("address2"));
vendor.setCity(request.getParameter("city"));
vendor.setZipCode(request.getParameter("zipcode"));
vendor.setUsername(request.getParameter("username"));
vendor.setPassword(request.getParameter("password"));
VendorDAO dao = new VendorDAO();
dao.addVendor(vendor);
%>
<jsp:forward page="VendorTable.jsp"/>
<%
}
%>
</body>