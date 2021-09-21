package com.cts.RESTonRDS.service;

import java.util.List;

import com.cts.RESTonRDS.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();

	String addEmployee(Employee employee);
}
