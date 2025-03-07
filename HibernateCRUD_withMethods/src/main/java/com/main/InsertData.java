package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class InsertData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(com.entity.Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		Employee e = new com.entity.Employee();
		e.setEmp_id(2);
		e.setFname("Divesh");
		e.setLname(" sir ");
		e.setDesignation("Software Engineer");
		e.setDepartment("Technical");
		e.setExperience("2 years");
		e.setSalary("25LPA");
		e.setNum("973496380");
		e.setShift("9am to 5pm");
		e.setGender("Male");
		e.setAddress("Dhule");
		e.setNationality("Indian");
		e.setAge("22");
		
		ss.persist(e);
		
		System.out.println("Data Inserted...");
		
		tr.commit();
		ss.close();
		

	}

}
