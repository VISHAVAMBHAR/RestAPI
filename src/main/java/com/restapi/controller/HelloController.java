package com.restapi.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.Employee;

@RestController
public class HelloController {
	//RestController =  Controller + ResponseBody
	
	/*
	 * ResponseBody responsible to convert java object into json Format.
	 * 
	 * emp = new Employee();
	 * emp.setempId(124);
	 * emp.setempName(Ram)
	 * 
	 * Json Format
	 * 
	 * {
	 * 		"empId":124,
	 * 		"empName":"Ram"
	 * }
	 */
	@RequestMapping("/hello")
	public String hello() {
		
		return "<H1>VISHAVAMBHAR</H1>";
	}
	
	@RequestMapping("/emp")
	public Employee getEmp() {
		
		Employee emp=new Employee();
		emp.setEmpId(101);
		emp.setEmpName("VISH");
		emp.setEmpSalary(80000);
		
		return emp;
	}

}
