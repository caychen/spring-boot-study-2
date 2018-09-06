package org.com.cay.spring.boot.controller;

import org.com.cay.spring.boot.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.Future;

/**
 * Created by Cay on 2018/5/30.
 */
@RestController
public class AsyncController {

	@Autowired
	private AsyncService asyncService;

	@GetMapping("/")
	public String sayHello() {
		try {
			long s = System.currentTimeMillis();
			Future<String> task1 = asyncService.task1();
			Future<String> task2 = asyncService.task2();
			Future<String> task3 = asyncService.task3();
			while (!task1.isDone() || !task2.isDone() || !task3.isDone()) {
			}
			String result = "main总耗时：" + (System.currentTimeMillis() - s);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return "error...";
		}
	}
}
