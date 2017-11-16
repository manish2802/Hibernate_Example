package com.asthvinayak.dao;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.asthvinayak.util.HibernateUtil;

public class ProductDAO {
	/**
	 * For save the info of product.
	 * 
	 * @param productDTO
	 */
	public Serializable saveProduct(Object entity) {
		Serializable id = null;
		Transaction transaction = null;
		Session session = HibernateUtil.currentSession();
		try {
			transaction = session.beginTransaction();
			id = session.save(entity);
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			// session.flush();
			session.close();
		}
		return id;
	}

	/**
	 * For deleting product info.
	 * 
	 * @param id
	 * @param clazz
	 */
	public void deleteProduct(Serializable id, Class<?> clazz) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Object data = session.get(clazz, id);
			session.delete(data);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.flush();
			HibernateUtil.closeSession();
		}
	}

	/**
	 * For Getting Product detail.
	 * 
	 * @param id
	 * @param clazz
	 * @return
	 */
	public Object getProductDetail(Serializable id, Class<?> clazz) {
		Session session = HibernateUtil.currentSession();
		Object object = session.get(clazz, id);
		HibernateUtil.closeSession();
		return object;
	}

	/**
	 * For Updating the Product Record.
	 * 
	 * @param entity
	 * @return
	 */
	public Object updateProduct(Object entity) {
		Transaction transaction = null;
		Session session = HibernateUtil.currentSession();
		try {
			transaction = session.beginTransaction();
			session.update(entity);
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			HibernateUtil.closeSession();
		}
		return entity;
	}
}