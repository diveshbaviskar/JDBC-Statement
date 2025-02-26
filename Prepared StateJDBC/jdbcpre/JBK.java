package com.jdbcpre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JBK {

	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");

		PreparedStatement ps = c.prepareStatement("insert into jbk (id,name,fees) values(?,?,?)");

		ps.setInt(1, 5);
		ps.setString(2, "Aviansh");
		ps.setString(3, "FREE MEMBER");
		ps.executeUpdate();
		System.out.println("Inserted ....");

	}

	public void deleteData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");

		PreparedStatement ps = c.prepareStatement("delete from Employe where id = ?");
		ps.setInt(1, 3);
		ps.executeUpdate();

		System.out.println("Deleted..");

		c.close();

	}

	public void update() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");

		PreparedStatement ps = c.prepareStatement("update jbk set name=?,fees=? where id = ?");
		ps.setInt(3, 1);
		ps.setString(1, "Rohan");
		ps.setString(2, "30k");
		ps.executeUpdate();
		System.out.println("Updated...");
		c.close();

	}

	public void getAllRecords() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");
		PreparedStatement ps = c.prepareStatement("select * from jbk");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "|" + rs.getString(2) + "|" + rs.getString(3));
		}

	}

}
