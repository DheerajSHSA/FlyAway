<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Flights</title>
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
	<h4 class="text-center">Flights</h4>
	<!-- Cover Started -->
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
		<%
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway", "dheer", "12345678");
			String sql = "select * from flights";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			if (rs.next() == false) {
				out.println("No Records Found");
			} else {
		%>
		<div class="container-fluid text-center">
			<table
				style="border: 1px solid black; text-align: center; align-self: center;"
				class="table">
				<tr style="border: 1px solid black;">
					<th style="border: 1px solid black;">Flight Name</th>
					<th style="border: 1px solid black;">From</th>
					<th style="border: 1px solid black;">To</th>
					<th style="border: 1px solid black;">Date</th>
				</tr>
				<%
				do {
				%>
				<tr style="border: 1px solid black;">
					<td style="border: 1px solid black;"><%=rs.getString(2)%></td>
					<td style="border: 1px solid black;"><%=rs.getString(3)%></td>
					<td style="border: 1px solid black;"><%=rs.getString(4)%></td>
					<td style="border: 1px solid black;"><%=rs.getString(5)%></td>
				</tr>
				<%
				} while (rs.next());
				%>


			</table>
		</div>
		<%
		}
		} catch (Exception e) {
		e.getStackTrace();
		}
		%>
	</div>
	<!-- Cover Ended -->
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