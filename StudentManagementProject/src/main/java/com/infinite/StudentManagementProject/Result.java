package com.infinite.StudentManagementProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "results")
public class Result {
    @Id
    @Column(name = "StudentID")
    private int studentID;

    @Column(name = "Department")
    private String department;

    @Column(name = "Sanskrit")
    private int sanskrit;

    @Column(name = "English")
    private int english;

    @Column(name = "Mathematics1")
    private int mathematics1;

    @Column(name = "Mathematics2")
    private int mathematics2;

    @Column(name = "Biology")
    private int biology;

    @Column(name = "Zoology")
    private int zoology;

    @Column(name = "Physics")
    private int physics;

    @Column(name = "Chemistry")
    private int chemistry;

    @Column(name = "TotalMarks")
    private int totalMarks;

    @Column(name = "Percentage")
    private float percentage;

    // Constructors, getters, and setters

    public Result() {
    }

	/**
	 * @return the studentID
	 */
	public int getStudentID() {
		return studentID;
	}

	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the sanskrit
	 */
	public int getSanskrit() {
		return sanskrit;
	}

	/**
	 * @param sanskrit the sanskrit to set
	 */
	public void setSanskrit(int sanskrit) {
		this.sanskrit = sanskrit;
	}

	/**
	 * @return the english
	 */
	public int getEnglish() {
		return english;
	}

	/**
	 * @param english the english to set
	 */
	public void setEnglish(int english) {
		this.english = english;
	}

	/**
	 * @return the mathematics1
	 */
	public int getMathematics1() {
		return mathematics1;
	}

	/**
	 * @param mathematics1 the mathematics1 to set
	 */
	public void setMathematics1(int mathematics1) {
		this.mathematics1 = mathematics1;
	}

	/**
	 * @return the mathematics2
	 */
	public int getMathematics2() {
		return mathematics2;
	}

	/**
	 * @param mathematics2 the mathematics2 to set
	 */
	public void setMathematics2(int mathematics2) {
		this.mathematics2 = mathematics2;
	}

	/**
	 * @return the biology
	 */
	public int getBiology() {
		return biology;
	}

	/**
	 * @param biology the biology to set
	 */
	public void setBiology(int biology) {
		this.biology = biology;
	}

	/**
	 * @return the zoology
	 */
	public int getZoology() {
		return zoology;
	}

	/**
	 * @param zoology the zoology to set
	 */
	public void setZoology(int zoology) {
		this.zoology = zoology;
	}

	/**
	 * @return the physics
	 */
	public int getPhysics() {
		return physics;
	}

	/**
	 * @param physics the physics to set
	 */
	public void setPhysics(int physics) {
		this.physics = physics;
	}

	/**
	 * @return the chemistry
	 */
	public int getChemistry() {
		return chemistry;
	}

	/**
	 * @param chemistry the chemistry to set
	 */
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	/**
	 * @return the totalMarks
	 */
	public int getTotalMarks() {
		return totalMarks;
	}

	/**
	 * @param totalMarks the totalMarks to set
	 */
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	/**
	 * @return the percentage
	 */
	public float getPercentage() {
		return percentage;
	}

	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public Result(int studentID, String department, int sanskrit, int english, int mathematics1, int mathematics2,
			int biology, int zoology, int physics, int chemistry, int totalMarks, float percentage) {
		super();
		this.studentID = studentID;
		this.department = department;
		this.sanskrit = sanskrit;
		this.english = english;
		this.mathematics1 = mathematics1;
		this.mathematics2 = mathematics2;
		this.biology = biology;
		this.zoology = zoology;
		this.physics = physics;
		this.chemistry = chemistry;
		this.totalMarks = totalMarks;
		this.percentage = percentage;
	}

	

	
    
}