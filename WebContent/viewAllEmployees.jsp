<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List, com.zensar.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Employee> allEmployeesList = (List<Employee>) request.getAttribute("allEmployeesList");  %>

<table border="1">
	<th> Employee Id </th>
	<th> User Name </th>
	<th> Email </th>
	
	<% for(Employee employee: allEmployeesList){ %>
		<tr>
			<td> <%=employee.getEmployeeId() %> </td>
			<td> <%=employee.getUserName() %> </td>
			<td> <%=employee.getEmail() %> </td>
		</tr>
	<% } %>
	
</table>

</body>
</html>