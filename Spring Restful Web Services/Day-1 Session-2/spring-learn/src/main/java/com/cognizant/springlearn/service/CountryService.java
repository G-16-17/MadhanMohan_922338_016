package com.cognizant.springlearn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

	public Country getCountryIndia() {
		Country country = (Country) context.getBean("country", Country.class);
		return country;

	}

	public List<Country> getAllCountries() {

		List<Country> country2 = (ArrayList<Country>) context.getBean("countryList", ArrayList.class);

		return country2;
	}

	public Country getCountry(String code) throws CountryNotFoundException {
		// Country c = null;
		List<Country> list = (ArrayList<Country>) context.getBean("countryList", ArrayList.class);
		for (Country country : list) {
			if (country.getCode().equalsIgnoreCase(code)) {
				return country;
			}
		}
		throw new CountryNotFoundException();
	}

}
