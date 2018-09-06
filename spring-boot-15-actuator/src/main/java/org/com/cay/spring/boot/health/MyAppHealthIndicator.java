package org.com.cay.spring.boot.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by Cay on 2018/6/5.
 */

/**
 * 自定义HealthIndicator：
 * 1、编写一个类，实现HealthIndicator接口，
 * 2、类名必须是：xxxHealthIndicator
 * 3、加入容器中
 * 4、访问ip:port/health
 */
@Component
public class MyAppHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		//自定义的检查方法

		//return Health.up().build();
		return Health.down().withDetail("msg", "服务不可用").build();
	}
}
