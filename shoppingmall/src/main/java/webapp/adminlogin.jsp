<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>admin login page</title>
</head>
<body>


	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarTogglerDemo01"
			aria-controls="navbarTogglerDemo01" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarTogglerDemo01">
			<a class="navbar-brand" href="#"><img src="image/xworkzLogo.png"
				width="50" height="50" /></a>
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
			</ul>
			<form class="form-inline my-2 my-lg-0">
				
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">HOME</button>
			</form>
		</div>
	</nav>
	<h1>welcome to admin page</h1>
	<form action="login" method="post">
	<section class="vh-100 gradient-custom">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-12 col-md-8 col-lg-6 col-xl-5">
					<div class="card bg-dark text-white" style="border-radius: 1rem;">
						<div class="card-body p-5 text-left">

							<div class="mb-md-5 mt-md-4 pb-5">

								<h2 class="fw-bold mb-2 text-uppercase">Login</h2>
								<p class="text-white-50 mb-5">Please enter your login and
									password!</p>

							<div class="form-outline form-white mb-4">
								<label
										class="form-label" for="malladminname">Admin Name</label>
									<input type="text" id="typePasswordX"
										class="form-control form-control-lg" name="malladminname" placeholder="Enter Name" value="${entity.malladminname}" /> 
								</div>
                               
								<div class="form-outline form-white mb-4">
								<label
										class="form-label" for="adminpassword">Admin Password</label>
									<input type="password" id="typePasswordX"
										class="form-control form-control-lg" name="adminpassword" placeholder="Enter passcode" value="${entity.adminpassword}" /> 
								</div>
								
								<div class="form-outline form-white mb-4">
								<label class="form-label" for="typePasswordX">Mall List</label>
										<select name="adminmall">
										<option value="0" >--SELECT--</option>
										<option value="gopalan" >GOPALAN</option>
										<option value="garuda" >GARUDA</option>
										<option value="mantri square" >MANTRI SQUARE</option>
										<option value="meenakshi" >MEENAKSHI</option>
										<option value="ub city" >UB CITY</option>
										<option value="Vegacity" >VEGA CITY</option>
										</select>
									
								</div>

								<p class="small mb-5 pb-lg-2">
									<a class="text-white-50" href="forgotpassword.jsp">Forgot password?</a>
								</p>

								<button class="btn btn-outline-light btn-lg px-5" type="submit" name="login">Login</button>
							</div>

							<div>
								
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
		
	</section>
	</form>





	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>