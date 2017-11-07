package com.loan.springmvc.dao;

import java.util.List;

import com.loan.springmvc.model.Employee;

public interface EmployeeDao {

	Employee findById(int id);
	
	void save(Employee employee);
		
	List<Employee> findAllEmployees();
	
	Employee findbyUserName(String username);
}
