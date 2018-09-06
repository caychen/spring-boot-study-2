package org.com.cay.spring.boot;

import org.com.cay.spring.boot.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot09RabbitmqApplicationTests {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private AmqpAdmin amqpAdmin;

	@Test
	public void send() {
		//Message需要自己构造，定义消息体内容和消息头
		//rabbitTemplate.send(final String exchange, final String routingKey, final Message message);

		//object默认当成消息体，只需要传入要发送的对象，自动序列化并发送给rabbitmq
		Map<String, Object> map = new HashMap<>();
		map.put("msg", "success");
		map.put("date", new Date());
		map.put("age", 10);
		rabbitTemplate.convertAndSend("exchange.direct", "direct.cay", new Book("西游记", "吴承恩"));
	}

	@Test
	public void receive(){
		Object obj = rabbitTemplate.receiveAndConvert("direct.cay");
		System.out.println(obj.getClass());

		System.out.println(obj);
	}

	@Test
	public void createExchange(){
		Queue queue = new Queue("direct.cay", true);
		DirectExchange directExchange = new DirectExchange("exchange.direct");

//		amqpAdmin.declareExchange(directExchange);

//		amqpAdmin.declareQueue(queue);

		//创建绑定
//		amqpAdmin.declareBinding(new Binding("direct.cay", Binding.DestinationType.QUEUE, "exchange.direct", "direct.cay", null));
		amqpAdmin.declareBinding(BindingBuilder.bind(queue).to(directExchange).with("direct.cay"));
	}

}
