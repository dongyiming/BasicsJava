package com.xfsoft.mybatis.mapper;

import java.util.List;

import com.xfsoft.mybatis.pojo.Order;
import com.xfsoft.mybatis.pojo.User;

 public interface OrderMapper {

	public List<Order> selectOrder();
	
	public List<Order> selectOrderList();
	
	public List<User> selectUserList();
}
