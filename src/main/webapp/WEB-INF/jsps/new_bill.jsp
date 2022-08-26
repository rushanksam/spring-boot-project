<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bill- new bill</title>
</head>
<body>
<h2>Bill | create new bill</h2>
<hr>
<form action="createBill" method="post">
    <pre>
            Email <input type="email" name="email" value="${contact.email}" required readonly>
       First Name <input type="text" name="firstName" value="${contact.firstName}"required readonly>
        Last Name <input type="text" name="lastName" value="${contact.lastName}"required readonly>
           mobile <input type="text" name="mobile" value="${contact.mobile}" required readonly>
     Product Name <input type="text" name="productName"/>
          Amount  <input type="text" name="amount"/>
                  <input type="submit" value="generate bill"/>
    
    
    
    
    </pre>
          
</form>
</body>
</html>