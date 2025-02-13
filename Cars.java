package com.jdbcexam;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Cars {

	public static void main(String[] args) throws Exception{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cars","root","divesh");
	
	Statement s = c.createStatement();
	
	s.executeUpdate("insert into Car_info values(1,'BMW',1001,'200km'),(2,'Mercides',1909,'350km'),(3,'Audi',1111,'320km'),(4,'LEXUS',4444,'280km'),(5,'Jaguar',9876,'390km')");
	
	System.out.println("inserted Succesfully");
	
	c.close();
	
// (2,'Mercides',1909,'350'),(3,'Audi',1111,'320km'),(4,'LEXUS',4444,'280km'),(5,'Jaguar',9876,'390km')
	
	}

}
