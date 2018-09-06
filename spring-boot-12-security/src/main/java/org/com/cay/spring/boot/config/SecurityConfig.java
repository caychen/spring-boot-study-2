package org.com.cay.spring.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Cay on 2018/5/31.
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		super.configure(auth);
		auth.inMemoryAuthentication().withUser("caychen").password("caychen").roles("VIP1", "VIP2", "VIP3")
				.and()
				.withUser("amy").password("amy").roles("VIP1")
				.and()
				.withUser("kitty").password("111111").roles("VIP2")
				.and()
				.withUser("tom").password("111111").roles("VIP1", "VIP2");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		super.configure(web);
	}

	//定制请求的授权规则
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		super.configure(http);
		http.authorizeRequests().antMatchers("/").permitAll()
				.antMatchers("/level1/**").hasRole("VIP1")
				.antMatchers("/level2/**").hasRole("VIP2")
				.antMatchers("/level3/**").hasRole("VIP3");

		//开启登录功能，如果没有登录，则会跳转到自动生成的登录页
		//1、/login来到登录页
		//2、重定向到/login?error表示登录失败
		//3、get请求/login会到登录页
		//4、post请求/login会处理登录逻辑
		//5、一旦自定义了登录页后，springsecurity定制的登录页就失效了
		//6、一旦自定义了登录页后，自定义的登录页的登录post请求url同get请求登录页的url一致，如下定义了登录页请求url为userlogin，则登录逻辑的post的url也为userlogin
		http.formLogin().loginPage("/userlogin");

		//开启自动注销功能
		//1、访问/logout表示用户注销，并清空session
		//2、默认注销成功后会返回到/login?logout
		http.logout().logoutSuccessUrl("/");//注销成功后回到首页

		//开启记住我功能
		//1、登录成功后，将cookie发送给浏览器，以后访问页面后会带上这个cookie，只要通过检查就可以免登录
		//2、点击注销后，会将该cookie自动删除
		http.rememberMe().rememberMeParameter("remember");
	}
}
