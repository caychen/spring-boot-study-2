package org.com.cay.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Cay on 2018/5/10.
 */
@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(ModelMap modelMap){
		modelMap.put("msg", "Hello World");
		return "success";
	}
}
