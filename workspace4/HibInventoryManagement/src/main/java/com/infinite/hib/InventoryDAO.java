package com.infinite.hib;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class InventoryDAO {
	
	SessionFactory sessionFactory;
	
	public java.sql.Date convertDate(String dt) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
       java.util.Date d1 =   sdf.parse(dt);
      return new java.sql.Date(d1.getTime());
    }
	
	
    public String generateOrderId(){
         sessionFactory = SessionHelper.getConnection();
         Session session = sessionFactory.openSession();
         Criteria cr = session.createCriteria(Order.class);
         List<Order> orderList = cr.list();
         session.close();
         String id = orderList.get(orderList.size()-1).getOrderId();
         int id1 = Integer.parseInt(id.substring(1));
         id1++;
         String id2 = String.format("O%03d", id1);
        return id2;
         
        }
   
    
    
    
    public String addOrder(Order order){
        //order.setOrderId("O001");
    	  sessionFactory = SessionHelper.getConnection();
          Session session = sessionFactory.openSession();
    	String orderId=generateOrderId();
		 order.setOrderId(orderId);
       order.setOrderStatus(OrderStatus.ACCEPTED);
       java.sql.Date sqlDate = new java.sql.Date(order.getOrderedDate().getTime());
		order.setOrderedDate(sqlDate);
   	java.sql.Date sqlDate1 = new java.sql.Date(order.getDeliveryDate().getTime());
		order.setDeliveryDate(sqlDate1);
		java.sql.Date sqlDate2 = new java.sql.Date(order.getExpectedDeliveryDate().getTime());
		order.setExpectedDeliveryDate(sqlDate2);
   	java.sql.Date sqlDate3 = new java.sql.Date(order.getShippingDate().getTime());
		order.setShippingDate(sqlDate3);
       
       
		 
//			 Date OrderedDate = order.getOrderedDate();
//		     Date DeliveryDate = course.getDeliveryDate();
//			java.sql.Date sqlDate = new java.sql.Date(OrderedDate.getTime());
//			 java.sql.Date sqlDate1 = new java.sql.Date(DeliveryDate.getTime());
//			java.sql.Date sqlDate2 = new java.sql.Date(ExpectedDeliveryDate.getTime());
//			java.sql.Date sqlDate3 = new java.sql.Date(ShippingDate.getTime());
//			order.setOrderedDate(sqlDate);
//			order.setDeliveryDate(sqlDate1);
//			order.setExpectedDeliveryDate(sqlDate2);
//			order.setShippingDate(sqlDate3);
		
       Criteria cr = session.createCriteria(Order.class);
       Transaction trans = session.beginTransaction();
       session.save(order);
       trans.commit();
       return "Order Added" ;
       
    }
    
    
	

}
