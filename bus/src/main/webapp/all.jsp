<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${man}</h1>
	<table border="8">
		<tr>
			<th>ID</th>
			<th>BUSNAME</th>
			<th>OWNERNAME</th>
			<th>DRIVERNAME</th>
			<th>CONDUCTORNAME</th>
			<th>NOOFSEATS</th>
		</tr>
		<c:forEach items="${om}" var="man">
			<tr>
				<th>${man.id }</th>
				<th>${man.busName }</th>
				<th>${man.ownerName }</th>
				<th>${man.driverName }</th>
				<th>${man.conductorName }</th>
				<th>${man.noOfSeats }</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>