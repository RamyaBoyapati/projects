package com.infinite.hib;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class LeaveDAO {

	SessionFactory sFactory;
	Session session;

	public java.sql.Date convertDate(String dt) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
       Date d1 =  sdf.parse(dt);
      return new java.sql.Date(d1.getTime());
        
	}
	 public String addLeave(Leave leave){
         
         java.sql.Date sqlDate = new java.sql.Date(leave.getLeaveStartDate().getTime());
         leave.setLeaveStartDate(sqlDate);
         java.sql.Date sqlDate1 = new java.sql.Date(leave.getLeaveEndDate().getTime());
         leave.setLeaveEndDate(sqlDate1);
         long sdate = leave.getLeaveStartDate().getTime();
         long edate = leave.getLeaveEndDate().getTime();
         
         long diff = edate - sdate;
         long b = diff/(1000*24*60*60);
         int days=(int)b;
         days=days+1;
         
         leave.setNoOfDays(days);
         double no=leave.getNoOfDays();
         
         if(no>3){
             
             leave.setLossOfPay(no-3);
             
         }else{
             leave.setLossOfPay(0);
         }
          
             Transaction tran=session.beginTransaction();
             session.save(leave);
             tran.commit();
             return "Apply Leave Successfully...";
             
     }
}