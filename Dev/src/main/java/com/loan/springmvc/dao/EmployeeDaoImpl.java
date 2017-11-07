package com.loan.springmvc.dao;

import java.util.Collection;
import java.util.List;

import com.loan.springmvc.model.Employee;

public class EmployeeDaoImpl extends AbstractDao<Integer, Employee> implements EmployeeDao{

	@Override
	public Employee findById(int id) {
		Employee employee = getByKey(id);
		return employee;
	}

	@Override
	public Employee findBySSO(String sso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee employee) {
		persist(employee);		
	}

	@Override
	public void deleteBySSO(String sso) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAllEmployees() {
		
		List<Employee> employees = getEntityManager()
				.createQuery("SELECT e FROM Employee e ORDER BY e.firstName ASC")
				.getResultList();
		return employees;
	}
	
	//An alternative to Hibernate.initialize()
		protected void initializeCollection(Collection<?> collection) {
		    if(collection == null) {
		        return;
		    }
		    collection.iterator().hasNext();
		}

}
