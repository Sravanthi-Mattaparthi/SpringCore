package com.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Constructor Injection value as element

public class App 
{
    public static void main( String[] args )
    {
        
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("element.xml");
    	
    	Location l = (Location)context.getBean("id1");
    
    	System.out.println(l);
    	
     }
}
