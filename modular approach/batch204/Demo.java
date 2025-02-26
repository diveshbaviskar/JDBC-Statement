package com.batch204;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","divesh");
//		Statement s = c.createStatement();
//		s.executeUpdate("insert into Student1 values (6,'Divya','ENG')");
//		System.out.println("inserted");
//		c.close();
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","divesh");
		PreparedStatement ps = c.prepareStatement("Insert into Student1 values(?,?,?)");
		ps.setInt(1, 7);
		ps.setString(2,"Fatima");
		ps.setString(3,"B.Tech");
		ps.executeUpdate();
		System.out.println("inserted");
		c.close();
		
	}

}
