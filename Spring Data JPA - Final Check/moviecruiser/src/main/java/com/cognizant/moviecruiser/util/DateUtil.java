package com.cognizant.moviecruiser.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static Date convertToDate(String date) throws ParseException {

		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = formater.parse(date);
		return date1;
	}

}
