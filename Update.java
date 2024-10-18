package com.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		SessionFactory sfg=cfg.buildSessionFactory();
		Session session=sfg.openSession();
		Transaction t=session.beginTransaction();
        Query query=session.createQuery("update  Faculty set  dept =:s where dept =:d");
        query.setParameter("s", "CSE(AI&ML)");
        query.setParameter("d","AI&ML");
        query.executeUpdate();
        t.commit();
		session.close();
		sfg.close();

	}

}
