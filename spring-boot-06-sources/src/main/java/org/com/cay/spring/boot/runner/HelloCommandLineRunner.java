package org.com.cay.spring.boot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by Cay on 2018/5/18.
 */

@Component
public class HelloCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("HelloCommandLineRunner...run: " + Arrays.asList(args));
	}
}
