package com.hardik4u.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hardik4u.model.Employee;

@Transactional
public interface EmployeeDAO {

	public List getAllEmployees();
	public void addEmployee(Employee emp);
}
