package org.com.cay.spring.boot.hello;

import org.com.cay.spring.boot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Cay on 2018/5/20.
 */
@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@GetMapping("/hello")
	public String sayHello(String name){
		return helloService.sayHello(name);
	}
}
