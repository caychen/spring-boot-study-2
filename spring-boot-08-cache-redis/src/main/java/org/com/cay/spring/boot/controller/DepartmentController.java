package org.com.cay.spring.boot.controller;

import org.com.cay.spring.boot.entity.Department;
import org.com.cay.spring.boot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Cay on 2018/5/25.
 */
@RestController
@RequestMapping("/dept")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/{id}")
	public Department getById(@PathVariable Integer id){
		return departmentService.getById(id);
	}
}
