package org.com.cay.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBoot02ConfigApplication {

	public static void main(String[] args) {
		//加载默认的配置文件名
		SpringApplication.run(SpringBoot02ConfigApplication.class, args);

		/**
		 *

		//使用指定的配置文件
		SpringApplication application = new SpringApplication(SpringBoot02ConfigApplication.class);

		//禁止通过命令行参数修改默认配置属性
		application.setAddCommandLineProperties(false);

		//加载指定的配置文件
		InputStream is = SpringBoot02ConfigApplication.class.getClassLoader().getResourceAsStream("app.properties");
		Properties properties = new Properties();
		try {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}

		//设置属性
		application.setDefaultProperties(properties);
		//启动
		application.run(args);
		 */
	}
}
