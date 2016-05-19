package com.jugalpanchal.springframework.springmavenprototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    Car car = (Car) context.getBean("car");

	    String name = car.getName();
	    System.out.println("Car Name : " + name);
    }
}
