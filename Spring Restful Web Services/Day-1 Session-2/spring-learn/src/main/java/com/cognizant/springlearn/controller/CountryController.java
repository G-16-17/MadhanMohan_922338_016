package com.cognizant.springlearn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@RestController
public class CountryController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	@Autowired
	CountryService countryService;

	@RequestMapping(path = "/country")
	public Country getCountryIndia() {
		LOGGER.info("Start");
		LOGGER.info("End");
		return this.countryService.getCountryIndia();

	}

	@GetMapping("/countries")
	public List<Country> getAllCountries() {
		LOGGER.info("Start");
		LOGGER.info("End");
		return this.countryService.getAllCountries();

	}

	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
		LOGGER.info("Start");
		LOGGER.info("End");
		return this.countryService.getCountry(code);

	}
}
