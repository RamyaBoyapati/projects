package com.infinite.hib;

public class Customer {
	private int customerid;
	private String customerName;
	private String CustomerPhoneNo;
	private Gender gender;
	private String address1;
	private String address2;
	private String zipcode;
	private String city;
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhoneNo() {
		return CustomerPhoneNo;
	}
	public void setCustomerPhoneNo(String customerPhoneNo) {
		CustomerPhoneNo = customerPhoneNo;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Customer() {
		
	}
	
	public Customer(int customerid, String customerName, String customerPhoneNo, Gender gender, String address1,
			String address2, String zipcode, String city) {
		this.customerid = customerid;
		this.customerName = customerName;
		CustomerPhoneNo = customerPhoneNo;
		this.gender = gender;
		this.address1 = address1;
		this.address2 = address2;
		this.zipcode = zipcode;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + ", CustomerPhoneNo="
				+ CustomerPhoneNo + ", address1=" + address1 + ", address2=" + address2 + ", zipcode=" + zipcode
				+ ", city=" + city + "]";
	}

}
