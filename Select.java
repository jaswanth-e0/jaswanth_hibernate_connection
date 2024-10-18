package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		SessionFactory sfg=cfg.buildSessionFactory();
		Session session=sfg.openSession();
		Transaction t=session.beginTransaction();
//	    Query query=session.createQuery("from Faculty");
//	    List<Faculty> list=query.list();
//	    for(Faculty obj:list) {
//	    	System.out.println(obj);
//	    }
		Query query=session.createQuery("from Faculty where salary >=:s");
		query.setParameter("s", 150000);
	    List<Faculty> list=query.list();
	    for(Faculty obj:list) {
	    	System.out.println(obj);
	    }
		t.commit();
		session.close();
		sfg.close();
		

	}

}
