package com.tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int emp_id;
	private String fname;
	private String lname;
	private String num;
	private String age;
	private String gender;
	private String designation;
	private String shift;
	private String salary;
	private String experience;
	private String address;
	private String nationality; 
	private String department;
	
	
	public Employee() {
		
	}


	public Employee(int emp_id, String fname, String lname, String num, String age, String gender, String designation,
			String shift, String salary, String experience, String address, String nationality, String department) {
		super();
		this.emp_id = emp_id;
		this.fname = fname;
		this.lname = lname;
		this.num = num;
		this.age = age;
		this.gender = gender;
		this.designation = designation;
		this.shift = shift;
		this.salary = salary;
		this.experience = experience;
		this.address = address;
		this.nationality = nationality;
		this.department = department;
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getShift() {
		return shift;
	}


	public void setShift(String shift) {
		this.shift = shift;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", fname=" + fname + ", lname=" + lname + ", num=" + num + ", age=" + age
				+ ", gender=" + gender + ", designation=" + designation + ", shift=" + shift + ", salary=" + salary
				+ ", experience=" + experience + ", address=" + address + ", nationality=" + nationality
				+ ", department=" + department + "]";
	}
	
	
	
	
	
	
	
	

}
