package com.jdbcpre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Employee {
	
	public void insertData() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "divesh");
		
		PreparedStatement ps = c.prepareStatement("insert into Employe (id,name,role) values(?,?,?)");
		
		ps.setInt(1,6);
		ps.setString(2,"Kavina");
		ps.setString(3,"Trainee");
//		ps.setInt(1,7);
//		ps.setString(2,"Vinayak");
//		ps.setString(3,"Interviewer");
//		ps.setInt(1,8);
//		ps.setString(2,"Vinit");
//		ps.setString(3,"Clerk");
//		ps.setInt(1,9);
//		ps.setString(2,"Vivek");
//		ps.setString(3,"Librarian");
//		ps.setInt(1,10);
//		ps.setString(2,"Nidhi");
//		ps.setString(3,"HR");
		ps.executeUpdate();


		System.out.println("Inserted ....");
		
	}
		
	public void deleteData() throws Exception{
		
		Class.forName("com.mysq.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","divesh");
		
		PreparedStatement ps = c.prepareStatement("delete from Employe where id = ?");
		ps.setInt(1, 6);
		ps.executeUpdate();
		
		System.out.println("Deleted..");
		
		c.close();
		
	}
	
	public void update() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","divesh");
		PreparedStatement ps = c.prepareStatement("update employe set name=?,role=? where id = ?");
		ps.setInt(3,1);
		ps.setString(1,"Harshu");
		ps.setString(2,"trainee");
		ps.executeUpdate();
		System.out.println("Updated...");
		c.close();
			
	}
	
	public void getAllRecords() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","divesh");
		PreparedStatement ps=c.prepareStatement("select * from employe");
		ResultSet rs=ps.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getInt(1)+ "|"+rs.getString(2)+"|"+rs.getString(3));
		}
	
	}
	
}
