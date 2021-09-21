package com.cts.RESTonRDS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.RESTonRDS.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
