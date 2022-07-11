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
@WebServlet("/Update")
public class Update extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String opass = request.getParameter("opwd");
		String npass = request.getParameter("npwd");
		PrintWriter out = response.getWriter();
		Dao dao = new Dao();
		if (dao.updatePassword(uname, opass, npass) == true) {
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
			out.println("<strong>Success!</strong> Password Updated");
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
			out.println("<strong>Failed!</strong> Please check Entered Details, Password wasn't updated");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
