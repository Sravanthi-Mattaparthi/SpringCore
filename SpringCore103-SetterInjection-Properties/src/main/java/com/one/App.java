package com.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("properties.xml");
    	Honda h = (Honda) context.getBean("id1");
    	System.out.println(h.getModels());
    	
    }
}
