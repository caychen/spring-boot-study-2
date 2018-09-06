package org.com.cay.spring.boot.controller;

import org.com.cay.spring.boot.dao.EmployeeMapper;
import org.com.cay.spring.boot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Cay on 2018/5/17.
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeMapper employeeMapper;

	@RequestMapping("/{id}")
	public Employee getById(@PathVariable Integer id){
		return employeeMapper.getById(id);
	}
}
