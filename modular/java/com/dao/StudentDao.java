package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;

import com.entity.Student;

import jakarta.persistence.criteria.Root;


public class StudentDao {
	
	public void insertData() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Student s1 = new Student();
		
		s1.setName("sangram");
		s1.setAge("28");
		s1.setFevSub("Python");
		s1.setCourse("ML");
		s1.setStd("MBA");
		s1.setMbno("9876545678");
			
		ss.persist(s1);
		
		System.out.println("Inserted ...");
		
		tr.commit();
		
		ss.close();	
	}
	
	public void deleteData() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		int emp_id = 2;
		
		Student e1 = ss.get(Student.class,emp_id);
		
		//ss.delete(e1);
		
		ss.remove(e1);
		
		System.out.println("deleted........");
		
		
		tr.commit();
		
		ss.close();
		
		
		
	}
	 
	public void updateData() {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int emp_id = 2;
		Student e1 = ss.get(Student.class, emp_id);
		
		e1.setCourse("4 years");
		
		e1.setFevSub("Tanmay");
		
		e1.setName("Naik");
		
		ss.update(e1);
		
		tr.commit();
		
		ss.close();
	}
	
	public void getAllData() {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		
		
		HibernateCriteriaBuilder hcb =  ss.getCriteriaBuilder();
		JpaCriteriaQuery<Object> cq = hcb.createQuery();

		Root<Student> root =  cq.from(Student.class);

		cq.select(root);

		Query<Object> query = ss.createQuery(cq);
		
		List<Object> list = query.getResultList();

		for (Object student: list) {

		System.out.println(student);
		
		}
		
		
		
	}
	

}
