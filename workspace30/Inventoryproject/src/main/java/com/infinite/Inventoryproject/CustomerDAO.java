package com.infinite.Inventoryproject;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
@ManagedBean
@SessionScoped
public class CustomerDAO {

	SessionFactory sessionFactory;
	
	   public String addCustomer(Customer customer){
	    sessionFactory = SessionHelper.getConnection();
	    Session session = sessionFactory.openSession();
	    int Customerid=generateCustomerid();
	    Transaction transaction = session.beginTransaction();
	    customer.setCustomerid(Customerid);
	    session.save(customer);
	    transaction.commit();
	    session.close();
	    return " Added Successsfully...";
	}
	    
	    private int generateCustomerid() {
	        return 0;
	    }

	    public int authenticate(String user,String password){
	            sessionFactory = SessionHelper.getConnection();
	            Session session = sessionFactory.openSession();
	            Criteria criteria = session.createCriteria(Customer.class);
	            criteria.add(Restrictions.eq("userName", user));
	            criteria.add(Restrictions.eq("passCode", password));
	            List<Customer>cuList = criteria.list();
	            return cuList.size();
	            
	                }
}