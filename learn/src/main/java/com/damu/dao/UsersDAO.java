package com.damu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.damu.entity.Users;
import com.damu.utils.SqlSessionFactoryUtils;

public class UsersDAO {
	private SqlSession sqlSession;
	private List<Users> list;
	private SqlSession getSession() {
		sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		return sqlSession;
	}
	public List<Users> findAll(){
		try {
			list = getSession().selectList("findUsers");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return list;
	}

	public Users findById(int id) {
		// TODO Auto-generated method stub
		Users users = null;
		try {
			users = getSession().selectOne("findUsers",new Users(id));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return users;
	}
	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		try {
			getSession().insert("addUser",user);
			sqlSession.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return user;
	}
	public void updateUsers(Users user) {
		// TODO Auto-generated method stub
		try {
			getSession().update("updateUser",user);
			sqlSession.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
	}
	public void delUsers(int parseInt) {
		// TODO Auto-generated method stub
		try {
			getSession().update("delUser",new Users(parseInt));
			sqlSession.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	}
	
}