package com.designpattern.AbstractFactory;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Mention Factory Name:");
		Scanner sc = new Scanner(System.in);
		Factory factory;
		String processOption = sc.nextLine();
		String factoryDetail = "";
		switch (processOption) {
		case "Mercedes":
			System.out.println("please provide the part name");
			factoryDetail = sc.nextLine();
			factory = new MercedesFactory();
			if (factoryDetail.equalsIgnoreCase("headlight")) {
				factory.makeHeadlight().show();
			} else if (factoryDetail.equalsIgnoreCase("tire")) {
				factory.makeTire().show();
			}
			break;
		case "Audi":
			System.out.println("please provide the part name");
			factoryDetail = sc.nextLine();
			factory = new AudiFactory();
			if (factoryDetail.equalsIgnoreCase("headlight")) {
				factory.makeHeadlight().show();
			} else if (factoryDetail.equalsIgnoreCase("tire")) {
				factory.makeTire().show();
			}
			break;
		default:
			break;
		}
	}

}
