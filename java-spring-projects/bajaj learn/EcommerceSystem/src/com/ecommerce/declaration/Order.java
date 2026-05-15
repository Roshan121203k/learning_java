package com.ecommerce.declaration;

import com.ecommerce.exception.InvalidOrderException;

public interface Order {
	void placeOrder();
	void cancelOrder(int orderId) throws  InvalidOrderException;
}
