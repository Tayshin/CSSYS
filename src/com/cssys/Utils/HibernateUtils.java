package com.cssys.Utils;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateUtils<T> {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public boolean save(Object obj){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();;
		boolean status = false;
		try {
			session.save(session.merge(obj));
			tx.commit();
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
        return status;
	}
	
	public boolean update(Object obj){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();;
		boolean status = false;
		try {
			session.update(session.merge(obj));
			tx.commit();
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
        return status;
	}
	
	public boolean delete(Object obj){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		boolean status = false;
		try {
			System.out.println(obj == null);
			session.delete(session.merge(obj));
			tx.commit();
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return status;
	}
	
	public Object findByHql(String hql, Object[] condition) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Object result = null;
		try {
			Query query = session.createQuery(hql);
			if (condition.length != 0)
				for (int i = 0; i < condition.length; i++)
					query.setParameter(i, condition[i]);
			result = query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			//tran.rollback();
			e.printStackTrace();
		}
		return result;
	}
	
	public List<T> findByHqlGetList(String hql,Object[] condition){
		Query query=sessionFactory.openSession().createQuery(hql);
		for(int i=0,len=condition.length;i<len;i++){
			query.setParameter(i+" ",condition[i]);
		}
		return (List<T>)query.list();
	}
}
