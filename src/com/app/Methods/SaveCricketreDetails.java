package com.app.Methods;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.hibernateConnectin.GetConnection;
import com.app.model.CricketerDetails;


public class SaveCricketreDetails {

	public int saveDetails(CricketerDetails cricket) {
		Session ses=null;
		Transaction tx=null;
		int id=0;
		try {
			// creating session object
			ses=GetConnection.getSF().openSession();

			// creating transaction required for save operations.
			tx=ses.beginTransaction();

			// calling save method through sesion object to save data
			id=(Integer)ses.save(cricket);
			tx.commit();

		} catch (Exception e) {

			// if any exception occure during saving the data transaction is cancelled.
			tx.rollback();
			e.printStackTrace();
		}finally{
			if(ses!=null)
				ses.close();
		}
		return id;
	}
}
