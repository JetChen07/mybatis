package com.damu.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.damu.utils.SqlSessionFactoryUtils;

/**
 * Application Lifecycle Listener implementation class InitSqlSessionListener
 *
 */

public class InitSqlSessionListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		SqlSessionFactoryUtils.initSqlSessionFactory();
		System.out.println("容器加载");
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		SqlSessionFactoryUtils.close();
		System.out.println("容器销毁");
	}

	
	
}
