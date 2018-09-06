package org.com.cay.spring.boot.component;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

/**
 * Created by Cay on 2018/5/6.
 */
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

	@Override
	public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
		Map<String, Object> map = super.getErrorAttributes(requestAttributes, includeStackTrace);

		//在原来的错误信息上添加自定义的错误信息
		map.put("author", "caychen");

		//获取异常处理类中设置的错误信息
		Map<String, Object> other = (Map<String, Object>) requestAttributes.getAttribute("map", RequestAttributes.SCOPE_REQUEST);
		map.put("other", other);
		return map;
	}
}
