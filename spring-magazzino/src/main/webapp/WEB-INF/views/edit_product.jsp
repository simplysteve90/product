<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Edit Product</h2>
		<form:form action="save" method="post" modelAttribute="product">
			<table border="0" cellpadding="5">
				<tr>
					<td>ID: </td>
					<td>${product.id}
						<form:hidden path="id"/>
					</td>
				</tr>			
				<tr>
					<td>Name: </td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Quantity: </td>
					<td><form:input path="quantity" /></td>
				</tr>
				<tr>
					<td>Category: </td>
					<td><form:input path="category" /></td>
				</tr>		
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>						
			</table>
		</form:form>

</body>
</html>