package com.BikkadIT.SpringBootMVCWithHibernate.dao;

import java.util.List;

import com.BikkadIT.SpringBootMVCWithHibernate.model.Employee;

public interface EmployeeDaoI {
	
public int saveEmployee(Employee emp);
	
	public List<Employee> getAllEmployee();

}
