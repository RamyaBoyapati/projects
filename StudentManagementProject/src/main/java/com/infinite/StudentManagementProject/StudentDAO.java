package com.infinite.StudentManagementProject;


import java.sql.Connection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;





import org.hibernate.Criteria;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.criterion.Restrictions;



public class StudentDAO {
	SessionFactory sessionFactory;
	private Student student;
	

	
	
	public String addStudent(Student student) {
		 
		
//		if (!isValidEmail(student.getEmailID())) {
//            return "Invalid email address";
//        }
//        if (!isValidPhoneNumber(student.getMobileNo())) {
//            return "Invalid mobile number";
//        }
//        if (!isValidName(student.getFirstName())) {
//            return "Invalid first name";
//        }
//        if (!isValidName(student.getLastName())) {
//            return "Invalid last name";
//        }
//        if (!isValidPhoneNumber(student.getFatherMobileNo())) {
//            return "Invalid father's mobile number";
//        }
//        if (!isValidPhoneNumber(student.getMotherMobileNo())) {
//            return "Invalid mother's mobile number";
//        }
	    sessionFactory = SessionHelper.getConnection();
	    Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        Query query = session.createQuery("SELECT MAX(s.studentID) FROM Student s");
        Integer maxStudentID = (Integer) query.uniqueResult();
        int newStudentID = maxStudentID != null ? maxStudentID + 1 : 1;
        
        // Set the new studentID for the student object
        student.setStudentID(newStudentID);
        session.save(student);
        tr.commit();
        session.close();
        return "Student details added";
	}
//	public void addPercentageToStu(int studentId, float percentage){
//	    List<Student> students = searchStudentsByStudentID(studentId);
//	    
//	    if (students.isEmpty()) {
//	        System.out.println("No student found with the given ID.");
//	        return;
//	    }
//
//	    System.out.println("Size : " + students.size());
//	    System.out.println("List : " + students.get(students.size() - 1));
//
//	    sessionFactory = SessionHelper.getConnection();
//	    Session session = sessionFactory.openSession();
//	    Transaction tr = session.beginTransaction();
//	    
//	    Student student = students.get(students.size() - 1);
//	    Result result = new Result();
//	    result.setStudentID(studentId);
//	    result.setPercentage(percentage);
//	   // student.getResults().add(result);
//	    
//	    session.update(student);
//	    tr.commit();
//	    session.close();
//	}
    
    
	
	


	public void save(Student student) {
        if (!isValidEmail(student.getEmailID())) {
            throw new IllegalArgumentException("Invalid email address");
        }
        if (!isValidPhoneNumber(student.getMobileNo())) {
            throw new IllegalArgumentException("Invalid mobile number");
        }
        if (!isValidName(student.getFirstName())) {
            throw new IllegalArgumentException("Invalid first name");
        }
        if (!isValidName(student.getLastName())) {
            throw new IllegalArgumentException("Invalid last name");
        }
        sessionFactory = SessionHelper.getConnection();
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        session.save(student);
        trans.commit();
        session.close();
    }

    private boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\+(?:[0-9] ?){6,14}[0-9]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    private boolean isValidName(String name) {
        String regex = "^[a-zA-Z\\s]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public String getDepartmentById(int studentId) {
        sessionFactory = SessionHelper.getConnection();
        Session session = sessionFactory.openSession();
        Student student = (Student) session.get(Student.class, studentId);
        String departmentName = student.getDepartment();
        return departmentName;
    }

    public Student getStudentById(Integer studentId) {
        sessionFactory = SessionHelper.getConnection();
        Session session = sessionFactory.openSession();
        Student student = (Student) session.get(Student.class, studentId);
        return student;
    }
    
    
    public List<Student> getAllStudents() {
        sessionFactory = SessionHelper.getConnection();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        List<Student> students = new ArrayList<>();

        try {
            transaction = session.beginTransaction();

            Criteria criteria = session.createCriteria(Student.class);

            students = criteria.list();

            transaction.commit();
            
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return students;
    }
    
    public List<Student> searchStudentsByBoth(int studentIDParam, String firstNameParam) {
        sessionFactory = SessionHelper.getConnection();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        List<Student> students = new ArrayList<>();

        try {
            transaction = session.beginTransaction();

            Criteria criteria = session.createCriteria(Student.class);
            criteria.add(Restrictions.eq("studentID", studentIDParam));
            criteria.add(Restrictions.eq("firstName", firstNameParam));

            students = criteria.list();

            transaction.commit();
            Student student=new Student();
            
        } catch (Exception e){
        	if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return students;
    }

    public List<Student> searchStudentsByStudentID(int studentIDParam) {
        sessionFactory = SessionHelper.getConnection();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        List<Student> students = new ArrayList<>();

        try {
            transaction = session.beginTransaction();

            Criteria criteria = session.createCriteria(Student.class);
            criteria.add(Restrictions.eq("studentID", studentIDParam));

            students = criteria.list();

            transaction.commit();
            Student student=new Student();
            
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return students;
    }

    public List<Student> searchStudentsByFirstName(String firstNameParam) {
        sessionFactory = SessionHelper.getConnection();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        List<Student> students = new ArrayList<>();

        try {
            transaction = session.beginTransaction();

            Criteria criteria = session.createCriteria(Student.class);
            criteria.add(Restrictions.eq("firstName", firstNameParam));

            students = criteria.list();

            transaction.commit();
            Student student=new Student();
            
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return students;
    }
    public List<Student> sortStudents(List<Student> students, String sortColumn, String sortOrder) {
        Comparator<Student> comparator = null;
        switch (sortColumn) {
            case "studentID":
                comparator = Comparator.comparingInt(Student::getStudentID);
                break;
            case "firstName":
                comparator = Comparator.comparing(Student::getFirstName);
                break;
            case "lastName":
                comparator = Comparator.comparing(Student::getLastName);
                break;
            case "department":
                comparator = Comparator.comparing(Student::getDepartment);
                break;
            case "academicYear":
                comparator = Comparator.comparing(Student::getAcademicYear);
                break;
           
            default:
                break;
        }

        if (comparator != null) {
            if (sortOrder.equals("desc")) {
                comparator = comparator.reversed();
            }
            students.sort(comparator);
        }

        return students;
    }
    public Student getStudentDetails(int studentID, String department) {
        Student student = null;
        try {
            sessionFactory = SessionHelper.getConnection();
            Session session = sessionFactory.openSession();
            Transaction tr = session.beginTransaction();

            // Retrieve student details and percentage from the Results table
            String hql = "SELECT s, r.percentage FROM Student s LEFT JOIN s.results r WHERE s.studentID = :studentID AND s.department = :department";
            Query query = session.createQuery(hql);
            query.setParameter("studentID", studentID);
            query.setParameter("department", department);
            Object[] result = (Object[]) query.uniqueResult();

            if (result != null) {
                student = (Student) result[0];
                double percentage = (Double) result[1];
                student.setPercentage(percentage);
            }

            tr.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
        return student;
    }
    
    public int getstudentid(){
    	 sessionFactory = SessionHelper.getConnection();
         Session session = sessionFactory.openSession();
         Transaction tr = session.beginTransaction();
         Query query = session.createQuery("FROM Student");
         List<Student>list=query.list();
         int count=list.get(list.size()-1).getStudentID();
		return count+1;
    	
    }
}
       







