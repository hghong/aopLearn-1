package com.hong;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * 定义一个 advice
 * @author hong
 */
public class SleepHelper implements MethodBeforeAdvice, AfterReturningAdvice{

	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("起床了，刷牙洗脸");
	}

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("睡前来一发");
	}
}
