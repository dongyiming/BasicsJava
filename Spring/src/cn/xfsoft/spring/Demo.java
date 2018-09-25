package cn.xfsoft.spring;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sun.javaws.ui.ApplicationIconGenerator;

import cn.xfsoft.service.UserService;
import cn.xfsoft.service.UserServiceImpl;
public class Demo {

	@Test
	public void fun1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = (UserService) ac.getBean("userService");
		us.save();
		
//		UserService us = new UserServiceImpl();
//		UserServiceProxyFactor factor = new UserServiceProxyFactor(us);
//		UserService usProxy = factor.getUserServiceProxy();
//		usProxy.save();
	}
	
	
//	@Test
//	public void fun2() {
//		UserServiceProxyFactor2 factor = new UserServiceProxyFactor2();
//		UserService usProxy = factor.getUserServiceProxy();
//		usProxy.delete();
//	}
}
