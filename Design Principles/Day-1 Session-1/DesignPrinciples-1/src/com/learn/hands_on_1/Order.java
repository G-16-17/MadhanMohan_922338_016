package com.learn.hands_on_1;

public class Order implements ProcessOrder {

	@Override
	public void processOrder(String modelName) {
		System.out.println("Order Accepted");

	}

}
