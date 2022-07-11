<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flyaway</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<script src="<c:url value="/resources/js/myscripts.js" />"></script>
</head>
<body>
	<!-- Header Started -->
	<div class="container">
		<header
			class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
			<a href="homepage.jsp"
				class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
				<svg class="bi me-2" width="40" height="32">
					<use xlink:href="#bootstrap" /></svg><span class="fs-4">Flyaway</span>
			</a>

			<ul class="nav nav-pills">
				<li class="nav-item"><a href="homepage.jsp"
					class="nav-link active" aria-current="page">Home</a></li>
				<li class="nav-item"><a href="login.jsp" class="nav-link">Login</a></li>
				<li class="nav-item"><a href="signup.jsp" class="nav-link">Sign
						up</a></li>
				<li class="nav-item"><a href="book.jsp" class="nav-link">Book
						a Flight</a></li>
			</ul>
		</header>
	</div>
	<!-- Header Ended -->
	<!-- Login Form Started -->
	<div class="container">
		<form action="Login" method="post" class="was-validated">
			<div class="form-group">
				<label for="uname">Username:</label> <input type="text"
					class="form-control" name="uname" placeholder="Enter username"
					name="uname" required>

				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			<div class="form-group">
				<label>Password:</label> <input type="password" class="form-control"
					name="pwd" id="myInput" placeholder="Enter password" required>
				<input type="checkbox" onclick="myFunction()"> Show Password
				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			<button type="submit" class="btn btn-primary">Sign in</button>
		</form>
	</div>
	<!-- Login Form Ended -->
	<!-- Footer Started -->
	<div class="container">
		<footer
			class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
			<div class="col-md-4 d-flex align-items-center">
				<a href="/"
					class="mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1">
					<svg class="bi" width="30" height="24">
						<use xlink:href="#bootstrap" /></svg>
				</a> <span class="mb-3 mb-md-0 text-muted">&copy; Developed By <a
					href="https://www.linkedin.com/in/dheeraj-kashyap-0006ab196/"
					target="_blank">Dheeraj Kashyap</a></span>
			</div>
		</footer>
	</div>
	<!-- Footer Ended -->
</body>
</html>