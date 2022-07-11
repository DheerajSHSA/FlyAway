package com.flyaway.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Dao {
	String regQuery = "insert into users (uname, fname, lname, pass, isAdmin) values(?,?,?,?,0)";
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/flyaway";
	String user = "dheer";
	String pass = "12345678";

	public boolean register(String uname, String fname, String lname, String pass) {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = con.prepareStatement(regQuery);
			ps.setString(1, uname);
			ps.setString(2, fname);
			ps.setString(3, lname);
			ps.setString(4, pass);
			ps.executeUpdate();
			con.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}
}
