package com.jack.entity;

import java.util.List;

public class Student {
	
	
/*	id INT UNSIGNED AUTO_INCREMENT KEY,
	reg_no INT NOT NULL,
	name varchar(20) NOT NULL,
	sex varchar(20) NOT NULL,
	age INT NOT NULL,
	grade varchar(20) NOT NULL,
	major varchar(50) NOT NULL*/
	
	private int id;
	private int reg_no;
	private String name;
	private String sex;
	private int age;
	private String grade;
	private String major;
	private List<Course> courses;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", reg_no=" + reg_no + ", name=" + name + ", sex=" + sex + ", age=" + age
				+ ", grade=" + grade + ", major=" + major + "]";
	}

	public Student() {
		super();
	}
	
	public Student(int id, int reg_no, String name, String sex, int age, String grade, String major) {
		super();
		this.id = id;
		this.reg_no = reg_no;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.grade = grade;
		this.major = major;
	}
	
	public Student(int reg_no, String name, String sex, int age, String grade, String major) {
		super();
		this.reg_no = reg_no;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.grade = grade;
		this.major = major;
	}

	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReg_no() {
		return reg_no;
	}
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}