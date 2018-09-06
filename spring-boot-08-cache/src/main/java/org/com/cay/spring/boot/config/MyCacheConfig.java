package org.com.cay.spring.boot.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


/**
 * Created by Cay on 2018/5/22.
 */
@Configuration
public class MyCacheConfig {

	@Bean("myKeyGenerator")
	public KeyGenerator keyGenerator(){
		return (target, method, params) -> method.getName() + "[" + Arrays.asList(params).toString() + "]";
	}
}
