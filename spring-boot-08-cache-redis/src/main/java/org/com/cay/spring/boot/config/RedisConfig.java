package org.com.cay.spring.boot.config;

import org.com.cay.spring.boot.entity.Department;
import org.com.cay.spring.boot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * Created by Cay on 2018/5/24.
 */
@Configuration
public class RedisConfig {

	@Bean
	public RedisTemplate<Object, Employee> employeeRedisTemplate(@Autowired RedisConnectionFactory redisConnectionFactory){
		RedisTemplate<Object, Employee> template = new RedisTemplate<>();

		template.setConnectionFactory(redisConnectionFactory);
		Jackson2JsonRedisSerializer<Employee> serializer = new Jackson2JsonRedisSerializer<>(Employee.class);
		template.setDefaultSerializer(serializer);
		return template;
	}

	//自定义缓存管理器CacheManager
	@Bean
	@Primary
	public RedisCacheManager employeeRedisCacheManager(@Autowired RedisTemplate<Object, Employee> employeeRedisTemplate){
		RedisCacheManager manager = new RedisCacheManager(employeeRedisTemplate);
		//使用前缀，会使key多一个前缀，默认会使用cacheNames作为key的前缀
		manager.setUsePrefix(true);
		return manager;
	}

	@Bean
	public RedisTemplate<Object, Department> departmentRedisTemplate(@Autowired RedisConnectionFactory redisConnectionFactory){
		RedisTemplate<Object, Department> template = new RedisTemplate<>();

		template.setConnectionFactory(redisConnectionFactory);
		Jackson2JsonRedisSerializer<Department> serializer = new Jackson2JsonRedisSerializer<>(Department.class);
		template.setDefaultSerializer(serializer);
		return template;
	}

	//自定义缓存管理器CacheManager
	@Bean
	public RedisCacheManager departmentRedisCacheManager(@Autowired RedisTemplate<Object, Department> departmentRedisTemplate){
		RedisCacheManager manager = new RedisCacheManager(departmentRedisTemplate);
		//使用前缀，会使key多一个前缀，默认会使用cacheNames作为key的前缀
		manager.setUsePrefix(true);
		return manager;
	}

}
