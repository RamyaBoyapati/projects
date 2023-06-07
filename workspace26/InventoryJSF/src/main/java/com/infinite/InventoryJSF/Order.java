package com.infinite.InventoryJSF;

import java.sql.Date;

public class Order {
	
	private String orderId;
	private String userName;
	private String stockId;
	private OrderStatus orderStatus;
	private  int quantityOrder;
	private Date orderedDate;
	private Date shippingDate;
	private Date deliveryDate;
	private Date expecteddeliveryDate;
	private Double totalPrice;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getQuantityOrder() {
		return quantityOrder;
	}
	public void setQuantityOrder(int quantityOrder) {
		this.quantityOrder = quantityOrder;
	}
	public Date getOrderedDate() {
		return orderedDate;
	}
	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}
	public Date getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getExpecteddeliveryDate() {
		return expecteddeliveryDate;
	}
	public void setExpecteddeliveryDate(Date expecteddeliveryDate) {
		this.expecteddeliveryDate = expecteddeliveryDate;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	public Order(String orderId, String userName, String stockId, OrderStatus orderStatus, int quantityOrder,
			Date orderedDate, Date shippingDate, Date deliveryDate, Date expecteddeliveryDate, Double totalPrice) {
		super();
		this.orderId = orderId;
		this.userName = userName;
		this.stockId = stockId;
		this.orderStatus = orderStatus;
		this.quantityOrder = quantityOrder;
		this.orderedDate = orderedDate;
		this.shippingDate = shippingDate;
		this.deliveryDate = deliveryDate;
		this.expecteddeliveryDate = expecteddeliveryDate;
		this.totalPrice = totalPrice;
	}
	
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userName=" + userName + ", stockId=" + stockId + ", orderStatus="
				+ orderStatus + ", quantityOrder=" + quantityOrder + ", orderedDate=" + orderedDate + ", shippingDate="
				+ shippingDate + ", deliveryDate=" + deliveryDate + ", expecteddeliveryDate=" + expecteddeliveryDate
				+ ", totalPrice=" + totalPrice + "]";
	}
	
	

	
}
