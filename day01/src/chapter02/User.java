package chapter02;

import java.util.List;

public class User {
	private String username;
	private Integer password;
	private List<String> list;

	/*
	 * 1.使用构造方法 提供所有参数的有参构造方法
	 * 
	 */

	public User(String username, Integer password, List<String> list) {
		super();
		this.username = username;
		this.password = password;
		this.list = list;
	}

	/*
	 * 2.使用设值注入 提供默认空参构造方法； 为参数提供setter方法
	 * 
	 */
	public User() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "User [username = " + username + ",password=" + password + ", list=" + list + "]";
	}
}
