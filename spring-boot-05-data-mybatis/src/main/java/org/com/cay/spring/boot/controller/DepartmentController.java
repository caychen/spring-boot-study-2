package org.com.cay.spring.boot.controller;

import org.com.cay.spring.boot.dao.DepartmentMapper;
import org.com.cay.spring.boot.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Cay on 2018/5/16.
 */
@RestController
@RequestMapping("/dept")
public class DepartmentController {

	@Autowired
	private DepartmentMapper departmentMapper;

	@GetMapping("/{id}")
	public Department getById(@PathVariable Integer id){
		return departmentMapper.getById(id);
	}

	@PostMapping("/")
	public Department insert(Department department){
		departmentMapper.insert(department);
		return department;
	}
}
