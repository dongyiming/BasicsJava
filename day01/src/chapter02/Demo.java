package chapter02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println(ac.getBean("user1"));
		System.out.println(ac.getBean("user2"));
	}
	
	
	
}
 