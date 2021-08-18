package com.learn.SingletonPattern;

public class DBConn {

	private static DBConn instance = new DBConn();

	private DBConn() {

	}

	public static DBConn getInstance() {
		return instance;
	}

	public void showMsg() {
		System.out.println("Singleton Pattern created");
	}
}
