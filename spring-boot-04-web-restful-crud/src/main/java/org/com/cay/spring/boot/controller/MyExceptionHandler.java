package org.com.cay.spring.boot.controller;

import org.com.cay.spring.boot.exception.NotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cay on 2018/5/6.
 */
@ControllerAdvice
public class MyExceptionHandler {

	//1、这样会导致浏览器也返回json数据
//	@ResponseBody
//	@ExceptionHandler(value= NotExistException.class)
//	public Map<String, Object> handler(Exception e){
//		Map<String, Object> map = new HashMap<>();
//		map.put("message", e.getMessage());
//
//		return map;
//	}

	@ExceptionHandler(NotExistException.class)
	public String handler(Exception e, HttpServletRequest request){
		Map<String, Object> map = new HashMap<>();
//		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		//需要传入自己的错误状态码 4xx或者5xx
		request.setAttribute("javax.servlet.error.status_code", 400);

		map.put("email", "412425870@qq.com");
		map.put("error", "发生错误啦！");
		request.setAttribute("map", map);

		//转发到/error请求
		return "forward:/error";
	}
}
