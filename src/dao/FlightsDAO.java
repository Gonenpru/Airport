/*
 * 
 */
package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import db_items.Flights;
import utils.HibernateUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class FlightsDAO.
 */
public class FlightsDAO {
	
	/**
	 * Adds the.
	 *
	 * @param flights the flights
	 * @return the flights
	 */
	public Flights add(Flights flights) {
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(flights);
		tx.commit();
		return flights;
	}
	
	/**
	 * Delete.
	 *
	 * @param id the id
	 * @return the flights
	 */
	public Flights delete(int id){
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		Flights flights = (Flights) session.load(Flights.class, id);
		if (flights != null){
			session.delete(flights);
		}
		session.getTransaction().commit();
		return flights;
	}
	
	/**
	 * List.
	 *
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	public List<Flights> list(){
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Flights> flights = null;
		try {
			flights = (List<Flights>) session.createQuery("from Flights order by id asc").list();
		} catch (HibernateException e){
			e.printStackTrace();
			session.getTransaction().rollback();
		}	
		if (!tx.getStatus().equals(TransactionStatus.ACTIVE)) {
			tx.commit();
		}
		return flights;
	}
	
	/**
	 * List arrivals.
	 *
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	public List<Flights> listArrivals(){
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Flights> flights = null;
		try {
			flights = (List<Flights>) session.createQuery("from Flights where plane_id > 4").list();
		} catch (HibernateException e){
			e.printStackTrace();
			session.getTransaction().rollback();
		}	
		if (!tx.getStatus().equals(TransactionStatus.ACTIVE)) {
			tx.commit();
		}
		return flights;
	}
	
	/**
	 * List departures.
	 *
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	public List<Flights> listDepartures(){
		Session session = HibernateUtils.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		List<Flights> flights = null;
		try {
			flights = (List<Flights>) session.createQuery("from Flights where plane_id < 5").list();
		} catch (HibernateException e){
			e.printStackTrace();
			session.getTransaction().rollback();
		}	
		if (!tx.getStatus().equals(TransactionStatus.ACTIVE)) {
			tx.commit();
		}
		return flights;
	}
	
	
}
