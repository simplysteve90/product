<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Search Result</h2>
	<table border="1" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Quantity</th>
			<th>Category</th>
		</tr>
		<c:forEach items="${result}" var="customer">
		<tr>
			<td>${customer.id}</td>
			<td>${customer.name}</td>
			<td>${customer.quantity}</td>
			<td>${customer.category}</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>