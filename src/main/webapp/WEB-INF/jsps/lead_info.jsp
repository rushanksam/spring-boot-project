<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
<h2>Lead Details</h2>

Lead Email: ${lead.email}<br>
Lead First Name: ${lead.firstName}<br>
Lead Last Name: ${lead.lastName}<br>
Lead Mobile: ${lead.mobile}<br>
Lead Lead Source: ${lead.leadSource}<br>

<form action="compose" method="post">
    <input type="hidden" name="email" value="${lead.email}"/>
    <input type="submit" value="send email"/>
</form>

<form action="saveContact" method="post">
    <input type="hidden" name="id" value="${lead.id}"/>
    <input type="submit" value="convert"/>
</form>









</body>
</html>