package com.jack.entity;

public class Course {
/**
 * id INT UNSIGNED NOT NULL AUTO_INCREMENT KEY,
	courseid varchar(20) NOT NULL,
	major_name varchar(20) NOT NULL,
	courname varchar(20) NOT NULL,
	courtime INT NOT NULL DEFAULT 45,
	courteacher varchar(20) NOT NULL
 */
	private int id;
	private String courseId;
	private String majorName;
	private String courname;
	private int courtime;
	private String courteacher;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public String getCourname() {
		return courname;
	}
	public void setCourname(String courname) {
		this.courname = courname;
	}
	public int getCourtime() {
		return courtime;
	}
	public void setCourtime(int courtime) {
		this.courtime = courtime;
	}
	public String getCourteacher() {
		return courteacher;
	}
	public void setCourteacher(String courteacher) {
		this.courteacher = courteacher;
	}
}
