package org.com.cay.spring.boot.controller;

import org.com.cay.spring.boot.exception.NotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * Created by Cay on 2018/4/28.
 */
@Controller
public class HelloController {

	@RequestMapping("/success")
	public String success(ModelMap model) {
		model.addAttribute("hello", "<h1>Hello World</h1>");
		model.addAttribute("users", Arrays.asList("zhangsan", "lisi", "wangwu"));
		return "success";
	}

	@RequestMapping("/hello")
	public String hello(String user){
		if(!StringUtils.hasText(user) || user.equals("111")){
			throw new NotExistException();
		}
		return "success";
	}
}
