package org.com.cay.spring.boot.service;

import org.com.cay.spring.boot.entity.Employee;

/**
 * Created by Cay on 2018/5/21.
 */
public interface EmployeeService {
	Employee getById(Integer id);

	Employee update(Employee employee);

	void deleteById(Integer id);

	void insert(Employee employee);
}
