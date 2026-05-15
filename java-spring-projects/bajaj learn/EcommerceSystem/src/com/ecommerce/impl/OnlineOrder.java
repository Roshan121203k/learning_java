package com.ecommerce.impl;

import com.ecommerce.declaration.Order;
import com.ecommerce.exception.InvalidOrderException;

//Class 1: OnlineOrder
//Description
//Represents orders placed through website/app.
//Attributes
//* orderId (int)
//* productName (String)
//* amount (double)
//* deliveryAddress (String)
//* status (String)
//Behavior
//* placeOrder() → sets status = "Placed"
//* cancelOrder() → changes status = "Cancelled"
public class OnlineOrder implements Order
{
	int orderId;
	String prdouctName;
	double amount;
	String deliveryAddress;
	String status;
	@Override
	public void placeOrder() {
		this.status = "Placed";
		System.out.println("status placed");
		
	}
	public OnlineOrder(int orderId, String prdouctName, double amount, String deliveryAddress) {
		super();
		this.orderId = orderId;
		this.prdouctName = prdouctName;
		this.amount = amount;
		this.deliveryAddress = deliveryAddress;
		this.status = "None";
	}
	@Override
	public void cancelOrder(int orderId) throws InvalidOrderException {
		if(!status.equals("Placed") || status.equals("Canceled")) {
			throw new InvalidOrderException("order is not placed yet");
			
		}
		this.status = "Canceled";
		System.out.println("order is Canceled");
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getPrdouctName() {
		return prdouctName;
	}
	public void setPrdouctName(String prdouctName) {
		this.prdouctName = prdouctName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
