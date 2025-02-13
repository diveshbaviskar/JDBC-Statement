package com.jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Students {
	
	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");
		Statement s = c.createStatement();
		s.executeUpdate("insert into student values(2,'vishal','chakan'),(6,'Charvi','Akurdi'),(7,'Shubham','Kolhapur')");
		
		System.out.println("Data Inserted Successfully");

		c.close();
		
	}
	
	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");
		Statement s = c.createStatement();
		s.executeUpdate("Update student set name='Ram' where id = 2");
		
		System.out.println("Data updated Successfully");

		c.close();

	}

	public void deleteData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "divesh");

		Statement s = c.createStatement();

		s.executeUpdate("Delete from student  where id = 2");
	}
	
	public void getAllData() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","divesh");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from student");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}

    }
//
	public static void main(String[] args) throws Exception {

		Students s = new Students();

//		s.updateData();

//		s.deleteData();
		
//		s.getAllData();
		s.insertData();
		

	}

}
