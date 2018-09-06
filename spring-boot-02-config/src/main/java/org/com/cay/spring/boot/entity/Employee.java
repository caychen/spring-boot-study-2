package org.com.cay.spring.boot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Cay on 2018/4/14.
 */
@Component
@PropertySource(value = {"classpath:employee.properties"},encoding = "UTF-8")
@ConfigurationProperties(prefix = "employee")
public class Employee implements Serializable {
	private String name;
	private Integer age;

	private Date birth;
	private Boolean boss;

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", age=" + age +
				", birth=" + birth +
				", boss=" + boss +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Boolean getBoss() {
		return boss;
	}

	public void setBoss(Boolean boss) {
		this.boss = boss;
	}
}
