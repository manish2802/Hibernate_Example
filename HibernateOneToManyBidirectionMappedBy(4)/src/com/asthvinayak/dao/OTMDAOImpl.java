package com.asthvinayak.dao;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.asthvinayak.entity.CustomerDTO;
import com.asthvinayak.util.HibernateUtil;

public class OTMDAOImpl {
	private static Logger LOGGER = Logger.getLogger(OTMDAOImpl.class);
	private static String CLASS_NAME = "OTMDAOImpl";

	/**
	 * 
	 * @param customer
	 * @return
	 */
	public Serializable saveOneToManyBi(CustomerDTO customer) {
		String METHOD_NAME = "saveOneToManyBi";
		LOGGER.debug("Enter Into " + METHOD_NAME + " in " + CLASS_NAME);

		Serializable id = null;
		Transaction transaction = null;
		Session session = HibernateUtil.currentSession();
		LOGGER.info("Before perform operation..!");
		try {
			transaction = session.beginTransaction();
			id = session.save(customer);
			LOGGER.info(id + " save sccuessfully..!");
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		LOGGER.debug("Exit from " + METHOD_NAME + " in " + CLASS_NAME);
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void removeParent(Serializable id) {
		String METHOD_NAME = "removeParent";
		LOGGER.debug("Enter Into " + METHOD_NAME + " in " + CLASS_NAME);

		Transaction transaction = null;
		Session session = HibernateUtil.currentSession();

		try {
			transaction = session.beginTransaction();
			CustomerDTO customer = (CustomerDTO) session.get(CustomerDTO.class, id);
			session.delete(customer);
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		LOGGER.debug("Exit from " + METHOD_NAME + " in " + CLASS_NAME);

	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public CustomerDTO removeChild(Serializable id, Class<?> clazz) {
		String METHOD_NAME = "removeChild";
		LOGGER.debug("Enter Into " + METHOD_NAME + " in " + CLASS_NAME);

		Transaction transaction = null;
		CustomerDTO customer = null;
		Session session = HibernateUtil.currentSession();

		try {
			transaction = session.beginTransaction();
			Object data = session.get(clazz, id);
			session.delete(data);
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.flush();
			session.close();
		}
		LOGGER.debug("Exit from " + METHOD_NAME + " in " + CLASS_NAME);
		return customer;
	}

}