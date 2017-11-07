package com.loan.springmvc.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.loan.springmvc.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao<Integer, Employee> implements EmployeeDao{

	
	public Employee findById(int id) {
		Employee employee = getByKey(id);
		return employee;
	}


	public void save(Employee employee) {
		persist(employee);		
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

		@Override
		public Employee findbyUserName(String username) {
			Employee employee = null ;
			try {
			Object objectEmployee = getEntityManager()
					.createQuery("SELECT e FROM Employee e WHERE e.username='"+username+"'")
					.getSingleResult();
			 employee = (Employee) objectEmployee;
			} catch (Exception e) {
				e.fillInStackTrace();
			}
			return employee;
		}

}
