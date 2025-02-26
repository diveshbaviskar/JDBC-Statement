package com.service;
//
import com.dao.AnimalDao;

public class AnimalService {

	// Buisness Logic
	public void insertData() throws Exception {

		AnimalDao ad = new AnimalDao();
		ad.insertData();
	}

	public void deleteData() throws Exception {

		AnimalDao ad = new AnimalDao();
		ad.deleteData();
	}
	
      public void updateData() throws Exception {
		
		AnimalDao ad = new AnimalDao();
		ad.updateData();
	}
      
      public void	 getAllData() throws Exception {
  		
  		AnimalDao ad = new AnimalDao();
  		ad.getAllData();
  	}
}