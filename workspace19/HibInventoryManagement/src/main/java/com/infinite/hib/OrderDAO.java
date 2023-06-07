package com.infinite.hib;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;



public class OrderDAO {
	SessionFactory sessionFactory;
	
	public String generateOrderId(){
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Order.class);
		 List<Order> ordersList = cr.list();
		 if(ordersList.size()==0){
			 return "O001";
		 }
		 String id = ordersList.get(ordersList.size()-1).getOrderId();
		 int id1 = Integer.parseInt(id.substring(1));
		 id1++;
		 String id2 = String.format("O%03d", id1);
		return id2;
		 
	
		
	}

	
	public Date convertDate(java.util.Date dt){
        java.sql.Date sqlDate=new java.sql.Date(dt.getTime());
        return sqlDate;
       }
	
	public String addOrder(Order order){
		sessionFactory = SessionHelper.getConnection();
		 Session session = sessionFactory.openSession();
     	 Criteria cr= session.createCriteria(Order.class);
		 String orderId=generateOrderId();
		 order.setOrderId(orderId);
		 java.sql.Date sqlDate = new java.sql.Date(order.getOrderedDate().getTime());
			order.setOrderedDate(sqlDate);
	    	java.sql.Date sqlDate1 = new java.sql.Date(order.getDeliveryDate().getTime());
			order.setDeliveryDate(sqlDate1);
			java.sql.Date sqlDate2 = new java.sql.Date(order.getShippingDate().getTime());
			order.setShippingDate(sqlDate2);
	    	java.sql.Date sqlDate3 = new java.sql.Date(order.getExpecteddeliveryDate().getTime());
			order.setExpecteddeliveryDate(sqlDate3);
			order.setOrderedDate(sqlDate);
			order.setDeliveryDate(sqlDate1);
			order.setShippingDate(sqlDate2);
			order.setExpecteddeliveryDate(sqlDate3);
			Transaction trans = session.beginTransaction();
			
			   session.save(order);
			   trans.commit();
			   session.close();
		return "Added Order Sucessfully";
		
	}

	public String deleteOrder(Order order){
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
        Query query = session.createQuery("delete from Order where orderId=:orderId");
        Criteria cr = session.createCriteria(Order.class);
        cr.add(Restrictions.eq("orderId", order));
        Transaction tr = session.beginTransaction();
        session.delete(order);
        tr.commit();
        return "Deleted Order";
    }
	public String updateOrder(Order orderNew){
		sessionFactory = SessionHelper.getConnection();
		Session session = sessionFactory.openSession();
        Criteria cr = session.createCriteria(Order.class);
        String orderId=generateOrderId();
        orderNew.setOrderId(orderId);
		 java.sql.Date sqlDate = new java.sql.Date(orderNew.getOrderedDate().getTime());
			orderNew.setOrderedDate(sqlDate);
	    	java.sql.Date sqlDate1 = new java.sql.Date(orderNew.getDeliveryDate().getTime());
			orderNew.setDeliveryDate(sqlDate1);
			java.sql.Date sqlDate2 = new java.sql.Date(orderNew.getShippingDate().getTime());
			orderNew.setShippingDate(sqlDate2);
	    	java.sql.Date sqlDate3 = new java.sql.Date(orderNew.getExpecteddeliveryDate().getTime());
			orderNew.setExpecteddeliveryDate(sqlDate3);
			orderNew.setOrderedDate(sqlDate);
			orderNew.setDeliveryDate(sqlDate1);
			orderNew.setShippingDate(sqlDate2);
			orderNew.setExpecteddeliveryDate(sqlDate3);
			Transaction trans = session.beginTransaction();
			
			   session.save(orderNew);
			   trans.commit();
			   session.close();
        return "Order Updated Sucessfully";
    }
	public Order searchOrder(String orderId) {
        sessionFactory = SessionHelper.getConnection();
        Session session = sessionFactory.openSession();
        Criteria cr = session.createCriteria(Order.class);
        cr.add(Restrictions.eq("orderId", orderId));
        List<Order> orderList = cr.list();
        return orderList.get(0);
    }
    public List<Order> showOrder( ) {
        sessionFactory = SessionHelper.getConnection();
        Session session = sessionFactory.openSession();
        Criteria cr = session.createCriteria(Order.class);
        List<Order> orderList = cr.list();        
        return orderList;
    }
	
}
