package cn.xfsoft.service;

public class UserServiceImpl implements UserService {

	@Override
	public void save() {
		System.out.println("保存用户");

	}

	@Override
	public void delete() {
		System.out.println("删除用户");
	}

	@Override
	public void upda() {
		System.out.println("更新用户");
	}

	@Override
	public void find() {
		System.out.println("查找用户");

	}

}
