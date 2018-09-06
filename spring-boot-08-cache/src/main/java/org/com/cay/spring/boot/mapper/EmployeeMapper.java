package org.com.cay.spring.boot.mapper;

import org.apache.ibatis.annotations.*;
import org.com.cay.spring.boot.entity.Employee;

/**
 * Created by Cay on 2018/5/21.
 */
public interface EmployeeMapper {

	@Select("select * from employee where id = #{id}")
	Employee getById(Integer id);

	@Update("update employee set lastname = #{lastName}, email = #{email}, gender = #{gender}, d_id = #{dId} where id = #{id}")
	void update(Employee employee);

	@Delete("delete from employee where id = #{id}")
	void deleteById(Integer id);

	@Insert("insert into employee(lastname, email, gender, d_id) values(#{lastName}, #{email}, #{gender}, #{dId})")
	void insert(Employee employee);
}
