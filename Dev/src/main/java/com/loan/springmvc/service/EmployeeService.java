package com.loan.springmvc.service;

import java.util.List;

import com.loan.springmvc.model.Employee;

public interface EmployeeService {

	Employee findById(int id);
	
	Employee findBySSO(String sso);
	
	void saveEmployee(Employee user);
	
	void updateEmployee(Employee user);
	
	void deleteEmployeeBySSO(String sso);

	List<Employee> findAllEmployees(); 
	
	boolean isEmployeeSSOUnique(Integer id, String sso);
	
}
