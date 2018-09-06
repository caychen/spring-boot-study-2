package org.com.cay.spring.boot.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * Created by Cay on 2018/5/31.
 */
@Service
public class UserService {

	@Reference
	private TicketProviderService ticketProviderService;

	public void hello(){
		String ticket = ticketProviderService.getTicket();
		System.out.println("买到票了：" + ticket);
	}
}
