package org.com.cay.spring.boot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Cay on 2018/5/20.
 */
@ConfigurationProperties(prefix = "caychen.hello")
public class HelloProperties {
	private static final String PREFIX = "PREIX";
	private static final String SUFFIX = "SUFFIX";

	private String prefix = PREFIX;
	private String suffix = SUFFIX;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
}
