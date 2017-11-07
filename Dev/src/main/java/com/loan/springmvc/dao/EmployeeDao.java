package com.loan.springmvc.dao;

import java.util.List;

import com.loan.springmvc.model.Employee;

public interface EmployeeDao {

	Employee findById(int id);
	
	Employee findBySSO(String sso);
	
	void save(Employee employee);
	
	void deleteBySSO(String sso);
	
	List<Employee> findAllEmployees();
}
