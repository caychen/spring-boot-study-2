package org.com.cay.spring.boot.config;

import org.com.cay.spring.boot.properties.HelloProperties;
import org.com.cay.spring.boot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Cay on 2018/5/20.
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

	@Autowired
	private HelloProperties helloProperties;

	@Bean
	public HelloService helloService(){
		HelloService helloService = new HelloService();
		helloService.setHelloProperties(helloProperties);

		return helloService;
	}
}
