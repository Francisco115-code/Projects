package com.ibm.fscc.employeeservice.controller;

// SpringBoot Framework Imports 
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

// 3 Classes imported from employee service package to use their properties
import com.ibm.fscc.employeeservice.data.EmployeeStorage;
import com.ibm.fscc.employeeservice.data.EmployeeDAO;
import com.ibm.fscc.employeeservice.data.EmployeeEntity;

// http://localhost:8080/employee/status/check url for Springboot

// Creating the REST controller
@RestController
@RequestMapping(path = "/employeestorage")
public class EmployeeController {

	@Autowired
	private EmployeeDAO employeeDao;
	// Implementing a GET method
	// to get the list of all
	// the employees

	@GetMapping(path = "/", produces = "application/json")

	public EmployeeStorage getEmployeeStorage() {
		return employeeDao.getAllEmployees();
	}

	// Create a POST method
	// to add an employee
	// to the list
	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")

	public ResponseEntity<Object> addEmployee(@RequestBody EmployeeEntity employeeEntity)

	{
		{

			// Creating an ID of an employee
			// from the number of employees
			Integer employeeId = employeeDao
					.getAllEmployees()
					.getEmployeeList()
					.size()
					+ 1;

			employeeEntity.setEmployeeId(employeeId);

			employeeDao
					.addEmployee(employeeEntity);

			URI location = ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(
							employeeEntity.getEmployeeId())
					.toUri();

			return ResponseEntity
					.created(location)
					.build();
		}
	}
	// Pre loaded Code commented out for standby of testing new code
	// @GetMapping(value = "/status/check")
	// public String status() {
	// return "Working on port " + env.getProperty("server.port") + "!";
	// }

}
