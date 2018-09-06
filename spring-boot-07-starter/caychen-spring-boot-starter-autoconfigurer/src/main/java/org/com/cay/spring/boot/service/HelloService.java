package org.com.cay.spring.boot.service;

import org.com.cay.spring.boot.properties.HelloProperties;

/**
 * Created by Cay on 2018/5/20.
 */
public class HelloService {
	private HelloProperties helloProperties;

	public HelloProperties getHelloProperties() {
		return helloProperties;
	}

	public void setHelloProperties(HelloProperties helloProperties) {
		this.helloProperties = helloProperties;
	}

	public String sayHello(String name){
		return helloProperties.getPrefix() + "-" + name + "-" + helloProperties.getSuffix();
	}
}
