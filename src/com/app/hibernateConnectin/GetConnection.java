package com.app.hibernateConnectin;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetConnection {

	// 1. creating static sessionFactory object
	private static SessionFactory sf=null;
		
	// 2. creating static block to creating sessionFactory object for once and using again and again.
	static{
			
			Configuration cfg=new Configuration();
			cfg.configure();
			sf=cfg.buildSessionFactory();
			
		}
	//3. creating a method which return sessionFactory object
		public static SessionFactory getSF(){
			return sf;
		}


}
