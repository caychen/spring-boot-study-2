package org.com.cay.spring.boot.service;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * Created by Cay on 2018/5/31.
 */
public interface TicketProviderService {

	String getTicket();
}
