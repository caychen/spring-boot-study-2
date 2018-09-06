package org.com.cay.spring.boot.dao;

import org.com.cay.spring.boot.entity.Employee;

/**
 * Created by Cay on 2018/5/17.
 */
public interface EmployeeMapper {

	public Employee getById(Integer id);

	public Employee insert(Employee employee);
}
