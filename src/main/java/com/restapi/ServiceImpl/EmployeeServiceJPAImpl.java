package com.restapi.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.Service.EmployeeService;
import com.restapi.model.Employee;
import com.restapi.repository.EmployeeRespository;

@Service
public class EmployeeServiceJPAImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRespository employeeRespository;

	@Override
	public Employee addEmployee(Employee emp) {
		
		return employeeRespository.save(emp);
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		Employee oldemp=employeeRespository.findById(empId).orElse(null);
		if(oldemp!=null) {
			oldemp.setEmpName(emp.getEmpName());
			oldemp.setEmpSalary(emp.getEmpSalary());
			
			return employeeRespository.save(oldemp);
		}
		return null;
		
	}

	@Override
	public void deleteEmployee(int empId) {
		
		employeeRespository.deleteById(empId);
		
	}

	@Override
	public Employee findEmployeeById(int empId) {
		
		return employeeRespository.findById(empId).orElse(null);
	}

	@Override
	public List<Employee> findAllEmployee() {
		
		return employeeRespository.findAll();
	}

}
