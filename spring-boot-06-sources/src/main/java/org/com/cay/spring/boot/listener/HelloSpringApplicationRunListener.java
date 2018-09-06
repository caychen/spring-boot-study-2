package org.com.cay.spring.boot.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created by Cay on 2018/5/18.
 */
public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {

	public HelloSpringApplicationRunListener(SpringApplication springApplication, String[] args){

	}

	@Override
	public void starting() {
		System.out.println("HelloSpringApplicationRunListener...starting");
	}

	@Override
	public void environmentPrepared(ConfigurableEnvironment environment) {
		Object o = environment.getSystemProperties().get("os.name");
		System.out.println("HelloSpringApplicationRunListener...environmentPrepared: " + o);
	}

	@Override
	public void contextPrepared(ConfigurableApplicationContext context) {
		System.out.println("HelloSpringApplicationRunListener...contextPrepared");
	}

	@Override
	public void contextLoaded(ConfigurableApplicationContext context) {
		System.out.println("HelloSpringApplicationRunListener...contextLoaded");
	}

	@Override
	public void finished(ConfigurableApplicationContext context, Throwable exception) {
		System.out.println("HelloSpringApplicationRunListener...finished");
	}
}
