package com.infinite.hib;

public class Payment {
	private UPI upi;
	private String phoneNumber; 
	private Cards cards;
	private String Wallet;
	
	public UPI getUpi() {
		return upi;
	}
	public void setUpi(UPI upi) {
		this.upi = upi;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Cards getCards() {
		return cards;
	}
	public void setCards(Cards cards) {
		this.cards = cards;
	}
	public String getWallet() {
		return Wallet;
	}
	public void setWallet(String wallet) {
		Wallet = wallet;
	}
	
	@Override
	public String toString() {
		return "Payment [upi=" + upi + ", phoneNumber=" + phoneNumber + ", cards=" + cards + ", Wallet=" + Wallet + "]";
	}
	
	public Payment(UPI upi, String phoneNumber, Cards cards, String wallet) {
		this.upi = upi;
		this.phoneNumber = phoneNumber;
		this.cards = cards;
		Wallet = wallet;
	}
	
	public Payment() {
		
	}
	   
}