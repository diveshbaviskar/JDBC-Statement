package com.service;

import com.dao.CarDao;

public class CarService {
	
	public void insertData() throws Exception{
		
		CarDao c = new CarDao();
		
		c.insertData();
		
	}

}
