<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Flight</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
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
				<li class="nav-item"><a href="admin.jsp"
					class="nav-link active" aria-current="page">Home</a></li>
				<li class="nav-item"><a href="addflights.jsp" class="nav-link">Add
						a Flight</a></li>
				<li class="nav-item"><a href="allflights.jsp" class="nav-link">All
						Flights</a></li>
				<li class="nav-item"><a href="update.jsp" class="nav-link">Update
						your Password</a></li>
				<li class="nav-item"><a href="homepage.jsp" class="nav-link">Logout</a></li>
			</ul>
		</header>
	</div>
	<!-- Header Ended -->
	<!-- Flights Detail Form Started -->
	<div class="container">
		<form action="Add" method="post" class="was-validated">
			<div class="form-group">
				<label for="fname">Flight Name:</label> <input type="text"
					class="form-control" name="fname" placeholder="Enter flight name"
					name="uname" required>

				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			<div class="form-group">
				<label for="fr">From:</label> <input type="text"
					class="form-control" name="fr" placeholder="Enter origin" name="fr"
					required>

				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			<div class="form-group">
				<label for="t">To:</label> <input type="text" class="form-control"
					name="t" placeholder="Enter destination" name="t" required>

				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			<div class="form-group">
				<label for="date">Date:</label> <input type="date"
					class="form-control" name="date" required>

				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
			<button type="submit" class="btn btn-primary">Add the Flight</button>
		</form>
	</div>
	<!-- Flights Detail Form Ended -->
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