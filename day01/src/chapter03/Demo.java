package chapter03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserController uc = (UserController) ac.getBean("userController");
		uc.save();
	}
	
	
	
}
