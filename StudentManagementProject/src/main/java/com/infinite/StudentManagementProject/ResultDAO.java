package com.infinite.StudentManagementProject;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Restrictions;



public class ResultDAO {
     private static final String Result_ = null;
	 SessionFactory sessionFactory;
     public String addResult(Result result){
    	 
		return null;
    	 
     }

     public void saveResult(Result result) {
    	 sessionFactory = SessionHelper.getConnection();
 	     Session session = sessionFactory.openSession();
         Transaction transaction = null;
         System.out.println("Inside method saveResult");
         
         try {
             transaction = session.beginTransaction();
             StudentDAO studentDAO=new StudentDAO();
             studentDAO.searchStudentsByStudentID(result.getStudentID());
            // studentDAO.addPercentageToStu(result.getStudentID(), result.getPercentage());
             session.save(result);
             transaction.commit();
         } catch (Exception e) {
             if (transaction != null) {
                 transaction.rollback();
             }
             e.printStackTrace();
         } finally {
             session.close();
         }
     }

     public Result getResultByStudentID(int studentID) {
    	    sessionFactory = SessionHelper.getConnection();
    	    Session session = sessionFactory.openSession();
    	    Result result = null;

    	    try {
    	        Criteria criteria = session.createCriteria(Result.class);
    	        criteria.add(Restrictions.eq("studentID", studentID));
    	        result = (Result) criteria.uniqueResult();
    	    } catch (Exception e) {
    	        e.printStackTrace();
    	    } finally {
    	        session.close();
    	    }

    	    return result;
    	}

    public float getPercentage (int studentId){
    	 sessionFactory = SessionHelper.getConnection();
    	 Session session = sessionFactory.openSession();
    	 
    	 float percentage = 0;
    	 
    	 Criteria criteria = session.createCriteria(Result.class);
    	 List<Result> results = (List<Result>) criteria.add(Restrictions.eq("studentID", studentId)).list();
    	 
    	 if(results.size() > 0){
    		 percentage = results.get(0).getPercentage();
    	 }
    	 
    	 return percentage;
    }
		
	}

	