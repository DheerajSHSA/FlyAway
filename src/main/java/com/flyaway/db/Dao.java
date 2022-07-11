package com.flyaway.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	String regQuery = "insert into users (uname, fname, lname, pass, isAdmin) values(?,?,?,?,0)";
	String isUQuery = "select * from users where uname=? and pass=?";
	String isAQuery = "select * from users where uname=? and pass=? and isAdmin=?";
	String adFQuery = "insert into flights (fname ,fr ,t ,date) values(?,?,?,?)";
	String upPQuery = "update users set pass=? where uname=? and pass=?";
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/flyaway";
	String user = "dheer";
	String password = "12345678";

	public boolean register(String uname, String fname, String lname, String pass) {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);
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

	public boolean isUser(String uname, String pass) {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = con.prepareStatement(isUQuery);
			ps.setString(1, uname);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}

	public boolean isAdmin(String uname, String pass) {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = con.prepareStatement(isAQuery);
			ps.setString(1, uname);
			ps.setString(2, pass);
			ps.setString(3, "1");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public String getDriver() {
		return driver;
	}

	public boolean addFlight(String fname, String fr, String t, String date) {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = con.prepareStatement(adFQuery);
			ps.setString(1, fname);
			ps.setString(2, fr);
			ps.setString(3, t);
			ps.setString(4, date);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public boolean updatePassword(String uname, String opass, String npass) {
		try {
			Class.forName(driver);
			Connection con =  DriverManager.getConnection(url, user, password);
			PreparedStatement ps = con.prepareStatement(upPQuery);
			ps.setString(1, npass);
			ps.setString(2, uname);
			ps.setString(3, opass);
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
}
