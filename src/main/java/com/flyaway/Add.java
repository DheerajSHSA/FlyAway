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
@WebServlet("/Add")
public class Add extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String fr = request.getParameter("fr");
		String t = request.getParameter("t");
		String date = request.getParameter("date");
		PrintWriter out = response.getWriter();
		Dao dao = new Dao();
		if (dao.addFlight(fname, fr, t, date)) {
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
			out.println("<strong>Success!</strong> Flight Added to the Database");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
		} else {
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
			out.print("<div class=\"alert alert-danger\">");
			out.println("<strong>Failed!</strong> Flight could'nt be added");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
