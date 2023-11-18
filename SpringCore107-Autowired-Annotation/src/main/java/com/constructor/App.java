package com.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Autowire at constructor injection

public class App 
{
    public static void main( String[] args )
    {
       
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autoWiredConstructor.xml");
    	
    	Honda h = (Honda)context.getBean("id1");
    	System.out.println(h);
    	context.close();
    }
}
