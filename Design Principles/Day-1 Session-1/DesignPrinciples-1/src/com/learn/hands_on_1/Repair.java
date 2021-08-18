package com.learn.hands_on_1;

public class Repair implements ProcessPhoneRepair, ProcessAccessoryRepair {

	@Override
	public void processPhoneRepair(String modelname) {
		// TODO Auto-generated method stub
		System.out.println("Phone Repair Accepted");
	}

	@Override
	public void processAccessoryRepair(String accessoryType) {
		// TODO Auto-generated method stub

		System.out.println("Accessory repair accepted");
	}
}
