package com.two;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Constructor Injection value as attribute

public class App 
{
    public static void main( String[] args )
    {
        
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("attribute.xml");
    	
    	Location l = (Location)context.getBean("id1");
    
    	System.out.println(l);
    	
     }
}
