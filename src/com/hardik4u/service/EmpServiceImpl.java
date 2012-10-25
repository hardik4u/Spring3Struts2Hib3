package com.hardik4u.service;

import java.util.List;
import java.util.Map;

import com.hardik4u.dao.EmployeeDAO;
import com.hardik4u.model.Employee;

public class EmpServiceImpl implements EmpService {

	public Map<String, Employee> empList;
	private EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public List getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	public void addEmployee(Employee emp) {
		employeeDAO.addEmployee(emp);
	}

}
