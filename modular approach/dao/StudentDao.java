package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public void insertData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","divesh");
		Statement s = c.createStatement();
		s.executeUpdate("insert into Student1 values (1,'Divesh','CS Eng')");
		s.executeUpdate("insert into Student1 values (2,'Avinash','IT Eng')");
		s.executeUpdate("insert into Student1 values (3,'Tanmay','Civil Eng')");
		s.executeUpdate("insert into Student1 values (4,'Om','Entc Eng')");
		s.executeUpdate("insert into Student1 values (5,'Suraj','Robotic Eng')");
//		
		System.out.println("INSERTED");
		
		c.close();
	}
		
		public void deleteData() throws Exception {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","divesh");
			Statement s = c.createStatement();
			s.executeUpdate("delete from Student1 where id = 5");
			
			System.out.println("Deleted");
			
			c.close();
		}
		
		public void updateData() throws Exception {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","divesh");
			Statement s = c.createStatement();
			s.executeUpdate("Update Student1 set name = 'Charvi' where id = 2");
			System.out.println("Updated");
			c.close();
			
}
		public void getAllData() throws Exception {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","divesh");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from Student1");
			while(rs.next()) {
				System.err.println(rs.getInt(1)  + " | " + rs.getString(2)+ " | "+rs.getString(3)	 );
				
			}
					
		}		
}
