package org.com.cay.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringBoot12SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot12SecurityApplication.class, args);
	}
}
