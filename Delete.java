package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		SessionFactory sfg=cfg.buildSessionFactory();
		Session session=sfg.openSession();
		Transaction t=session.beginTransaction();
        Query query=session.createQuery("delete from Faculty where salary >= :s and dept !=:d");
        query.setParameter("s", 150000);
        query.setParameter("d", "CSE");
        query.executeUpdate();
		t.commit();
		session.close();
		sfg.close();

	}

}
