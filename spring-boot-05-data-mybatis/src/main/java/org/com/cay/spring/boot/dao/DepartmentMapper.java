package org.com.cay.spring.boot.dao;

import org.apache.ibatis.annotations.*;
import org.com.cay.spring.boot.entity.Department;

/**
 * Created by Cay on 2018/5/16.
 */
//@Mapper
public interface DepartmentMapper {

	@Results({
				@Result(column = "id", property = "id", id = true),
				@Result(column = "department_name", property = "departmentName")
	})
	@Select("select * from department where id = #{id}")
	public Department getById(Integer id);

	@Delete("delete from department where id = #{id}")
	public int deleteById(Integer id);

	@Insert("insert into department(department_name) values(#{departmentName})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public int insert(Department department);

	@Update("update department set department_name = #{departmentName} where id = #{id}")
	public int update(Department department);
}
