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

public class MybatisMapperTest {
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
	public void testFindById() throws Exception {
		SqlSession sqlSession = SqlSessionFactory.openSession();

		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

		User user = userMapper.findById(1);
		System.out.println(user);
	}

	@Test
	public void testFindByQueryVo() throws Exception {
		SqlSession sqlSession = SqlSessionFactory.openSession();

		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

		QueryVo vo = new QueryVo();
		User us = new User();
		us.setUsername("五");
		vo.setUser(us);

		List<User> user = userMapper.findUserByQueryVo(vo);
		for (User u : user) {
			System.out.println(u);

		}
	}

	@Test
	public void testCount() throws Exception {
		SqlSession sqlSession = SqlSessionFactory.openSession();

		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

		Integer i = userMapper.Count();
		System.out.println(i);
	}

	@Test
	public void testOrder() throws Exception {
		SqlSession sqlSession = SqlSessionFactory.openSession();

		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

		List<Order> selectOrder = orderMapper.selectOrder();
		for (Order order : selectOrder) {
			System.out.println(order);
		}
	}

	@Test
	public void testFindBySexAndUsername() throws Exception {
		SqlSession sqlSession = SqlSessionFactory.openSession();

		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = new User();
		user.setSex("1");
		// user.setUsername("张三丰");
		List<User> user1 = userMapper.findBySexAndUsername(user);
		for (User user2 : user1) {
			System.out.println(user2);
		}
	}

	@Test
	public void testFindByIds() throws Exception {
		SqlSession sqlSession = SqlSessionFactory.openSession();

		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(16);
		ids.add(24);
		ids.add(25);
	/*	QueryVo vo = new QueryVo();
		vo.setIds(ids);
		List<User> user1 = userMapper.findByIds(vo);*/
		List<User> user1 = userMapper.findByids(ids);
		for (User user2 : user1) {
			System.out.println(user2);

		}
	}
	@Test
	public void testFindByIdss() throws Exception {
		SqlSession sqlSession = SqlSessionFactory.openSession();

		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		Integer[] idss = new Integer[3];
		idss[0]=1;
		idss[1]=16;
		idss[2]=26;
	/*	QueryVo vo = new QueryVo();
		vo.setIdss(idss);
		List<User> user1 = userMapper.findByIdss(vo);*/
		List<User> user1 = userMapper.findByidss(idss);
		for (User user2 : user1) {
			System.out.println(user2);

		}
	}
}