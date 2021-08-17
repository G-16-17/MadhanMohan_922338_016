package com.cognizant.ormlearn;

import java.math.BigDecimal;
import java.util.Date;
import java.text.SimpleDateFormat;
//import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.context.ApplicationContext;

//import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
//import com.cognizant.ormlearn.model.Stock;
//import com.cognizant.ormlearn.repository.StockRepository;
//import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;
//import com.cognizant.ormlearn.service.StockService;
//import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
//	private static CountryService service;
//	private static StockService stockService;
   
	
	@Autowired
	private static EmployeeService employeeService;
	@Autowired
	private static DepartmentService departmentService;
	@Autowired
	private static SkillService skillService;

	private static void testGetEmployee() {

		LOGGER.info("Start");
		Employee employee = employeeService.get(1);
		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.info("End");

	}

	private static void testAddEmployee() throws Exception {
		LOGGER.info("Start");
		Employee employee = new Employee();
		employee.setName("Sindhu");
		employee.setSalary(new BigDecimal(99999));
		employee.setPermanent(true);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dob =  sdf.parse("02/07/2000");
		employee.setDateOfBirth(dob);
		employee.setDepartment(departmentService.get(1));
		employeeService.save(employee);
		LOGGER.info("End");

	}

	private static void testUpdateEmployee() {
		LOGGER.info("Start");
		Employee employee = employeeService.get(5);
		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		employee.setDepartment(departmentService.get(2));
		employeeService.save(employee);
	}

	private static void testgetDepartment() {
		LOGGER.info("Start");
		Department department = departmentService.get(3);
		LOGGER.debug("Department:{}", department);
		LOGGER.debug("Employee:{}", department.getEmployeeList());
		LOGGER.info("End");

	}

	private static void testgetEmployee() {
		LOGGER.info("Start");
		Employee employee = employeeService.get(2);
		LOGGER.debug("Employee:{}", employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.debug("Skill:{}", employee.getSkillList());
		employeeService.save(employee);

	}

	private static void testAddSkillToEmployee() {
		LOGGER.info("Start");
		Employee employee = employeeService.get(1);
		Skill skill = skillService.get(3);
		employee.getSkillList().add(skill);

		employeeService.save(employee);

	}
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		LOGGER.info("Application Started");
		
		
		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);
		skillService = context.getBean(SkillService.class);
		testAddSkillToEmployee();
		testgetEmployee();
		testgetDepartment();
		departmentService=context.getBean(DepartmentService.class);
		testGetEmployee();
	    testAddEmployee();
		testUpdateEmployee();
		
//		stockService = context.getBean(StockService.class);
//		List<Stock> stockList = stockService.getAllStock("FB", 9, 2009);
//		LOGGER.info("Stock: {}", stockList);
//
//		/*
//		 * service = context.getBean(CountryService.class);
//		 * 
//		 * testGetAllCountries(); testAddCountry(); testUpdateCountry();
//		 * testDeleteCountry();
//		 */
//	}
//
//	public static void testGetAllCountries() {
//		LOGGER.info("Start");
////		List<Country> countryList = service.getAllCountries();
////		LOGGER.info("Countries : {}",countryList);
////		LOGGER.info("End");
//		try {
//			Country country = service.findCountryByCode("IN");
//			LOGGER.info("COuntry : {}", country);
//		} catch (CountryNotFoundException e) {
//			LOGGER.error(e.getMessage());
//		}
//		LOGGER.info("End");
//	}
//
//	public static void testAddCountry() {
//		LOGGER.info("Start");
//		Country country = new Country("MM", "New Country");
//		service.addCountry(country);
//		LOGGER.info("END");
//	}
//
//	public static void testUpdateCountry() {
//		LOGGER.info("STrat");
//		try {
//			service.updateCountry("MM", "New Country Modified");
//		} catch (CountryNotFoundException e) {
//			LOGGER.error(e.getMessage());
//		}
//		LOGGER.info("end");
//	}
//
//	public static void testDeleteCountry() {
//		LOGGER.info("STrat");
//		service.deleteCountry("MM");
//		LOGGER.info("end");
//	}

   } 
}