package cn.xfsoft.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {

	public void before() {
		System.out.println("前置通知");
	}

	public void afterReturning() {
		System.out.println("后置通知，出现异常不会调用");
	}

	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕通知之前的部分");
		Object proceed = pjp.proceed();
		System.out.println("环绕通知之后的部分");

		return proceed;
	}

	public void afterException() {
		System.out.println("异常拦截通知");
	}

	public void after() {
		System.out.println("后置通知，出现异常也会调用");
	}
}
