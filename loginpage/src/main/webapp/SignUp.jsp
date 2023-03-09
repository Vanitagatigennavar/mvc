<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.foot {
	width: 100%;
	background-color: black;
	color: white;
	left: 0;
	bottom: 0;
	position: fixed;
	text-align: center;
	padding-bottom: 0.8%;
}
.container {
	width: 350px;
	height: 475px;
	margin: 20px 500px 70px 400px;
	background-color: white;
	border-radius: 22px;
	padding-top: 50px;
	opacity: 0.7px;
}
form {
	opacity: 1.5px;
	margin-left: 15px;
	width: 150px;
}
form label {
	display: flex;
	margin-top: 10px;
	font-size: 15px;
}
form input {
	width: 250px;
	padding: 2px;
	border-radius: 7px;
} 
body {
	background-image: url("https://png.pngtree.com/thumb_back/fh260/background/20190220/ourmid/pngtree-electronic-technology-blue-background-minimalism-psd-image_10081.jpg");
	background-repeat: no-repeat;
	background-size:150%;
}
</style>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@3.6.0/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@1.16.1/dist/js/bootstrap.bundle.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js"></script>	
</head>
<body>
	<nav class="navbar navbar-expand-md bg-dark navbar-dark ">
		<ul class="nav navbar-nav navbar-right">
			<li class="nav-item-active"><a href="signIn.jsp"
				class="nav-link" style="color: black; text-align: left;">SignIn</a></li>
			<li class="nav-item-active"><a href="index.jsp" class="nav-link"
				style="color: black; text-align: right;">Home</a></li>
		</ul>

	</nav>
${mesg}  
	<div style="padding-left: 20%">
		<h5 style="text-align: center;">TRAVEL REGISTRATION......</h5>
		
		<form action="user" method="post" >
			<label for="name">USERNAME</label> <input type="text"
				placeholder="Enter your Name" name="userName" required><br>
			<label for="email">EMAIL</label> <input type="email"
				placeholder="Enter your email" name="userEmail" required><br>
			<label for="number">MOBILENUMBER</label> <input type="text"
				placeholder="Enter your MobileNumber" name="contactInfo" required><br>
			<div class="checkbox">
				<label> <input type="checkbox"
					style="width: 20px; height: 25px;"> I agree to the terms
				</label>
			</div>
			<input type="submit" id="sub1" value="SIGNUP">
		</form>

	</div>



	<div class="foot">
		<footer class="page-footer font-small blue">
			<!-- Copyright -->
			<div class="footer-copyright text-center py-3">
				© 2022 Vanita: <a href="index.jsp">Home</a>
			</div>
			<!-- Copyright -->
		</footer>
	</div>
</body>
</html>