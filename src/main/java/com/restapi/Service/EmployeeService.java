package com.restapi.Service;

import java.util.List;

import com.restapi.model.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee emp);
	
	Employee updateEmployee(int empId, Employee emp);
	
	void deleteEmployee(int empId);
	
	Employee findEmployeeById(int empId);
	
	List<Employee> findAllEmployee();

}
