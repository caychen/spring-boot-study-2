package org.com.cay.spring.boot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.com.cay.spring.boot.entity.Department;

/**
 * Created by Cay on 2018/5/25.
 */
public interface DepartmentMapper {

	@Select("select * from department where id = #{id}")
	Department getById(Integer id);
}
