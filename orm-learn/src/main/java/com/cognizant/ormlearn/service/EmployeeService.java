package com.cognizant.ormlearn.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepository;
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

	@Transactional
	public Employee get(int id) {
		LOGGER.info("Start");
		return empRepository.findById(id).get();
	}

	@Transactional
	public Employee set(int id) {
		LOGGER.info("Start");
		return empRepository.findById(id).get();
	}

	@Transactional
	public void save(Employee employee) {
		LOGGER.info("Start");
		empRepository.save(employee);
		LOGGER.info("End");
	}
}
