package com.xfsoft.mybatis.junit;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import javax.websocket.Session;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.xfsoft.mybatis.dao.UserDao;
import com.xfsoft.mybatis.dao.UserDaoImpl;
import com.xfsoft.mybatis.pojo.User;

public class MybatisDaoTest {

	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void before() throws Exception {
		// 加载核心配置文件
		String resource = "SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 创建工厂
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		

	}
	//通过Id查询
	@Test
	public void testFindById() throws Exception {

		UserDao userdao = new UserDaoImpl(sqlSessionFactory);
		User user = userdao.selectUserById(1);
		System.out.println(user);
	}
	//通过用户名模糊查询
	@Test
	public void testFindUserByUsername() throws Exception {

		UserDao userdao = new UserDaoImpl(sqlSessionFactory);
		List<User> user = userdao.selectUserByUsername("王");
		System.out.println(user);
	}
	//添加用户
	@Test
	public void testInsertUser() throws Exception {

		UserDao userdao = new UserDaoImpl(sqlSessionFactory);
		
		User user = new User();
		user.setUsername("treyrgfdsgfd");
		user.setBirthday(new Date());
		user.setAddress("dsadsad");
		user.setSex("2");
		
		userdao.insertUser(user);
		
		
	}
}

