package com.loan.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loan.springmvc.dao.EmployeeDao;
import com.loan.springmvc.model.Employee;


@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public Employee findById(int id) {
		return  dao.findById(id);
	}

	@Override
	public Employee findBySSO(String sso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEmployee(Employee employee) {
		 dao.save(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		Employee entity = dao.findById(employee.getEmployeeId());
		if(entity != null){
			entity.setAddress(employee.getAddress());
			entity.setBirthDATE(employee.getBirthDATE());
			employee.setEmployeeHireDate(employee.getEmployeeHireDate());
		}
		
	}

	@Override
	public void deleteEmployeeBySSO(String sso) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public boolean isEmployeeSSOUnique(Integer id, String sso) {
		// TODO Auto-generated method stub
		return false;
	}

}
