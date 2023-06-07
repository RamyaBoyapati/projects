package com.infinite.StudentManagementProject;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@ManagedBean
@Entity
@Table(name="admin")
public class Admin {
	
	@Id
    @Column(name="AdminID")
	private int adminID;
    
    @Column(name="UserName")
	private String userName;
    
    @Column(name="Password")
	private String password;
    
    @Column(name="securityqns")
    private String securityqns;
    /**
	 * @return the securityqns
	 */
	public String getSecurityqns() {
		return securityqns;
	}

	/**
	 * @param securityqns the securityqns to set
	 */
	public void setSecurityqns(String securityqns) {
		this.securityqns = securityqns;
	}

	/**
	 * @return the answers
	 */
	public String getAnswers() {
		return answers;
	}

	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(String answers) {
		this.answers = answers;
	}

	@Column(name="answers")
	private String answers;

	/**
	 * @return the adminID
	 */
	public int getAdminID() {
		return adminID;
	}

	/**
	 * @param adminID the adminID to set
	 */
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	

	public Admin(int adminID, String userName, String password) {
		this.adminID = adminID;
		this.userName = userName;
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", userName=" + userName + ", password=" + password + ", securityqns="
				+ securityqns + ", answers=" + answers + "]";
	}

	public Admin() {
		
	}
    
  

	
    

	
	
	}

	
	
	
    
	
	
	
	
	
	
	

