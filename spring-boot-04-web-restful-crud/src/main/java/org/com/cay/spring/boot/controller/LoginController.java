package org.com.cay.spring.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by Cay on 2018/5/5.
 */
@Controller
public class LoginController {

	private final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@PostMapping("/user/login")
	public String login(@RequestParam String username, @RequestParam String password, ModelMap model, HttpSession session) {

		if (StringUtils.hasText(username) && "123456".equals(password)) {
			//假设登录成功，防止表单重复提交，可以重定向到主页
			session.setAttribute("loginUser", username);
			return "redirect:/main.html";
		} else {
			//登录失败
			logger.error("登录失败: 用户名或者密码错误！");
			model.addAttribute("message", "用户名或者密码错误！");
			return "login";
		}

	}
}
