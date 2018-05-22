package com.jack.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.jack.utils.SqlSessionFactoryUtils;

/**
 * Application Lifecycle Listener implementation class InitSqlSessionListener
 *
 */
public class InitSqlSessionListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		SqlSessionFactoryUtils.initSqlSessionFactory();
		System.out.println("��������");
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		SqlSessionFactoryUtils.close();
		System.out.println("��������");
	}
	
}
