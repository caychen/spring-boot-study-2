package org.com.cay.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBoot11TaskSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot11TaskSchedulerApplication.class, args);
	}
}
