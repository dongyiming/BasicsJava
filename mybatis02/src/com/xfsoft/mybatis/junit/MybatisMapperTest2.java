package com.xfsoft.mybatis.junit;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.xfsoft.mybatis.mapper.OrderMapper;
import com.xfsoft.mybatis.mapper.UserMapper;
import com.xfsoft.mybatis.pojo.Order;
import com.xfsoft.mybatis.pojo.QueryVo;
import com.xfsoft.mybatis.pojo.User;

public class MybatisMapperTest2 {
	private SqlSessionFactory SqlSessionFactory;

	@Before
	public void before() throws Exception {
		// 加载核心配置文件
		String resource = "SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 创建工厂
		SqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

	}

	@Test
	public void testSelectOrderList() throws Exception {
		SqlSession sqlSession = SqlSessionFactory.openSession();

		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		
		List<Order> selectOrderList = orderMapper.selectOrderList();
		
		for (Order order : selectOrderList) {
			System.out.println(order);
		}
	}
	
	@Test
	public void testSelectUserList() throws Exception {
		SqlSession sqlSession = SqlSessionFactory.openSession();

		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		List<User> selectUserList = orderMapper.selectUserList();
		for (User user : selectUserList) {
			System.out.println(user);
		}
	}
}