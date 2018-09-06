package org.com.cay.spring.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.com.cay.spring.boot.dao")
public class SpringBoot05DataMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot05DataMybatisApplication.class, args);
	}
}
