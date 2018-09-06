package org.com.cay.spring.boot;

import org.apache.catalina.core.ApplicationContext;
import org.com.cay.spring.boot.entity.Employee;
import org.com.cay.spring.boot.entity.Person;
import org.com.cay.spring.boot.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot测试主程序
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {

	@Autowired
	private HelloService helloService;

	@Autowired
	private Person person;

	@Autowired
	private Employee employee;

	@Value("${content}")
	private String content;

	@Value("${text}")
	private String text;

	@Test
	public void contextLoads() {
		System.out.println(employee);
	}

	@Test
	public void testHelloService(){
		System.out.println(helloService);
	}

	@Test
	public void testRandom(){
		System.out.println(text);
	}
}
