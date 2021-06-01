<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result Page</title>
</head>
<body>
<h2>Employee Id: <%=request.getAttribute("employeeId") %></h2>  <br>
<h2>Name: <%=request.getAttribute("userName") %></h2>  <br>
<h2>Email: <%=request.getAttribute("email") %></h2>
</body>
</html>