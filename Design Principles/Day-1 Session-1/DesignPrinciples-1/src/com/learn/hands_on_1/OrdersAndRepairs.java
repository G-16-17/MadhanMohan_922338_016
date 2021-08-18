package com.learn.hands_on_1;

import java.util.Scanner;

public class OrdersAndRepairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to our site.Would you like to order or repair?");
		Scanner sc = new Scanner(System.in);

		String processOption = sc.nextLine();
		String productDetail = "";
		switch (processOption) {
		case "order":
			System.out.println("please provide the phone model name");
			productDetail = sc.nextLine();
			Order order = new Order();
			order.processOrder(productDetail);
			break;
		case "repair":
			System.out.println("Is it the phone or the accessory that you want to be replaced");
			String productType = sc.nextLine();
			if (productType.equalsIgnoreCase("phone")) {
				System.out.println("please provide the phone model name");
				productDetail = sc.nextLine();
				Repair phoneRepair = new Repair();
				phoneRepair.processPhoneRepair(productDetail);
			} else {
				System.out.println("please provide the accessory detail, like headphone,tempered glass");
				productDetail = sc.nextLine();
				Repair accessoryRepair = new Repair();
				accessoryRepair.processAccessoryRepair(productType);
			}
			break;
		default:
			break;
		}
	}

}
