package org.com.cay.spring.boot.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Cay on 2018/5/18.
 */
@Component
public class HelloApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("HelloApplicationRunner...run");
	}
}
