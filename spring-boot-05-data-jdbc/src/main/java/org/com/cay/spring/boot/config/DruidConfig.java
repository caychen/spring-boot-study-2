package org.com.cay.spring.boot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.sun.tracing.ProbeName;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cay on 2018/5/15.
 */
@Configuration
public class DruidConfig {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DruidDataSource druid(){
		return new DruidDataSource();
	}

	//配置Druid监控
	//1、配置一个管理后台的Servlet
	@Bean
	public ServletRegistrationBean statViewServlet(){
		ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
		Map<String, String> initParams = new HashMap<>();
		initParams.put("loginUsername", "admin");
		initParams.put("loginPassword", "123456");
		initParams.put("allow", "");//默认空串表示允许所有访问
//		initParams.put("deny", "");

		bean.setInitParameters(initParams);
		return bean;
	}

	@Bean
	public FilterRegistrationBean webStatFilter(){
		FilterRegistrationBean bean = new FilterRegistrationBean();
		bean.setFilter(new WebStatFilter());

		Map<String, String> initParams = new HashMap<>();
		initParams.put("exclusions", "*.js, *.css, *.png, *.jpg, *.gif, /druid/*");
		bean.setInitParameters(initParams);

		bean.setUrlPatterns(Arrays.asList("/*"));
		return bean;
	}
}
