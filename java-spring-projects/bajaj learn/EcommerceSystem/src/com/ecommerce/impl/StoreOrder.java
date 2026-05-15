package com.ecommerce.impl;

import com.ecommerce.declaration.Order;
import com.ecommerce.exception.InvalidOrderException;
//
//Class 2: StoreOrder
// Description
//Represents orders placed in physical store.
// Attributes
//* orderId
//* productName
//* amount
//* storeLocation
//* status
// Behavior
//* placeOrder()
//* cancelOrder()
public class StoreOrder implements Order{
	private int orderId;
	private String productName;
	private double amount;
	private String storeLocation;
	private String status;
	
	public StoreOrder(int orderId, String productName, double amount, String storeLocation) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.amount = amount;
		this.storeLocation = storeLocation;
		this.status = "None";
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStoreLocation() {
		return storeLocation;
	}

	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public void placeOrder() {
		status = "Placed";
		System.out.println("order is Placed");
		
	}

	@Override
	public void cancelOrder(int orderId) throws InvalidOrderException {
		if(orderId < 0) {
			throw new InvalidOrderException("order id cannot be less than zero");
		}
		if(status != "Placed" || status == "Cancelled") {
			throw new InvalidOrderException("error in Store Order");
		}
		status = "Cancelled";
		System.out.println("order Cancelled");
	}
	
}
