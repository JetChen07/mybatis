package com.jack.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;


import com.jack.utils.SqlSessionFactoryUtils;
import com.jack.entity.Course;
import com.jack.entity.Student;

public class StudentDAO {
	private SqlSession sqlSession;
	private List<Student> studentList;
	private SqlSession getSession() {
		sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		return sqlSession;
	}
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		try {
			studentList = getSession().selectList("findStudents");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return studentList;
	}
	public Student addStudent(Student st) {
		try {
			getSession().insert("addStudent",st);
			sqlSession.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return st;
		// TODO Auto-generated method stub
		
	}
	public void delStudent(int id) {
		// TODO Auto-generated method stub
		try {
			Student stu = new Student();
			stu.setId(id);
			getSession().delete("delStudent",stu);
			sqlSession.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	}
	public Student findById(int id) {
		// TODO Auto-generated method stub
		
		try {
			Student stu = new Student();
			stu.setId(id);
			return getSession().selectOne("findById",stu);			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return null;
	}
	
	public List<Course> findCourseByName(String name){
		try {
			Course course = new Course();
			course.setMajorName(name);
			return getSession().selectList("getCourses",course);			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return null;
	}

}
