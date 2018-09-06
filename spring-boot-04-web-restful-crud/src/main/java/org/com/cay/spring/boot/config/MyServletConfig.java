package org.com.cay.spring.boot.config;

import org.com.cay.spring.boot.filter.MyFilter;
import org.com.cay.spring.boot.listener.MyListener;
import org.com.cay.spring.boot.servlet.MyServlet;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Created by Cay on 2018/5/9.
 */
@Configuration
public class MyServletConfig {

	@Bean
	public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer(){
		//定制嵌入式的Servlet容器相关的规则
		return container -> container.setPort(8083);
	}

	//注册Servlet
	@Bean
	public ServletRegistrationBean myServlet(){
		return new ServletRegistrationBean(new MyServlet(), "/myServlet");
	}

	@Bean
	public FilterRegistrationBean myFilter(){
		FilterRegistrationBean bean = new FilterRegistrationBean();
		bean.setFilter(new MyFilter());
		bean.setUrlPatterns(Arrays.asList("/hello", "/myServlet"));
		return bean;
	}

	@Bean
	public ServletListenerRegistrationBean myListener(){
		return new ServletListenerRegistrationBean<>(new MyListener());
	}
}
