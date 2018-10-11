package com.xfsoft.mybatis.dao;

import java.util.List;

import com.xfsoft.mybatis.pojo.User;

public interface UserDao {
	public User selectUserById(Integer id);

	public List<User> selectUserByUsername(String username);

	public void insertUser(User user);
}
