package cn.xfsoft.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import cn.xfsoft.service.UserService;
import cn.xfsoft.service.UserServiceImpl;
//动态代理
public class UserServiceProxyFactor implements InvocationHandler {
	private UserService us;

	public UserServiceProxyFactor(UserService us) {
		super();
		this.us = us;
	}

	public UserService getUserServiceProxy() {
		UserService usProxy = (UserService) Proxy.newProxyInstance(UserServiceProxyFactor.class.getClassLoader(),
				UserServiceImpl.class.getInterfaces(), this);

		return usProxy;
	}

	@Override
	public Object invoke(Object arg0, Method method, Object[] arg2) throws Throwable {
		System.out.println("打开事务");
		Object invoke = method.invoke(us, arg2);
		System.out.println("提交事务");
		return invoke;
	}
}
