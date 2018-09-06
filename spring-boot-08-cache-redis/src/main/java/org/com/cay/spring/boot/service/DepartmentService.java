package org.com.cay.spring.boot.service;

import org.com.cay.spring.boot.entity.Department;

/**
 * Created by Cay on 2018/5/25.
 */
public interface DepartmentService {

	Department getById(Integer id);
}
