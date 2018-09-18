package chapter01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	@Test
	public void Test(){
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		User user = (User) ac.getBean("user");
		
		
		System.out.println(user);
	}
}
