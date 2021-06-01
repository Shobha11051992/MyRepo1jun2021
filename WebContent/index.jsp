<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to My First Web Application</h2>
<form action="hello">
	Employee Id: <input type="text" name="employeeId"/>
	Name: <input type="text" name="userName"/>
	Email: <input type="text" name="email"/>
	<input type="hidden" name="methodToCall" value="addEmployee">
	<input type="submit">
</form>
<br><br>
<a href="viewAll?methodToCall=getAllEmployees">Click Here to View All records</a>
</body>
</html>