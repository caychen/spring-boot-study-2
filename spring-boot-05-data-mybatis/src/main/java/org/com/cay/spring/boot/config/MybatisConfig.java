package org.com.cay.spring.boot.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Cay on 2018/5/17.
 */
@Configuration
public class MybatisConfig {

	@Bean
	public ConfigurationCustomizer configurationCustomizer(){
		return configuration -> {
			configuration.setMapUnderscoreToCamelCase(true);
		};
	}
}
