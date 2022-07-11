package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flyaway.db.Dao;

@SuppressWarnings("serial")
@WebServlet("/Register")
public class Register extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String pass = request.getParameter("pwd");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Dao dao = new Dao();

		if (dao.register(uname, fname, lname, pass) == true) {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Registration Successful</title>");
			out.println("<link\r\n"
					+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\"\r\n"
					+ "	rel=\"stylesheet\"\r\n"
					+ "	integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\"\r\n"
					+ "	crossorigin=\"anonymous\">");
			out.println("</head>");
			out.println("<body>");
			out.print("<div class=\"alert alert-success\">");
			out.println("<strong>Success!</strong> Your Account was Created");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
		}
	}
}
