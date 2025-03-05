package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CarMain {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();

		Car c = new Car();
		c.setColour("Green");
		c.setCompany("Lamborgini");
		c.setCost(2000);
		c.setEnginepower("720HorsePower");
		c.setName("Lamborgini");
		c.setNumber("MH 14 DB 2003 ");
		c.setRange(10000);
		c.setSpeed("380km/hr");

		ss.persist(c);

		System.out.println("Inserted....");

		tr.commit();

		ss.close();

	}

}
