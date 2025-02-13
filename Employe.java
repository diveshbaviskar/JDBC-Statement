package com.jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employe {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company","root","divesh");
		
		Statement s = c.createStatement();
		
		s.executeUpdate("insert into Employe values(1,'Vishal','Software Eng '),(2,'Suraj','Jr. Eng'),(3,'Rahul','Jr.Mechanic'),(4,'Divesh','CEO'),(5,'Pushkar','Supervisor')");
		
		System.out.println("inserted Succesfully");
				
		c.close();
	}

}
