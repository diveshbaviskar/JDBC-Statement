package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AnimalDao {

	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");
		Statement s = c.createStatement();
		s.executeUpdate("insert into Animal values(1,'Doggie'),(2,'cat'),(3,'Hippo')");

		System.out.println("inserted....");

	} 

	public void deleteData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");
		Statement s = c.createStatement();
		s.executeUpdate("delete from animal where id = 1");

		System.out.println("Deleted....");

	}

	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");
		Statement s = c.createStatement();
		s.executeUpdate("update animal set id = 100 where name= 'doggie'");

		System.out.println("Updated...");

	}

	public void getAllData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from Animal");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}

	}
}
