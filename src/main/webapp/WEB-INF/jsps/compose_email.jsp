<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose</title>
</head>
<body>
<h2>Send Email</h2>
<form action="sendEmail" method="post">
      <pre>
      To:<input type="email" name="email" value="${email}" required>
 Subject:<input type="text" name="sub"/>
         <textarea  name="message" rows="20" cols="50">
         </textarea>
         <input type="submit" value="send"/>
      
      
      
      
      </pre>
</form>
</body>
</html>