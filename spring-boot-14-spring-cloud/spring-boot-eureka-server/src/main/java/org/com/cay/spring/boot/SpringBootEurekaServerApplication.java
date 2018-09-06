package org.com.cay.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心：
 *  1、配置eureka信息
 *  2、使用@EnableEurekaServer注解来启用EurekaServer
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringBootEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServerApplication.class, args);
	}
}
