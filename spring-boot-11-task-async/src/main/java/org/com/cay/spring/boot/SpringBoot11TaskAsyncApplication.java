package org.com.cay.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringBoot11TaskAsyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot11TaskAsyncApplication.class, args);
	}
}
