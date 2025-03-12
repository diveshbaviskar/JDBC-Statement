package com.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stud_info")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int studid;
	public String name;
	public String age;
	public String std;
	public String course;
	public String mbno;
	public String fevSub;
	
	public Student() {
		
	}

	private Student(int studid, String name, String age, String std, String course, String mbno, String fevSub) {
		super();
		this.studid = studid;
		this.name = name;
		this.age = age;
		this.std = std;
		this.course = course;
		this.mbno = mbno;
		this.fevSub = fevSub;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getMbno() {
		return mbno;
	}

	public void setMbno(String mbno) {
		this.mbno = mbno;
	}

	public String getFevSub() {
		return fevSub;
	}

	public void setFevSub(String fevSub) {
		this.fevSub = fevSub;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", name=" + name + ", age=" + age + ", std=" + std + ", course=" + course
				+ ", mbno=" + mbno + ", fevSub=" + fevSub + "]";
	}
	

}
