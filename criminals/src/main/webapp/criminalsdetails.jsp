<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>SHOWS THE CRIMINALS DETAILS</h1>
	<h2>${size}</h2>
    <h2>${msg}</h2>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>AGE</th>
				<th>COUNTRY</th>
				<th>CRIMINAL TYPE</th>
				<th>NOOFCASES</th>
				<th>ALIVE</th>
				<th>GENDER</th>
				<th>INTERNATIONAL</th>
				<th>MARRIED</th>
				<th>JAILTERM</th>
				<th>WIFENAME</th>
				<th>RightHandName</th>
				<th>LEFTHANDNAME</th>
				<th>PRISONNAME</th>
				<th>NETWORTH</th>
			</tr>
			<c:forEach items="${CriminalDetails}" var="dto">
			<tr>
			<th>${dto.id}</th>
			<th>${dto.name}</th>
			<th>${dto.age}</th>
			<th>${dto.country}</th>
			<th>${dto.criminalType}</th>
			<th>${dto.noOfCases}</th>
			<th>${dto.alive}</th>
			<th>${dto.gender}</th>
			<th>${dto.international}</th>
			<th>${dto.married}</th>
			<th>${dto.jailTerm}</th>
			<th>${dto.wifeName}</th>
			<th>${dto.rightHandName}</th>
			<th>${dto.leftHandName}</th>
			<th>${dto.prisonName}</th>
			<th>${dto.netWorth}</th>
			</tr>
			</c:forEach>

		</thead>

	</table>

</body>
</html>