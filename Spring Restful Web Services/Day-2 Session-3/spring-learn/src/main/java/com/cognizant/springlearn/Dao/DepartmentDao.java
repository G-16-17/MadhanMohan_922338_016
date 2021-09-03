package com.cognizant.springlearn.Dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.springlearn.model.Department;

@Component
public class DepartmentDao {

	private static ArrayList<Department> DEPARTMENT_LIST;

	public DepartmentDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		DEPARTMENT_LIST = (ArrayList<Department>) context.getBean("departmentList");
	}

	public ArrayList<Department> getAllDepartments() {
		return DEPARTMENT_LIST;
	}

}
