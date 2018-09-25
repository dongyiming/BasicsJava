package cn.xfsoft.spring;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import cn.xfsoft.service.UserService;
import cn.xfsoft.service.UserServiceImpl;

public class UserServiceProxyFactor2 implements MethodInterceptor{

	public UserService getUserServiceProxy() {
		Enhancer en = new Enhancer();//生成代理对象
		en.setSuperclass(UserServiceImpl.class);//设置对谁代理
		en.setCallback(this);//代理做什么
		UserService us = (UserService) en.create();
		return us;
	}

	@Override
	public Object intercept(Object proxyobj, Method method, Object[] arg, MethodProxy methodProxy) throws Throwable {
		System.out.println("打开事务");
		Object returnValue = methodProxy.invokeSuper(proxyobj, arg);
		System.out.println("提交事务");
		return returnValue;
	}
}
