package org.com.cay.spring.boot.entity;

import org.hibernate.validator.constraints.Email;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Cay on 2018/4/14.
 */

/**
 * 将配置文件中的配置的每一个属性值，映射到组件中
 * @ConfigurationProperties: 告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定。
 *      prefix: 配置文件中的prefix指定的属性下的所有属性与该组件属性一一对应。
 *
 * @ConfigurationProperties: 默认从全局配置文件中获取值
 *
 * 只有这个组件是容器中的组件，容器才能提供@ConfigurationProperties功能。
 */
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person implements Serializable {

	//@Email
	private String name;
	private Integer age;
	private Boolean boss;
	private Date birth;

	private Map<String, Object> maps;
	private List<Object> lists;

	private Dog dog;

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

	public Boolean getBoss() {
		return boss;
	}

	public void setBoss(Boolean boss) {
		this.boss = boss;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}

	public List<Object> getLists() {
		return lists;
	}

	public void setLists(List<Object> lists) {
		this.lists = lists;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", boss=" + boss +
				", birth=" + birth +
				", maps=" + maps +
				", lists=" + lists +
				", dog=" + dog +
				'}';
	}
}
