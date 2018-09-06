package org.com.cay.spring.boot;

import org.com.cay.spring.boot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot13DubboTicketConsumerApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {
		userService.hello();
	}

}
