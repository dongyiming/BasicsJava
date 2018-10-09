package com.xfsoft.mybatis.junit;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.xfsoft.mybatis.pojo.User;

public class MybatisTest {
	// 通过id查询用户
	@Test
	public void testMybatis() throws Exception {

		// 加载核心配置文件
		String resource = "SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 创建工厂
		SqlSessionFactory sqlsessionfactory = new SqlSessionFactoryBuilder().build(in);
		// 创建session
		SqlSession sqlSession = sqlsessionfactory.openSession();

		// 执行语句

		User user = sqlSession.selectOne("test.findById", 10);
		System.out.println(user);
	}

	// 通过用户名模糊查询
	@Test
	public void testFindUserByUsername() throws Exception {

		// 加载核心配置文件
		String resource = "SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 创建工厂
		SqlSessionFactory sqlsessionfactory = new SqlSessionFactoryBuilder().build(in);
		// 创建session
		SqlSession sqlSession = sqlsessionfactory.openSession();

		// 执行语句

		List<User> user2 = sqlSession.selectList("test.findUserByUsername", "五");
		System.out.println(user2);
	}

	// 添加用户
	@Test
	public void testInsertUser() throws Exception {

		// 加载核心配置文件
		String resource = "SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 创建工厂
		SqlSessionFactory sqlsessionfactory = new SqlSessionFactoryBuilder().build(in);
		// 创建session
		SqlSession sqlSession = sqlsessionfactory.openSession();

		// 执行语句

		User user = new User();
		user.setUsername("嗯dasdas ");
		user.setBirthday(new Date());
		user.setAddress("dsadsad");
		user.setSex("2");

		int i = sqlSession.insert("test.insertUser", user);
		sqlSession.commit();

		System.out.println(user.getId());
	}

	// 更新用户
	@Test
	public void testUpdateUser() throws Exception {

		// 加载核心配置文件
		String resource = "SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 创建工厂
		SqlSessionFactory sqlsessionfactory = new SqlSessionFactoryBuilder().build(in);
		// 创建session
		SqlSession sqlSession = sqlsessionfactory.openSession();

		// 执行语句

		User user = new User();

		user.setId(29);
		user.setUsername("fdsfsdf ");
		user.setBirthday(new Date());
		user.setAddress("dsadsad");
		user.setSex("1");

		int i = sqlSession.update("test.updateUser", user);
		sqlSession.commit();
	}

	// 删除用户
	@Test
	public void testDeleteUser() throws Exception {

		// 加载核心配置文件
		String resource = "SqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		// 创建工厂
		SqlSessionFactory sqlsessionfactory = new SqlSessionFactoryBuilder().build(in);
		// 创建session
		SqlSession sqlSession = sqlsessionfactory.openSession();

		// 执行语句

		sqlSession.delete("test.deleteUser", 29);
		sqlSession.commit();
	}

}
