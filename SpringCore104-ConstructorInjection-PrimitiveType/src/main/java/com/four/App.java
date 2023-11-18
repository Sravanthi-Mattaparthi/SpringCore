package com.four;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Constructor Injection value as pcnameSpace

public class App 
{
    public static void main( String[] args )
    {
        
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cSchema.xml");
    	
    	Location l = (Location)context.getBean("id1");
    
    	System.out.println(l);
    	
     }
}
