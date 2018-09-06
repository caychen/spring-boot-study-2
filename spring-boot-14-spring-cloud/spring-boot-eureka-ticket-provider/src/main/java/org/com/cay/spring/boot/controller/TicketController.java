package org.com.cay.spring.boot.controller;

import org.com.cay.spring.boot.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Cay on 2018/6/4.
 */
@RestController
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/get")
	public String getTicket() {
		List<ServiceInstance> serviceInstances = discoveryClient.getInstances("ticket-provider");
		System.out.println(serviceInstances.size());
		return ticketService.getTicket();
	}
}
