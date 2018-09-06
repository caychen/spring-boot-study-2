package org.com.cay.spring.boot;

import org.com.cay.spring.boot.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot08CacheRedisApplicationTests {

	@Autowired
	private EmployeeService employeeService;

	/*@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate<Object, Employee> employeeRedisTemplate;
*/
	/**
	 * Redis常见的五大数据类型：
	 *  字符串String：
	 *  列表List：
	 *  集合Set：
	 *  散列Hash：
	 *  有序集合ZSet：
	 *
	 *  StringRedisTemplate.opsForValue()
	 *  StringRedisTemplate.opsForList()
	 *  StringRedisTemplate.opsForSet()
	 *  StringRedisTemplate.opsForHash()
	 *  StringRedisTemplate.opsForZSet()
	 *
	 */

	@Test
	public void test01() {
		/*stringRedisTemplate.opsForValue().append("msg", "hello");
		System.out.println(stringRedisTemplate.opsForValue().get("msg"));

		stringRedisTemplate.opsForList().leftPush("mylist", "1");
		stringRedisTemplate.opsForList().leftPush("mylist", "2");
		stringRedisTemplate.opsForList().rightPush("mylist", "8");
		stringRedisTemplate.opsForList().rightPushAll("mylist", "3", "7", "9");
		System.out.println(stringRedisTemplate.opsForList().index("mylist", 5));

		stringRedisTemplate.opsForSet().add("myset1", "1", "4", "6", "2", "4", "1", "5");
		stringRedisTemplate.opsForSet().add("myset2", "3", "5", "7", "1");

		Set<String> diff = stringRedisTemplate.opsForSet().difference("myset1", "myset2");
		System.out.println(diff);
*/
	}

	@Test
	public void test02(){
		/*
		Employee e = employeeService.getById(1);
		//默认保存对象，使用jdk序列化机制，序列化后的数据保存到redis中
		employeeRedisTemplate.opsForValue().set("emp-01", e);

		Employee employee = employeeRedisTemplate.opsForValue().get("emp-01");
		System.out.println(employee);
		*/
	}

}
