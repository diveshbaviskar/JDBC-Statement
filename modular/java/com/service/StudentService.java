package com.service;

import com.dao.StudentDao;

public class StudentService {


	
	public void insertData() {
		
		StudentDao sd = new StudentDao();
		sd.insertData();
	}
	
   public void deleteData() {
		
		StudentDao sd = new StudentDao();
		sd.deleteData();
	}
   public void updateData() {
		
		StudentDao sd = new StudentDao();
		sd.updateData();
	}
   
   public void getAllData() {
		
		StudentDao sd = new StudentDao();
		sd.getAllData();
	}
   
   
   

}
