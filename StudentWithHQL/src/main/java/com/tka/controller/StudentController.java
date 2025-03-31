package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Student1;
import com.tka.service.StudentService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/insertdata")
	public String insertData(@RequestBody Student1 s) {
		String msg = service.insertData(s);
		return msg;

	}
	@DeleteMapping("/deletedata/{studid}")
	public String deleteData(@PathVariable int studid) {
		String msg = service.deleteData(studid);
		return msg;
	}
	@PutMapping("/updatedata/{studid}")
	public String updatedata(@PathVariable int studid, @RequestBody Student1 s) {
		String msg = service.updateData(s, studid);
		return msg;
	}
	@GetMapping("/getsingledata/{studid}")
	public Student1 getSingleData( @PathVariable int studid ) {
		Student1 msg = service.getSingleData( studid);
		return msg;
	}
	@GetMapping("getalldata")
	public List<Student1> getAllData( Student1 s ) {
		List<Student1> msg = service.getAllData(s);
		return msg;
	}

}
