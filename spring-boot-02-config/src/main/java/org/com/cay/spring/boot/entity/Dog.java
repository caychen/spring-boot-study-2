package org.com.cay.spring.boot.entity;

import java.io.Serializable;

/**
 * Created by Cay on 2018/4/14.
 */
public class Dog implements Serializable {
	private String name;
	private Integer age;

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				", age=" + age +
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
}
