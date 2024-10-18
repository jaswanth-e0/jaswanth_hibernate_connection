package com.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		SessionFactory sfg=cfg.buildSessionFactory();
		Session session=sfg.openSession();
		Transaction t=session.beginTransaction();
		Faculty obj=new Faculty();
		obj.setName("Sravya");
		obj.setDesg("AssociateProffiser");
		obj.setDept("CSM");
		obj.setExp(12);
		obj.setSalary(189000);
		session.save(obj);
		t.commit();
		session.close();
		sfg.close();
		
		

	}

}
