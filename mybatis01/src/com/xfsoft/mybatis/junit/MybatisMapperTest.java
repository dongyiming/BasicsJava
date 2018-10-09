package com.xfsoft.mybatis.junit;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.xfsoft.mybatis.mapper.UserMapper;
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
}
