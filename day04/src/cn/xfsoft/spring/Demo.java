package cn.xfsoft.spring;

import org.junit.Test;

import cn.xfsoft.service.UserService;
import cn.xfsoft.service.UserServiceImpl;

public class Demo {
	
	@Test
	public void fun1() {
		UserService us = new UserServiceImpl();
		UserServiceProxyFactor factor = new UserServiceProxyFactor(us);
		UserService usProxy = factor.getUserServiceProxy();
		usProxy.save();
	}
	
	
	@Test
	public void fun2() {
		UserServiceProxyFactor2 factor = new UserServiceProxyFactor2();
		UserService usProxy = factor.getUserServiceProxy();
		usProxy.delete();
	}
}
