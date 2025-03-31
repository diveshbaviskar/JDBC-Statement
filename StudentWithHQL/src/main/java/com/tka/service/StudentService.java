package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentDao;
import com.tka.entity.Student1;

  
@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;
	
		public String insertData(Student1 s) {
			String msg = dao.insertData(s);
			return msg;
			
		}
		public String deleteData(int studid ) {
			String msg = dao.deleteData(studid);
			return msg;
		}
		public String updateData(Student1 s, int studid ) {
			String msg = dao.updateData(s, studid);
			return msg;
		}
		public Student1 getSingleData( int studid ) {
			Student1 msg = dao.getSingleData( studid);
			return msg;
		}
		public List<Student1> getAllData( Student1 s ) {
			List<Student1> msg = dao.getAlldata(s);
			return msg;
		}
		
}
