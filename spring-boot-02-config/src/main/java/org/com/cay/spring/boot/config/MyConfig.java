package org.com.cay.spring.boot.config;

import org.com.cay.spring.boot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Cay on 2018/4/14.
 */

/**
 * @Configuration: 指明当前类是一个注解类，用来代替原来的Spring的xml配置文件
 */
@Configuration
public class MyConfig {

	//将方法的返回值添加到容器中，容器中这个组件默认的id为方法名
	@Bean
	public HelloService helloService(){
		System.out.println("添加组件：helloService");
		return new HelloService();
	}
}
