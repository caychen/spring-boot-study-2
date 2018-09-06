package org.com.cay.spring.boot.controller;

import org.com.cay.spring.boot.dao.DepartmentDao;
import org.com.cay.spring.boot.dao.EmployeeDao;
import org.com.cay.spring.boot.entity.Department;
import org.com.cay.spring.boot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Cay on 2018/5/5.
 */
@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private DepartmentDao departmentDao;

	@GetMapping("/emps")
	public String list(ModelMap modelMap){
		Collection<Employee> employees = employeeDao.getAll();
		modelMap.addAttribute("employees", employees);
		return "emp/list";
	}

	@GetMapping("/emp")
	public String toAddPage(ModelMap modelMap){
		Collection<Department> departments = departmentDao.getDepartments();
		modelMap.addAttribute("depts", departments);
		return "emp/add";
	}

	@PostMapping("/emp")
	public String addEmp(Employee employee){
		employeeDao.save(employee);
		return "redirect:/emps";
	}

	@GetMapping("/emp/{id}")
	public String toUpdatePage(@PathVariable Integer id, ModelMap modelMap){
		Employee employee = employeeDao.get(id);
		modelMap.addAttribute("emp", employee);

		Collection<Department> departments = departmentDao.getDepartments();
		modelMap.addAttribute("depts", departments);
		//添加和修改页面重用
		return "emp/add";
	}

	@PutMapping("/emp")
	public String updateEmp(Employee employee){
		employeeDao.save(employee);
		return "redirect:/emps";
	}

	@DeleteMapping("/emp/{id}")
	public String deleteEmp(@PathVariable Integer id){
		employeeDao.delete(id);
		return"redirect:/emps";
	}
}
