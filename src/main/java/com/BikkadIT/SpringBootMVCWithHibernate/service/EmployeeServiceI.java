package com.BikkadIT.SpringBootMVCWithHibernate.service;

import java.util.List;

import com.BikkadIT.SpringBootMVCWithHibernate.model.Employee;

public interface EmployeeServiceI {
	
	public  int saveEmployee(Employee emp) ;	

	public List<Employee> getAllEmployees();

}
