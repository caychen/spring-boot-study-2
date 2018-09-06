package org.com.cay.spring.boot.config;

import org.com.cay.spring.boot.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Cay on 2018/5/1.
 */
//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
//		super.addViewControllers(registry);
		registry.addViewController("/cay").setViewName("success");
		registry.addViewController("/login.html").setViewName("login");
		registry.addViewController("/").setViewName("login");
		registry.addViewController("/main.html").setViewName("dashboard");
	}

	//使用自定义的LocaleResolver来替换掉默认的LocaleResolver
	@Bean
	public LocaleResolver localeResolver(){
		return new MyLocaleResolver();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//		super.addInterceptors(registry);
//		registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
//				.excludePathPatterns("/", "/login.html", "/user/login");
	}
}
