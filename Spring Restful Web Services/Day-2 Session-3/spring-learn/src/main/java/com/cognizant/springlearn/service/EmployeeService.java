package com.cognizant.springlearn.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.cognizant.springlearn.Dao.EmployeeDao;
import com.cognizant.springlearn.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;

	@GetMapping("/employees")
	public ArrayList<Employee> getAllEmployees() {
		return this.employeeDao.getAllEmployees();
	}

}
