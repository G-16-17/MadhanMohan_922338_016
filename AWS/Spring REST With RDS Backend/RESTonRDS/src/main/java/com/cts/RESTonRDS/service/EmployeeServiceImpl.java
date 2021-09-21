package com.cts.RESTonRDS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.RESTonRDS.model.Employee;
import com.cts.RESTonRDS.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public String addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Employee with the Id " + employee.getId() + " added successfully";
	}

}
