package chapter03;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController {
	@Resource(name ="userService")
	private UserService userservice;
	
	public void save() {
		this.userservice.save();
		System.out.println("usercontroller......save......");
	}
	
	
	
}
