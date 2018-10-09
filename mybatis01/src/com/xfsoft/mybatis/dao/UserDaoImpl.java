package com.xfsoft.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.xfsoft.mybatis.pojo.User;

public class UserDaoImpl implements UserDao {
		//注入
		private SqlSessionFactory sessionFactory;

		public UserDaoImpl(SqlSessionFactory sessionFactory) {
			super();
			this.sessionFactory = sessionFactory;
		}
		
		
		//通过ID查询
		public User selectUserById(Integer id) {
			SqlSession sqlSession = sessionFactory.openSession();
			
			return sqlSession.selectOne("test.findById", id);
		}

		//通过用户名模糊查询
		public List<User> selectUserByUsername(String username) {
			SqlSession sqlSession = sessionFactory.openSession();
			
			return sqlSession.selectList("test.findUserByUsername",username);
		}
		//添加用户
		public void insertUser(User user) {
			SqlSession sqlSession = sessionFactory.openSession();
			sqlSession.insert("test.insertUser",user);
			sqlSession.commit();
			
	}
}
