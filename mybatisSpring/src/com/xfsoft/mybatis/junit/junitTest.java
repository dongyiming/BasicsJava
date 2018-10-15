package com.xfsoft.mybatis.junit;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xfsoft.mybatis.mapper.UserMapper;
import com.xfsoft.mybatis.pojo.User;

public class junitTest {
@Test
public void testFindByUsername() throws Exception {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		UserMapper userMapper = ac.getBean(UserMapper.class);
		//UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
		List<User> user1 = userMapper.findByUsername("王");
		System.out.println(user1);
	
	}
}
