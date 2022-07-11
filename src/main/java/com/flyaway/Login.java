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
@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pwd");
		PrintWriter out = response.getWriter();
		Dao dao = new Dao();
		if (dao.isUser(uname, pass)) {
			if (dao.isAdmin(uname, pass)) {
				out.print("Admin");
			} else {

				out.print("Customer");

			}
		} else {
			out.print("Username or Password Wrong");
		}
	}

}
