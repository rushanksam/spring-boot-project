<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@include file="menu.jsp"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>

<a href="viewleadspage">create a new lead</a>
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
        
      </tr>
      </thead>
    <c:forEach var="lead" items="${leads}">
      <tbody>
      <tr>
		        <td>${lead.id}</td>
		        <td><a href="getLead?id=${lead.id}">${lead.firstName}</a></td>
		        <td>${lead.lastName}</td>
		        <td>${lead.email}</td>
		        <td>${lead.mobile}</td>
		        <td>${lead.leadSource}</td>
      </tr>
     </tbody>
   </c:forEach>
   </table>

</body>
</html>