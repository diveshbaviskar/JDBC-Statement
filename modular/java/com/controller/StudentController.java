package com.controller;

import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) {

		StudentService ss = new StudentService();

//		ss.insertData();
//		ss.deleteData();
//		ss.updateData();
		ss.getAllData();
		
	}

}
