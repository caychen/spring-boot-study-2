package org.com.cay.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient  //开启发现服务功能
public class SpringBootEurekaTicketProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaTicketProviderApplication.class, args);
	}

}
