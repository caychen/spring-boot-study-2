package org.com.cay.spring.boot.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Cay on 2018/5/27.
 */
@Configuration
public class MyAmqpConfig {

	@Bean
	public MessageConverter messageConverter(){
		return new Jackson2JsonMessageConverter();
	}
}
