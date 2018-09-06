package org.com.cay.spring.boot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.com.cay.spring.boot.service.TicketProviderService;
import org.springframework.stereotype.Component;

/**
 * Created by Cay on 2018/5/31.
 */
@Component
@Service//该注解是dubbo包下的注解，将服务发布出去
public class TicketProviderServiceImpl implements TicketProviderService {

	@Override
	public String getTicket() {
		return "变形金刚";
	}
}
