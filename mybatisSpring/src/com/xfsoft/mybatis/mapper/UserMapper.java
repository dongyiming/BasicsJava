package com.xfsoft.mybatis.mapper;

import java.util.List;

import com.xfsoft.mybatis.pojo.User;

public interface UserMapper {

	public List<User> findByUsername(String username);
}
