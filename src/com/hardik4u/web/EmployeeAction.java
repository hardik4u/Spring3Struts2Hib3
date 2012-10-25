package com.hardik4u.web;

import java.util.List;

import com.hardik4u.model.Employee;
import com.hardik4u.service.EmpService;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {

	/* This method for listing employee */

	public String list() throws Exception {

		empList = empService.getAllEmployees();
		System.out.println(empList.size());
		return SUCCESS;
	}

	/* This method for adding employee */
	public String add() throws Exception {

		empService.addEmployee(emp);
		return SUCCESS;
	}

	private Employee emp;

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	private List empList;

	/* This method will push the object in ActionContext for accessing it in JSP */
	public List getEmpList() {
		return empList;
	}

	/* It will be initialized through Spring factory */
	private EmpService empService;

	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}

}
