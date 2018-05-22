package com.jack.utils;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {
	private static SqlSessionFactory sqlSessionFactory;
	private static final String RESOURCE = "mybatis-config.xml";
	private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();
	
	public static void initSqlSessionFactory() {
		try {
			InputStream inputStream = Resources.getResourceAsStream(RESOURCE);		//test	
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public static void close() {
		// TODO Auto-generated method stub
		SqlSession session = threadLocal.get();
		if(session != null) {
            session.close();
            threadLocal.set(null);
        }
	}
}
