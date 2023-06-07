package com.infinite.EmployeeProject;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employe {
	@Id
	@Column(name="empID")
	private int empID;
	
	@Column(name="name")
    private String name;
	
	@Column(name="designation")
    private String designation;
	
	@Column(name="salary")
    private double salary;
	
	@Column(name="age")
    private int age;
	
	@Column(name="experience")
    private int experience;
	
	@Column(name="dateofjoining")
    private Date dateOfJoining;
    
    
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	public Employe() {
	}
	
	public Employe(int empID, String name, String designation, double salary, int age, int experience,
			Date dateOfJoining) {
		super();
		this.empID = empID;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.age = age;
		this.experience = experience;
		this.dateOfJoining = dateOfJoining;
	}
	@Override
	public String toString() {
		return "Employe [empID=" + empID + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", age=" + age + ", experience=" + experience + ", dateOfJoining=" + dateOfJoining + "]";
	}
    
    
}
