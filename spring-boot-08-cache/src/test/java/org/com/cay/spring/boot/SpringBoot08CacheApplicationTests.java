package org.com.cay.spring.boot;

import org.com.cay.spring.boot.entity.Employee;
import org.com.cay.spring.boot.mapper.EmployeeMapper;
import org.com.cay.spring.boot.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot08CacheApplicationTests {

	@Autowired
	private EmployeeService employeeService;

	@Test
	public void contextLoads() {
		Employee employee = employeeService.getById(1);
		System.out.println(employee);
	}

}
