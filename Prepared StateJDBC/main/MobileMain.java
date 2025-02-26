package com.main;

import com.jdbcpre.Mobile;

public class MobileMain {
	
	public static void main(String[] args) throws Exception {
		
		Mobile m = new Mobile();
		
//		m.insertData();
//		m.deleteData();
		m.updateData();
		m.getAllRecords();
	}

}
