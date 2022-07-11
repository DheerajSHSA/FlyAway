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
		PrintWriter out = response.getWriter();
		
		Dao dao = new Dao();
		
		if(dao.register(uname, fname, lname, pass)==true)
		{
			out.println("Account Creation Successful");
		}
	}
}
