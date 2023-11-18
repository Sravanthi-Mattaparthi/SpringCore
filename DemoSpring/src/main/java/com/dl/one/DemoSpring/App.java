package com.dl.one.DemoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
//        car c = new car();     // objects depend on class car
//        c.drive();
//        

//        
//        bike b = new bike();    //  objects depend on class bike
//        b.drive();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
        Vehicle obj = (Vehicle) context.getBean("vehicle");  //type conversion
        obj.drive();
    }
}
