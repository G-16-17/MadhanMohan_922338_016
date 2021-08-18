package com.designpattern.AdapterPattern;

public class CarDetails {

	public static void main(String[] args) {
		BugattiVeyron bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiMovableAdapter = new MovableAdapterImpl(bugattiVeyron);
		System.out.println(bugattiMovableAdapter.getSpeed());
		System.out.println(bugattiMovableAdapter.getPrice());
	}

}
