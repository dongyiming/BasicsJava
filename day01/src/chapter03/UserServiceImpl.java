package chapter03;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource(name="userDao")
	private UserDao userdao;
	@Override
	public void save() {
		this.userdao.save();
		System.out.println("userservice.......save...");

	}

}
