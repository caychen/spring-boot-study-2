package org.com.cay.spring.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = "org.com.cay.spring.boot.mapper")
public class SpringBoot08CacheRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot08CacheRedisApplication.class, args);
	}
}
