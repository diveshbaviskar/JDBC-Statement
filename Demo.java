package com.jdbcexam;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class Demo {

	// Step 1 Add Jar
   
	public static void main(String[] args) throws Exception {
		
		//Step 2 register and load Driver Class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Step 3 Get Connection	
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","divesh");

		//Step 4 Statement & PreparedStatement 
		Statement s = c.createStatement();
		
		//Step 5  insert the values 
		s.executeUpdate("insert into Student values(1,'Divesh','Dhule'),(2,'Suraj','Mumbai'),(3,'Abhi','Phaltan'),(4,'Omkar','Satara'),(5,'Rutik','Dubai')");
		
		 // show some msg like this when the data is inserted otherswise it will 
		// give a error 
		
		System.out.println("inserted Succesfully");
		
		// step 6 close all the connections ex we close scanner sc.close();
		// we also close the Statements 
		
		c.close();

	}

}
