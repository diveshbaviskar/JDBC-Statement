package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int studid;
	private String name;
	private String stream;
	public Student1() {
		
	}
	public Student1(int studid, String name, String stream) {
		super();
		this.studid = studid;
		this.name = name;
		this.stream = stream;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", name=" + name + ", Stream=" + stream + "]";
	}
	
	
	
	

}
