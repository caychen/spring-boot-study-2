package org.com.cay.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Cay on 2018/4/15.
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		return "Hello world";
	}
}
