package com.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Autowire at setter injection

public class App 
{
    public static void main( String[] args )
    {
       
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autoWiredSetter.xml");
    	
    	Honda h = (Honda)context.getBean("id1");
    	System.out.println(h);
    	context.close();
    }
}
