package com.loan.springmvc.service;

import java.util.List;

import com.loan.springmvc.model.Employee;

public interface EmployeeService {

	Employee findById(int id);
	
	void saveEmployee(Employee user);
	
	void updateEmployee(Employee user);
	
	List<Employee> findAllEmployees(); 
	
	Employee findbyUserName(String username);
	
}
