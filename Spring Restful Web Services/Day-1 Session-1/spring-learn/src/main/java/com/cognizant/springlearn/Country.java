package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private String code;
	private String name;

	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

	public Country() {
		LOGGER.debug("Inside Country Constructor");
	}

	public String getCode() {
		LOGGER.debug("Inside Country getCode()");
		return code;
	}

	public void setCode(String code) {
		LOGGER.debug("Inside Country setCode()");
		this.code = code;
	}

	public String getName() {
		LOGGER.debug("Inside Country getName()");
		return name;
	}

	public void setName(String name) {
		LOGGER.debug("Inside Country setName()");
		this.name = name;
	}

	public static Logger getLogger() {
		LOGGER.debug("Inside Country getLogger()");
		return LOGGER;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}

}
