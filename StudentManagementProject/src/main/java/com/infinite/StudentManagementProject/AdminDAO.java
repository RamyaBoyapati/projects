package com.infinite.StudentManagementProject;


import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;



import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class AdminDAO {
	SessionFactory sessionFactory;
	public static String hashPassword(String input)
    {
        try {
 
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
 
            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());
 
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
 
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

	public int authenticate(String user, String password) {
	    sessionFactory = SessionHelper.getConnection();
	    Session session = sessionFactory.openSession();
	    Criteria criteria = session.createCriteria(Admin.class);
	    criteria.add(Restrictions.eq("userName", user));
	    criteria.add(Restrictions.eq("password", password));
	    List<Admin> adminList = criteria.list();
	    session.close();
	    return adminList.size();
	}

	public boolean validate(Admin admin) throws Exception {
	    sessionFactory = SessionHelper.getConnection();
	    Session session = sessionFactory.openSession();
	    String h= admin.getPassword();
	    String j=hashPassword(h);
	    Criteria cr = session.createCriteria(Admin.class);
	    cr.add(Restrictions.eq("userName", admin.getUserName()));
	    cr.add(Restrictions.eq("password", j));

	    List<Admin> adminlist = cr.list();
	    System.out.println(adminlist);
	    if(adminlist.size() == 1) {
	        return true;
	    } else {   
	        return false;
	    }
	}

	public String addAdmin(Admin admin) {
	    sessionFactory = SessionHelper.getConnection();
	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();

	    Criteria existingUsernameCriteria = session.createCriteria(Admin.class);
	    existingUsernameCriteria.add(Restrictions.eq("userName", admin.getUserName()));
	    List<Admin> existingUserList = existingUsernameCriteria.list();

	    if (!existingUserList.isEmpty()) {
	        session.close();
	        return "Username already exists. Please choose a different username.";
	    }

	    int adminID = generateAdminID();
	    String hashedPassword = hashPassword(admin.getPassword());
	    admin.setPassword(hashedPassword);
	    session.save(admin);
	    transaction.commit();
	    session.close();
	    return "Admin added successfully.";
	}
	
	

	
	
	private int generateAdminID() {
		return 0;
	}

	public List<Admin> getAllAdmins() {
	    sessionFactory = SessionHelper.getConnection();
	    Session session = sessionFactory.openSession();
	    Criteria criteria = session.createCriteria(Admin.class);
	    List<Admin> adminList = criteria.list();
	    session.close();
	    return adminList;
	}

	public String validate(String userName, String password) throws Exception {
	    String result = "failure";
	    try {
	        sessionFactory = SessionHelper.getConnection();
	        Session session = sessionFactory.openSession();
	        Criteria cr = session.createCriteria(Admin.class);
	        cr.add(Restrictions.eq("userName", userName));
	        
	        // Password Validation
	        Pattern uppercasePattern = Pattern.compile(".*[A-Z].*");
	        Pattern lowercasePattern = Pattern.compile(".*[a-z].*");
	        Pattern numberPattern = Pattern.compile(".*\\d.*");

	        if (!uppercasePattern.matcher(password).matches()) {
	            throw new Exception("Password should contain at least one uppercase letter.");
	        }

	        if (!lowercasePattern.matcher(password).matches()) {
	            throw new Exception("Password should contain at least one lowercase letter.");
	        }

	        if (!numberPattern.matcher(password).matches()) {
	            throw new Exception("Password should contain at least one number.");
	        }

	        cr.add(Restrictions.eq("password", password));
	        List<Admin> adminList = cr.list();
	        if (adminList.size() > 0) {
	            result = "success";
	        }
	    } catch (Exception ex) {
	        throw new Exception(ex.getMessage());
	    }
	    return result;
	}

	public void save(Admin admin) {
	    sessionFactory = SessionHelper.getConnection();
	    Session session = sessionFactory.openSession();
	    Transaction trans = session.beginTransaction();
	    session.save(admin);
	    trans.commit();
	    session.close();
	}
	public void validatePassword(String password, String confirmPassword) throws Exception {
		if (password.equals(confirmPassword)) {
	        throw new Exception("Password and confirm password cannot be the same.");
	    }
		
	 
	    Pattern passwordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
	    if (!passwordPattern.matcher(password).matches()) {
	        throw new Exception("Password should be 8 digits alpha numeric, at least 1 uppercase, 1 special character, 1 number should exist in password.");
	    }
	}
	
//	public String changePassword(String username, String password) {
//	    sessionFactory = SessionHelper.getConnection();
//	    Session session = sessionFactory.openSession();
//	    Transaction trans = session.beginTransaction();
//	    
//	    Query query = session.createQuery("UPDATE Admin SET password = :newPassword WHERE username = :username");
//	    query.setParameter("newPassword", password);
//	    query.setParameter("username", username);
//	    
//	    int rowsAffected = query.executeUpdate();
//	    trans.commit();
//	    session.close();
//	    
//	    if (rowsAffected > 0) {
//	        return "Password changed.";
//	    } else {
//	        return "Failed to change password.";
//	    }
//	}
	public static void changePassword(String username, String password) {
		String hashedPassword = hashPassword(password);
        SessionFactory sessionFactory = SessionHelper.getConnection();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Query query = session.createQuery("UPDATE Admin SET password = :newPassword WHERE username = :username");
            query.setParameter("newPassword", hashPassword(password));
            query.setParameter("username", username);
            int rowsAffected  = query.executeUpdate();
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

	public void forgotPassword(String username, String password) throws IOException {
        String hashedPassword = hashPassword(password);

        try {
            sessionFactory = SessionHelper.getConnection();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            Query query = session.createQuery("FROM Admin WHERE username = :username");
            query.setParameter("username", username);
            Admin admin = (Admin) query.uniqueResult();

            if (admin != null) {
                admin.setPassword(hashedPassword);
                session.update(admin);
                transaction.commit();
            } else {
                throw new IOException("User not found");
            }

        } catch (HibernateException e) {
            e.printStackTrace();
            throw new IOException("Failed to update password");
        } finally {
            sessionFactory.close();
        }
    }
	public void validatePassword1(String password, String confirmPassword) throws Exception {
	    if (!password.equals(confirmPassword)) {
	        throw new Exception(" New Password and confirm password do not match And Please correct Password Given.");
	    }
	}
//	public static boolean isPasswordCorrect(String username, String password) {
//        SessionFactory sessionFactory = SessionHelper.getConnection();
//        Session session = sessionFactory.openSession();
//
//        try {
//            Query query = session.createQuery("SELECT COUNT(*) FROM Admin WHERE username = :username AND password = :password");
//            query.setParameter("username", username);
//            query.setParameter("password", hashPassword(password));
//            Long count = (Long) query.uniqueResult();
//            return count > 0;
//        } finally {
//            session.close();
//        }
//    }
	
	public static void changePassword(String username, String oldPassword, String newPassword) {
	    String hashedOldPassword = hashPassword(oldPassword);
	    String hashedNewPassword = hashPassword(newPassword);

	    Session session = null;
	    Transaction transaction = null;

	    try {
	        session = SessionHelper.getConnection().openSession();
	        transaction = session.beginTransaction();

	        Query query = session.createQuery("SELECT password FROM Admin WHERE username = :username");
	        query.setParameter("username", username);
	        String storedPassword = (String) query.uniqueResult();

	        if (storedPassword != null && storedPassword.equals(hashedOldPassword)) {
	            Query updateQuery = session.createQuery("UPDATE Admin SET password = :newPassword WHERE username = :username");
	            updateQuery.setParameter("newPassword", hashedNewPassword);
	            updateQuery.setParameter("username", username);
	            int rowsAffected = updateQuery.executeUpdate();
	            transaction.commit();
	        } else {
	            // Old password does not match, handle accordingly (throw exception, show error message, etc.)
	        }
	    } catch (Exception e) {
	        if (transaction != null) {
	            transaction.rollback();
	        }
	        e.printStackTrace();
	    } finally {
	        if (session != null) {
	            session.close();
	        }
	    }

	}
	
	public boolean validateUserName(String username){
		SessionFactory sessionFactory = SessionHelper.getConnection();
        Session session = sessionFactory.openSession();
        System.out.println("User Name : "+username);
        Query q = session.createQuery("from Admin where userName='"+username+"'");
        int count = q.list().size();
        System.out.println("Count : "+ count);
        if(count>0){
        	System.out.println("inside if ");
        	return true;
        }
		
		return false;
		
	}


	public Admin getAdminByUsername(String username){
		SessionFactory sessionFactory = SessionHelper.getConnection();
        Session session = sessionFactory.openSession();
        Query q = session.createQuery("from Admin where userName='"+username+"'");
        return (Admin) q.list().get(0);
	}
	
}
