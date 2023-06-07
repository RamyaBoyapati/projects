package com.infinite.EmployeeProject;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.criterion.Restrictions;


public class EmpDAO{
	SessionFactory sessionFactory;
	
//	public String addEmploy(Employe employe) {
//		
//		sessionFactory=SessionHelper.getConnection();
//		Session session=sessionFactory.openSession();
//		
//		Criteria cr=session.createCriteria(Employe.class);
//		java.sql.Date sqlDate = new java.sql.Date(employe.getDateOfJoining().getTime());
//		employe.setDateOfJoining(sqlDate);
//		Transaction tr=session.beginTransaction();
//		session.save(employe);
//		tr.commit();
//		return "Employe added";
//		
//	}
	public Date convertDate(java.util.Date dt){
        java.sql.Date sqlDate=new java.sql.Date(dt.getTime());
        return sqlDate;
       }
	
	public String DeleteEmploy(Employe employe){
		sessionFactory=SessionHelper.getConnection();
		Session session=sessionFactory.openSession();
		
		Criteria cr=session.createCriteria(Employe.class);
		Transaction tr=session.beginTransaction();
		session.delete(employe);
		tr.commit();
		return "Employe deleted";
		
	}
//	public String UpdateEmploy(Employe employe){
//		sessionFactory=SessionHelper.getConnection();
//		Session session=sessionFactory.openSession();
//		Criteria cr=session.createCriteria(Employe.class);
//		java.sql.Date sqlDate = new java.sql.Date(employe.getDateOfJoining().getTime());
//		employe.setDateOfJoining(sqlDate);
//		Transaction tr=session.beginTransaction();
//		session.update(employe);
//		tr.commit();
//	    return "Employee Updated";
//	}
	
//	public Employe searchEmploye(int empID){
//		sessionFactory = SessionHelper.getConnection();
//		Session session = sessionFactory.openSession();
//		Criteria cr = session.createCriteria(Employe.class);
//		cr.add(Restrictions.eq("empID",empID));
//		List<Employe> EmployeList=cr.list();
//		return EmployeList.get(0);
//		
//	}
	public String addEmploy(Employe employe) {
	    sessionFactory = SessionHelper.getConnection();
	    Session session = null;
	    Transaction tr = null;
	    try {
	        session = sessionFactory.openSession();
	        Criteria cr = session.createCriteria(Employe.class);
	        java.sql.Date sqlDate = new java.sql.Date(employe.getDateOfJoining().getTime());
	        employe.setDateOfJoining(sqlDate);
	        tr = session.beginTransaction();
	        session.save(employe);
	        tr.commit();
	        return "Employe added";
	    } catch (HibernateException e) {
	        if (tr != null) {
	            tr.rollback();
	        }
	        e.printStackTrace();
	        return "Failed to add Employe";
	    } finally {
	        if (session != null) {
	            session.close();
	        }
	    }
	}
	public String UpdateEmploy(Employe employe) {
	    sessionFactory = SessionHelper.getConnection();
	    Session session = null;
	    Transaction tr = null;
	    try {
	        session = sessionFactory.openSession();
	        Criteria cr = session.createCriteria(Employe.class);
	        java.sql.Date sqlDate = new java.sql.Date(employe.getDateOfJoining().getTime());
	        employe.setDateOfJoining(sqlDate);
	        tr = session.beginTransaction();
	        session.update(employe);
	        tr.commit();
	        return "Employe updated";
	    } catch (HibernateException e) {
	        if (tr != null) {
	            tr.rollback();
	        }
	        e.printStackTrace();
	        return "Failed to update Employe";
	    } finally {
	        if (session != null) {
	            session.close();
	        }
	    }
	}
//	public Employe searchEmploye(int empID){
//		sessionFactory = SessionHelper.getConnection();
//		Session session = sessionFactory.openSession();
//		Criteria cr = session.createCriteria(Employe.class);
//		if (sessionFactory == null) {
//		    throw new NullPointerException("sessionFactory is null");
//		}
//		try {
//		    // code that could throw a HibernateException
//		} catch (HibernateException e) {
//		    logger.error("Error searching for employee with ID " + empID, e);
//		    throw e;
//		}
//		return null;
//		
//		
//		
//		
//	}
	public Employe searchEmploye(int empID) {
	    sessionFactory = SessionHelper.getConnection();
	    Session session = null;
	    try {
	        session = sessionFactory.openSession();
	        Criteria cr = session.createCriteria(Employe.class);
	        cr.add(Restrictions.eq("empID", empID));
	        List<Employe> employeList = cr.list();
	        if (!employeList.isEmpty()) {
	            return employeList.get(0);
	        }
	    } catch (HibernateException e) {
	        e.printStackTrace();
	    } finally {
	        if (session != null) {
	            session.close();
	        }
	    }
	    return null;  
	}
	
	
	
}
