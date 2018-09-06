package org.com.cay.spring.boot.exception;

/**
 * Created by Cay on 2018/5/6.
 */
public class NotExistException extends RuntimeException {

	public NotExistException() {
		super("数据不存在...");
	}
}
