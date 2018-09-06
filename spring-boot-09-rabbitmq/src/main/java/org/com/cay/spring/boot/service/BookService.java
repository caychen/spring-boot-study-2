package org.com.cay.spring.boot.service;

import org.com.cay.spring.boot.entity.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Created by Cay on 2018/5/27.
 */
@Service
public class BookService {

	@RabbitListener(queues = "direct.cay")
	public void receive(Book book){
		System.out.println("监听到消息：" + book);
	}

//	@RabbitListener(queues = "cay")
	public void receive2(Message message){
		System.out.println("监听到消息：" + message);
	}
}
