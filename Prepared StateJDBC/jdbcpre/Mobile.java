package com.jdbcpre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Mobile {
	
	public void insertData() throws Exception {

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");
	PreparedStatement ps = c.prepareStatement("insert into Mobile(name,size,cost) values(?,?,?)");

	ps.setString(1,"1+");
	ps.setString(2,"22cm");
	ps.setString(3,"35k");
	ps.executeUpdate();
	System.out.println("Inserted ....");
	}


	public void deleteData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");

		PreparedStatement ps = c.prepareStatement("delete from Mobile where name = ?");
		ps.setString(1, "iphone");
		ps.executeUpdate();

		System.out.println("Deleted...");

		c.close();

	}

	


	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");
		PreparedStatement ps = c.prepareStatement("update jbk set name=? where size = ?");
		ps.setString(2, "17cm");
		ps.setString(1, "RealME");
//		ps.setString(2, "55k");
		ps.executeUpdate();
		System.out.println("Updated...");
		c.close();

	}

	public void getAllRecords() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");
		PreparedStatement ps = c.prepareStatement("select * from Mobile");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getString(1) + "|" + rs.getString(2) + "|" + rs.getString(3));
		}

	}

}
