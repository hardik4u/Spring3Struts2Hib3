package com.hardik4u.service;

import java.util.List;
import com.hardik4u.model.Employee;

public interface EmpService {

	public List getAllEmployees();
	public void addEmployee(Employee emp);
}
