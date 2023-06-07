package com.infinite.StudentManagementProject;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "StudentID")
		private int studentID;
		
		@Column(name = "Department")
	    private String department;
		
		@Column(name = "FirstName")
	    private String firstName;
		
		@Column(name = "LastName")
	    private String lastName;
		
		@Column(name = "gender")
		@Enumerated(EnumType.STRING)
	    private Gender gender;
		
		@Column(name = "MobileNo")
	    private String mobileNo;
		
		
		
		@Column(name = "BloodGrp")
	    private String bloodGrp;
		
		@Column(name = "EmailID")
	    private String emailID;
		
		@Column(name = "FatherName")
	    private String fatherName;
		
		@Column(name="FatherMobileNo")
		private String fatherMobileNo;
		
		@Column(name = "MotherName")
	    private String motherName;
		
		@Column(name="MotherMobileNo")
		private String motherMobileNo;
		
		@Column(name = "Class")
	    private String studentClass;
		
		@Column(name = "Acadamicyear")
		private String academicYear;
		
		@Column(name = "Feepaid")
	    private int feePaid;
		
		/**
		 * @return the fatherMobileNo
		 */
		public String getFatherMobileNo() {
			return fatherMobileNo;
		}
		/**
		 * @param fatherMobileNo the fatherMobileNo to set
		 */
		public void setFatherMobileNo(String fatherMobileNo) {
			this.fatherMobileNo = fatherMobileNo;
		}
		/**
		 * @return the motherMobileNo
		 */
		public String getMotherMobileNo() {
			return motherMobileNo;
		}
		/**
		 * @param motherMobileNo the motherMobileNo to set
		 */
		public void setMotherMobileNo(String motherMobileNo) {
			this.motherMobileNo = motherMobileNo;
		}
		/**
		 * @return the academicYear
		 */
		public String getAcademicYear() {
			return academicYear;
		}
		/**
		 * @param academicYear the academicYear to set
		 */
		public void setAcademicYear(String academicYear) {
			this.academicYear = academicYear;
		}
		/**
		 * @return the feePaid
		 */
		public int getFeePaid() {
			return feePaid;
		}
		/**
		 * @param feePaid the feePaid to set
		 */
		public void setFeePaid(int feePaid) {
			this.feePaid = feePaid;
		}
		/**
		 * @return the gender
		 */
		public Gender getGender() {
			return gender;
		}
		/**
		 * @param gender the gender to set
		 */
		public void setGender(Gender gender) {
			this.gender = gender;
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
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}
		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}
		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		/**
		 * @return the mobileNo
		 */
		public String getMobileNo() {
			return mobileNo;
		}
		/**
		 * @param mobileNo the mobileNo to set
		 */
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		
		/**
		 * @return the bloodGrp
		 */
		public String getBloodGrp() {
			return bloodGrp;
		}
		/**
		 * @param bloodGrp the bloodGrp to set
		 */
		public void setBloodGrp(String bloodGrp) {
			this.bloodGrp = bloodGrp;
		}
		/**
		 * @return the emailID
		 */
		public String getEmailID() {
			return emailID;
		}
		/**
		 * @param emailID the emailID to set
		 */
		public void setEmailID(String emailID) {
			this.emailID = emailID;
		}
		/**
		 * @return the fatherName
		 */
		public String getFatherName() {
			return fatherName;
		}
		/**
		 * @param fatherName the fatherName to set
		 */
		public void setFatherName(String fatherName) {
			this.fatherName = fatherName;
		}
		/**
		 * @return the motherName
		 */
		public String getMotherName() {
			return motherName;
		}
		/**
		 * @param motherName the motherName to set
		 */
		public void setMotherName(String motherName) {
			this.motherName = motherName;
		}
		/**
		 * @return the studentClass
		 */
		public String getStudentClass() {
			return studentClass;
		}
		/**
		 * @param studentClass the studentClass to set
		 */
		public void setStudentClass(String studentClass) {
			this.studentClass = studentClass;
		}
		public void setPercentage(double percentage) {
			
			
		}
		
		
		
		
}
