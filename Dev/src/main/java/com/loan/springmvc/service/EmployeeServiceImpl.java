package com.loan.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loan.springmvc.dao.EmployeeDao;
import com.loan.springmvc.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public Employee findById(int id) {
		return  dao.findById(id);
	}

	public void saveEmployee(Employee employee) {
		 dao.save(employee);
		
	}

	public void updateEmployee(Employee employee) {
		Employee entity = dao.findById(employee.getEmployeeId());
		if(entity != null){
			entity.setAddress(employee.getAddress());
			entity.setBirthDATE(employee.getBirthDATE());
			employee.setEmployeeHireDate(employee.getEmployeeHireDate());
		}
		
	}

	public List<Employee> findAllEmployees() {
		return dao.findAllEmployees();
	}

	public Employee findbyUserName(String username) {
		
		return dao.findbyUserName(username);
	}

}
