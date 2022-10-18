<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>CREATING THE SHIRT PROJECT</h1>
	<form action="shirt" method="post">
		SHIRTBRAND : <br>
		<input type="text" name="brand"><br> SIZE :<br>
		<select name="size">
			<option>----</option>
			<option value="xl">XL</option>
			<option value="xxl">XXL</option>
			<option value="s">S</option>
		</select><br> PRICE :<br>
		<input type="text" name="price"><br> DISCOUNT :<br>
		<select name="discount">
			<option>----</option>
			<option value="1-10">1-10</option>
			<option value="10-20">10-20</option>
			<option value="20-30">20-30</option>
		</select><br> QUANTITY :<br>
		<select name="quantity">
			<option>----</option>
			<option value="10-100">10-100</option>
			<option value="100-200">100-200</option>
			<option value="200-300">200-300</option>
			<option value="300-400">300-400</option>
			<option value="400-500">400-500</option>
			<option value="500-600">500-600</option>
			<option value="500-600">600-700</option>
			<option value="500-600">700-800</option>
			<option value="500-600">800-900</option>
			<option value="500-600">900-1000</option>
		</select><br> GENDER :<br>
		<select name="gender">
			<option>----</option>

			<option value="MALE">MALE</option>
			<option value="FEMALE">FEMALE</option>
			<option value="TRANSGENDER">TRANSGENDER</option>
		</select><br> COLOR :<br>
		<select name="color">
			<option>--SELECT--</option>
			<option value="PINK">PINK</option>
			<option value="BLACK">BLACK</option>
			<option value="YELLOW">YELLOW</option>
			<option value="BLUE">BLUE</option>
			<option value="RED">RED</option>
		</select> <br> <input type="submit" value="save">
	</form>
</body>
</html>


