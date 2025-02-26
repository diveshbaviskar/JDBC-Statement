package com.controller;

import com.service.AnimalService;

public class AnimalController {
	
	public static void main(String[] args) throws Exception{
		
		
		AnimalService as = new AnimalService();
		
//		as.insertData();
//		as.deleteData();
//		as.updateData();
		
		as.getAllData();
			
	}

}
