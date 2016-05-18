package com.jugalpanchal.springframework.springsimpleprototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    Car car = (Car) context.getBean("car");

	    String name = car.getName();
	    System.out.println("Car Name : " + name);
	}

}
