package org.com.cay.spring.boot.service.impl;

import org.com.cay.spring.boot.entity.Employee;
import org.com.cay.spring.boot.mapper.EmployeeMapper;
import org.com.cay.spring.boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by Cay on 2018/5/21.
 */
@Service
@CacheConfig(cacheNames = "emp")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	/**
	 * @Cacheable：将方法的结果进行缓存
	 * 属性：
	 *  cacheNames/value: 缓存组件的名字
	 *  key：缓存数据使用的key，默认是使用方法参数的值，可以使用SpEL表达式
	 *      #id == #a0 == #p0 == #root.args[0]
	 *  keyGenerator：key的生成器，可以自己指定key的生成器的组件id
	 *      keyGenerator与key二者选一
	 *  cacheManager：指定缓存管理器
	 *  cacheResolver：指定获取解析器
	 *      cacheResolver与cacheManager二者选一
	 *  condition：指定符合条件的情况下才缓存，支持SpEL表达式
	 *  unless：否定缓存，当unless指定的条件为true，方法的返回值就不会被缓存，可以获取到结果进行判断
	 *      unless与condition刚好相反
	 *  sync：是否使用异步模式
	 *
	 * @param id
	 * @return
	 */
	@Cacheable(key = "#id")
	@Override
	public Employee getById(Integer id) {
		System.out.println("查询员工：" + id);
		return employeeMapper.getById(id);
	}

	/**
	 *
	 * @CachePut：既调用方法，也更新缓存
	 * 运行时机：
	 *  1、先调用目标方法
	 *  2、将目标方法的结果进行缓存
	 *
	 *  更新前提是，key与之前缓存的key要保持一致，这样更新数据的同时，也会更新缓存中同key的数据
	 *  之前讲过，key默认为参数名
	 *
	 * @param employee
	 */
	@CachePut(key = "#result.id") //#result表示返回值
	@Override
	public Employee update(Employee employee) {
		System.out.println("update: " + employee);
		employeeMapper.update(employee);
		return employee;
	}

	@CacheEvict(key = "#id")
	@Override
	public void deleteById(Integer id) {
		System.out.println("delete: " + id);
//		employeeMapper.deleteById(id);
	}

	@Override
	public void insert(Employee employee) {
		employeeMapper.insert(employee);
	}
}
