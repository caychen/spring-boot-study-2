package org.com.cay.spring.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "org.com.cay.spring.boot.mapper")
@EnableCaching//开启注解
public class SpringBoot08CacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot08CacheApplication.class, args);
	}
}
