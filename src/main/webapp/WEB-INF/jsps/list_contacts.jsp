<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@include file="menu.jsp"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contacts</title>
</head>
<body>

<h2>Leads | All Leads</h2>
     <hr>   
    <table border='1'>
      <thead>
      <tr>
        <th>Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Mobile</th>
        <th>Lead Source</th>
        <th>Billing</th>
        
      </tr>
      </thead>
    <c:forEach var="contact" items="${contacts}">
      <tbody>
      <tr>
		        <td>${contact.id}</td>
		        <td><a href="getContact?id=${contact.id}">${contact.firstName}</a></td>
		        <td>${contact.lastName}</td>
		        <td>${contact.email}</td>
		        <td>${contact.mobile}</td>
		        <td>${contact.leadSource}</td>
		        <td><a href="generateBill?id=${contact.id}">Create New Bill</a></td>
		        
      </tr>
     </tbody>
   </c:forEach>
   </table>

</body>
</html>