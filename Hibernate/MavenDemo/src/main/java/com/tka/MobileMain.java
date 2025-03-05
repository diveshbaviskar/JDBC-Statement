package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class MobileMain {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Mobile.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Transaction tr = ss.beginTransaction();
		
		Mobile m = new Mobile();
		m.setBatteryCapacity(5000);
		m.setBiometricType("Full");
		m.setBluetoothVersion("5.1");
		m.setBrand("Realme");
		m.setChargingPortType("C type");
		m.setChargingSpeed(33);
		m.setMaxNetworkSpeed(12);
		m.setModel("version8");
		m.setOperatingSystem("windows");
		m.setOwnerName("Divesh");
		m.setOwnerName("Helio G95");
		m.setRamSize(12);
		m.setWarrantyPeriod(3);
		m.setStorageCapacity(128);
		m.setScreenType("Amoled");
		m.setRefreshRate(90);
		
		ss.persist(m);
		
		System.out.println("Data Inserted...");
		
		tr.commit();
		
		ss.close();
		
		
		
		
		

	}

}
