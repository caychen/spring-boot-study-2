package org.com.cay.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、服务提供者注册到注册中心
 *      (1)、引入dubbo和zkclient相关依赖
 *      (2)、配置dubbo的扫描包和注册中心地址
 *      (3)、使用dubbo包下的@Service注解将服务进行发布
 */
@SpringBootApplication
public class SpringBoot13DubboTicketProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot13DubboTicketProviderApplication.class, args);
	}
}
