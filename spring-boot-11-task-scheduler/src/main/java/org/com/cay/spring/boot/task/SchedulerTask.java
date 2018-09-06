package org.com.cay.spring.boot.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Cay on 2018/5/30.
 */
@Component
public class SchedulerTask {

	@Scheduled(cron = "0/5 * * * * *")
	public void task(){
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
	}
}
