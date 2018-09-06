package org.com.cay.spring.boot.service.impl;

import org.com.cay.spring.boot.entity.Department;
import org.com.cay.spring.boot.mapper.DepartmentMapper;
import org.com.cay.spring.boot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by Cay on 2018/5/25.
 */
@Service
@CacheConfig(cacheNames = "dept", cacheManager = "departmentRedisCacheManager")
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;

	@Cacheable
	@Override
	public Department getById(Integer id) {
		System.out.println("查询部门：" + id);
		Department department = departmentMapper.getById(id);
		return department;
	}

}
