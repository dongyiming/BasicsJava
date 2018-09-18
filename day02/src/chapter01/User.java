package chapter01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("user")
public class User {

	public String name;
	public Integer age;
	@Autowired
	public Car car;

	public User() {

	}

	public User(String name, Integer age, Car car) {
		System.out.println("User(String name,Integer age,Car car)!!");
		this.name = name;
		this.age = age;
		this.car = car;
	}

	public void into() {
		System.out.println("初始化方法");
	}

	public void destroy() {
		System.out.println("销毁方法");
	}

	public String getName() {
		return name;
	}

	@Value("tom")
	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	public  String toString() {
		return "User [name = " +name + ",age=" + age + ", car=" + car + "]";
		
	}

}
