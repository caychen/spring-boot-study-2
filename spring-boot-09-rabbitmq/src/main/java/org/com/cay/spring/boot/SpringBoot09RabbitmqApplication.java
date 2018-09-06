package org.com.cay.spring.boot;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit//开启rabbitmq消息队列
public class SpringBoot09RabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot09RabbitmqApplication.class, args);
	}
}
