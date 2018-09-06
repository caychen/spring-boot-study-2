package org.com.cay.spring.boot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Cay on 2018/4/12.
 */

/**
 * @SpringBootApplication来标注一个主程序类，说明这是一个SpringBoot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

	public static void main(String[] args) {
		//Spring应用启动
		SpringApplication.run(HelloWorldMainApplication.class, args);
	}
}
