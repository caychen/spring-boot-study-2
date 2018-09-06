package org.com.cay.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、引入dubbo依赖
 * 2、配置dubbo的注册中心地址
 * 3、使用dubbo的@Reference注解来引用服务
 */
@SpringBootApplication
public class SpringBoot13DubboTicketConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot13DubboTicketConsumerApplication.class, args);
	}
}
