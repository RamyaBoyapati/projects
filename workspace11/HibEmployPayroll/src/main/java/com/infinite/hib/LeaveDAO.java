package com.infinite.hib;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LeaveDAO {
Session sessionFactory;
	
	public List<Leave> showLeave() {
		sessionFactory = SessionHelper.getConnection();
		Session session = ((SessionFactory) sessionFactory).openSession();
		return session.createQuery("from Leave").list();
		
	}
	 public java.sql.Date convertDate(String dt) throws ParseException{
         SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date d1 =  sdf.parse(dt);
       return new java.sql.Date(d1.getTime());
         
     }
	 public String addLeave(Leave leaveId){
         
         java.sql.Date sqlDate = new java.sql.Date(leaveId.getStartDate().getTime());
         leaveId.setStartDate(sqlDate);
         java.sql.Date sqlDate1 = new java.sql.Date(leaveId.getEndDate().getTime());
         leaveId.setEndDate(sqlDate1);
         long sdate = leaveId.getStartDate().getTime();
         long edate = leaveId.getEndDate().getTime();
         
         long diff = edate - sdate;
         long b = diff/(1000*24*60*60);
         int days=(int)b;
         days=days+1;
         
         leaveId.setNoOfDays(days);
         double no=leaveId.getNoOfDays();
         
         if(no>3){
             
             leaveId.setLossOfPay(no-3);
             
         }else{
             leaveId.setLossOfPay(0);
         }
          
             
     }
}
