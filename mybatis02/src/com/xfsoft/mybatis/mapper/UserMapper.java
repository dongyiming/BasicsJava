package com.xfsoft.mybatis.mapper;

import java.util.List;

import com.xfsoft.mybatis.pojo.QueryVo;
import com.xfsoft.mybatis.pojo.User;

public interface UserMapper {

	public User findById(Integer id);

	public List<User> findUserByQueryVo(QueryVo vo);

	public Integer Count();
	
	public List<User> findBySexAndUsername(User user);
	
	public List<User> findByIds(QueryVo vo);

	public List<User> findByIdss(QueryVo vo);

	public List<User> findByidss(Integer[] idss);
	
	public List<User> findByids(List<Integer> ids);
}
