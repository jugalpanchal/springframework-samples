package com.jugalpanchal.springframework.springmavenprototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/* Unit test */
public class AppTest 
    extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }

    /* @return the suite of tests being tested */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    
    public void testApp()
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    Car car = (Car) context.getBean("car");

	    String actualName = car.getName();
	    
	    String expectedName = "I20";
	    assertEquals(expectedName, actualName);
    }
}
