package chapter01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
	public String name;
	public String color;
	public Car() {
		
	}
	
	public Car(String name,String color) {
		System.out.println("Car(String name,String color)!!");
		this.name=name;
		this.color=color;
	}
	public String getName() {
		return name;
	}
	@Value("ÂêÉ¯À­µÙ")
	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}
	@Value("red")
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return  "Car [name = " + name +"color = "+ color +"]";
	}
}
