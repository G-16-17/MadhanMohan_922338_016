package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	static ApplicationContext context1 = new ClassPathXmlApplicationContext("country.xml");

	public static void displayDate() throws ParseException {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		Date date = format.parse("31/12/2018");
		System.out.println(date);

		LOGGER.info("End");
	}

	public static void displayCountry() {

		Country country = (Country) context1.getBean("country", Country.class);
		Country anotherCountry = context1.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());
		LOGGER.debug("Country : {}", anotherCountry.toString());
		LOGGER.debug("----------------------------");
	}

	public static void displayCountries() {

		ArrayList<Country> country2 = (ArrayList<Country>) context1.getBean("countryList", ArrayList.class);

		for (Country country1 : country2) {
			LOGGER.debug("Country : {}", country1.toString());
		}
	}

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(SpringLearnApplication.class, args);

		displayDate();
		displayCountry();
		displayCountries();
	}

}
