<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>INFORMATION STORED</h1>

	<form action="info.do">
	
	

		PERSON NAME : 
		<input type="text" name="personName">
		
		 <br>
		<br> EMAIL ADRESS :
		 <input type="text" name="eadress"> <br>
		<br> CITY NAME :
		<select name="city name">
		<option>-*SELECT*</option>
		
		<option ${list}>LIST OF STATES</option>
		
		</select> 
		
		<br> <input type="submit" value="SAVE" />
		
	</form>

</body>
</html>