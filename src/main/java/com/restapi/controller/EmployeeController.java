package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.Service.EmployeeService;
import com.restapi.model.Employee;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	/*
	 * @RequestBody convert json to java object
	 */
	
	@PostMapping(value = "/save")
	public Employee addEmp(@RequestBody Employee emp) {
		
		return employeeService.addEmployee(emp);
		
	}
	/*
	 * @PathVariable used to retrieve data from the URL path
	 */
	
	@PutMapping(value = "/update/{empId}")
	public Employee updateEmp(@PathVariable("empId") int empId, @RequestBody Employee emp) {
		
		
		return employeeService.updateEmployee(empId, emp);
		
	}
	
	@DeleteMapping(value = "/delete/{empId}")
	public void deleteEmp(@PathVariable("empId") int empId) {

		employeeService.deleteEmployee(empId);
		
	}
	
	@GetMapping(value = "/byId/{empId}")
	public Employee getEmployeeById(@PathVariable("empId") int empId) {
		
		return 	employeeService.findEmployeeById(empId);
		
	}
	
	@GetMapping(value = "/all")
	public List<Employee> getAllEmployee() {
		
		return 	employeeService.findAllEmployee();
		
	}

	
}
