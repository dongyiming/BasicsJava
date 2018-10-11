package com.xfsoft.mybatis.pojo;

import java.io.Serializable;
import java.util.List;

public class QueryVo implements Serializable {

	private static final long serialVersionUID = 1L;

	List<Integer> ids;
	Integer[] idss;
	private User user;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public Integer[] getIdss() {
		return idss;
	}

	public void setIdss(Integer[] idss) {
		this.idss = idss;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
