package com.infinite.inventorymanagement;

public class StockDetails {
	 private String stockid;
	 private String itemName;
	 private int price;
	 private int quantityAvail;
	@Override
	public String toString() {
		return "StockDetails [stockid=" + stockid + ", itemName=" + itemName + ", price=" + price + ", quantityAvail="
				+ quantityAvail + "]";
	}
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantityAvail() {
		return quantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		this.quantityAvail = quantityAvail;
	}
	public StockDetails(String stockid, String itemName, int price, int quantityAvail) {
		super();
		this.stockid = stockid;
		this.itemName = itemName;
		this.price = price;
		this.quantityAvail = quantityAvail;
	}
	public StockDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
     
	 
}
