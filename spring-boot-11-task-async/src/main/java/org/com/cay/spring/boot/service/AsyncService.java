package org.com.cay.spring.boot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * Created by Cay on 2018/5/30.
 */
@Service
public class AsyncService {

	@Async
	public Future<String> task1() throws InterruptedException {
		System.out.println("task1开始数据处理...");
		long s = System.currentTimeMillis();
		Thread.sleep(1000);
		System.out.println("task1任务耗时:"+(System.currentTimeMillis() - s) + "ms");
		return new AsyncResult<>("task1执行完毕");
	}

	@Async
	public Future<String> task2() throws InterruptedException {
		System.out.println("task2开始数据处理...");
		long s = System.currentTimeMillis();
		Thread.sleep(2000);
		System.out.println("task2任务耗时:"+(System.currentTimeMillis() - s) + "ms");
		return new AsyncResult<>("task2执行完毕");
	}

	@Async
	public Future<String> task3() throws InterruptedException {
		System.out.println("task3开始数据处理...");
		long s = System.currentTimeMillis();
		Thread.sleep(3000);
		System.out.println("task3任务耗时:"+(System.currentTimeMillis() - s) + "ms");
		return new AsyncResult<>("task3执行完毕");
	}
}
