package com.hardik4u.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.hardik4u.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List getAllEmployees() {
		List returnValue = getSessionFactory().getCurrentSession()
				.createQuery("from Employee emp").list();
		return returnValue;
	}

	public void addEmployee(Employee emp) {
		getSessionFactory().getCurrentSession().save(emp);

	}
}
