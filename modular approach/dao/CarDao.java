package com.dao;

import java.security.DomainCombiner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class CarDao {
	
	public void insertData() throws Exception{
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","divesh");
		
		PreparedStatement ps = c.prepareStatement("insert into Car (id ,name) values (?,?) ");
		
		Scanner sc = new Scanner(System.in);
		
		ps.setInt(1,sc.nextInt());
		ps.setString(2,sc.next());
		
		ps.executeUpdate();
		
		System.out.println("inserted Succesfully");
		c.close();
	
	}

}
