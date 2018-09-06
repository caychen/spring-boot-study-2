package org.com.cay.spring.boot.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created by Cay on 2018/5/5.
 */
//使用链接的方法发送国际语言代码
public class MyLocaleResolver  implements LocaleResolver{

	private final Logger logger = LoggerFactory.getLogger(MyLocaleResolver.class);

	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		String lan = request.getParameter("l");
		Locale locale = Locale.getDefault();
		if(StringUtils.hasText(lan)){
			try{
				String[] split = lan.split("_");
				locale = new Locale(split[0], split[1]);
			}catch (Exception e){
				e.printStackTrace();
				logger.error("错误信息:", e);
			}
		}
		return locale;
	}

	@Override
	public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

	}
}
