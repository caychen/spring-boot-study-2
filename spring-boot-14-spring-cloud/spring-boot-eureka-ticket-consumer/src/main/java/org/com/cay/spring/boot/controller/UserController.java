package org.com.cay.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Cay on 2018/6/4.
 */
@RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/buy")
	public String buy(String name){
		String ticket = restTemplate.getForObject("http://ticket-provider/get", String.class);
		return name + "买到了票：" + ticket;
	}
}
