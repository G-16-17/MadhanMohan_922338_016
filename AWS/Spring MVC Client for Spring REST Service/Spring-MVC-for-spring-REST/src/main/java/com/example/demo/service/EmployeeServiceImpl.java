package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return employee;

	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee existingEmployee = new Employee();
		existingEmployee.setAge(employee.getAge());
		existingEmployee.setGender(employee.getGender());
		existingEmployee.setName(employee.getName());
		existingEmployee.setSalary(employee.getSalary());
		employeeRepository.save(existingEmployee);

		return existingEmployee;

	}

	@Override
	public void deleteEmployee(int id) {

		employeeRepository.deleteById(id);

	}
}
