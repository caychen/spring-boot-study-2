package org.com.cay.spring.boot.controller;

import org.com.cay.spring.boot.entity.Employee;
import org.com.cay.spring.boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Cay on 2018/5/21.
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/{id}")
	public Employee getById(@PathVariable Integer id){
		return employeeService.getById(id);
	}

	@PutMapping("/")
	public Employee update(Employee employee){
		return employeeService.update(employee);
	}

	@DeleteMapping("/{id}")
	public void delById(@PathVariable Integer id){
		employeeService.deleteById(id);
	}
}
