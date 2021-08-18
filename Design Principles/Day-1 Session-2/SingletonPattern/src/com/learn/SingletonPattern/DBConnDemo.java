package com.learn.SingletonPattern;

public class DBConnDemo {

	public static void main(String[] args) {

		DBConn dbconn = DBConn.getInstance();
		dbconn.showMsg();
	}

}
