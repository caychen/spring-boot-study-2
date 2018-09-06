package org.com.cay.spring.boot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Cay on 2018/5/9.
 */
public class MyFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("MyFilter process...");
		//放行
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {

	}
}
